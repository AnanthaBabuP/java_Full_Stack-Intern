package com.text;

import java.util.ArrayList;

import com.dao.MobileDAO;
import com.model.App;
import com.model.Mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setMobile_name("Samsung Gaslaxcy Ultra");
		m.setMobile_company("Samsung");
		m.setMobile_price(25000.00);
		
		
		App app = new App();
		app.setApp_name("Instagram");
		app.setApp_size("1 TB");
		app.setApp_rating(4.5);
		
		App app2 = new App();
		app2.setApp_name("Gmail");
		app2.setApp_size("256 GB");
		app2.setApp_rating(4.7);
		
		java.util.Collection<App> cl1 = new ArrayList<>();
		cl1.add(app);
		cl1.add(app2);
		
		m.setApto(cl1);
		
		MobileDAO dao = new  MobileDAO();
		dao.save(m);
		
	}

}
