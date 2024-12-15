package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Controller
public class HomeController {
	@Autowired
	CoronaVirusDataServices crnService;

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStates> allstates = crnService.getAllstates();
		int totalDeathsReported = allstates.stream().mapToInt(stat -> stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates", allstates);
		System.out.println(allstates.toString());
		model.addAttribute("totalDeathsReported", totalDeathsReported);
		return "home";
	}

	@GetMapping("/chartView")
	public String ChatView(Model model) {
		try {
			List<LocationStates> allstates = crnService.getAllstates();
			int totalDeathsReported = allstates.stream().mapToInt(stat -> stat.getLatestTotalDeaths()).sum();
			ObjectMapper objectMapper = new ObjectMapper();
			String allStatesJson;

			allStatesJson = objectMapper.writeValueAsString(allstates);
			// Convert to JSON

			// Pass data to the frontend
			model.addAttribute("locationStatesJson", allStatesJson);
			System.out.println("Serialized JSON: " + allStatesJson);
			model.addAttribute("totalDeathsReported", totalDeathsReported);
			return "index";
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
	}
}
