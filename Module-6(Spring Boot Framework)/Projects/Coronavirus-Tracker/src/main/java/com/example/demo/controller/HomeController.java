package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;
import com.fasterxml.jackson.annotation.JsonAlias;

@Controller
public class HomeController 
{
	@Autowired
	CoronaVirusDataServices crnService;
	@GetMapping("/")
	public String home(Model model)
	{
		List<LocationStates> allstates=crnService.getAllstates();
		int totalDeathsReported=allstates.stream().mapToInt(stat->stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates",allstates);
		System.out.println(allstates.toString());
		model.addAttribute("totalDeathsReported",totalDeathsReported);
		return "home";
	}

	
	@GetMapping("/chartView")
	public String ChatView(Model model)
	{
		List<LocationStates> allstates=crnService.getAllstates();
		int totalDeathsReported=allstates.stream().mapToInt(stat->stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates",allstates);
		System.out.println(allstates.toString());
		model.addAttribute("totalDeathsReported",totalDeathsReported);
		return "home";
	}
}
