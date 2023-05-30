package com.example.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        
    	ApplicationContext ac=new FileSystemXmlApplicationContext("src//main//java//DemoCfg.xml");
    	
    	DemoBean db=(DemoBean)ac.getBean("db");
    	String result=db.wish();
    	System.out.println(result);
    }
}
