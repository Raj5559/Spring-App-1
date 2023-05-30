package com.example.in.ac;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo1Bean implements Demo1 {

	private String username;
	private String[] mobiles;
	private List<String> bears;
	private Set<String> emails;
	private Map<Integer, String> countries;
	private Properties trainers;
	
	
	public Demo1Bean() {
		
	}
	
	

	public Demo1Bean(String username, String[] mobiles, List<String> bears, Set<String> emails,
			Map<Integer, String> countries, Properties trainers) {
		super();
		this.username = username;
		this.mobiles = mobiles;
		this.bears = bears;
		this.emails = emails;
		this.countries = countries;
		this.trainers = trainers;
	}

	@Override
	public void wish() {
		System.out.println("Welcome,"+username);

	}

	@Override
	public void getAllMobiles() {
		for (String mobile: mobiles) {
			System.out.println(mobile);
		}
		System.out.println("*******************************");
		
	}

	@Override
	public void getAllBears() {
		for (String bear : bears) {
			System.out.println(bear);
		}
		System.out.println("*******************************");
	}

	@Override
	public void getAllEmails() {
		Iterator<String> iterator=emails.iterator();
		while(iterator.hasNext()) {
			String email=iterator.next();
			System.out.println(email);
			System.out.println("*****************************");
		}
	}

	@Override
	public void getAllCountries() {
		for (Map.Entry<Integer, String> entry : countries.entrySet()) {
			Integer countryCode = entry.getKey();
			String countryName = entry.getValue();
			System.out.println("Country Code :"+countryCode);
			System.out.println("Country Name :"+countryName);
		}

	}

	@Override
	public void getAllTrainers() {
		
		for (Map.Entry<Object, Object> entry : trainers.entrySet()) {
			String countryCode =(String) entry.getKey();
			String countryName = (String)entry.getValue();
			System.out.println("Country Code :"+countryCode);
			System.out.println("Country Name :"+countryName);
		}
		
		
	}

}
