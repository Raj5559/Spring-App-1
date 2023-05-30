package com.example.in.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo1Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new FileSystemXmlApplicationContext("src//main//java//DemoCfg1.xml");
		Demo1Bean db=(Demo1Bean)context.getBean("db1");
		db.getAllBears();
		db.getAllCountries();
		db.getAllEmails();
		db.getAllMobiles();
		db.getAllTrainers();
		db.wish();
	}

}
