package com.example.in;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
        
    	FileSystemResource fsr=new FileSystemResource("src//main//java//DemoCfg.xml");
    	BeanFactory factory=new XmlBeanFactory(fsr);
    	DemoBean db=(DemoBean)factory.getBean("db");
    	String result=db.wish();
    	System.out.println(result);
    }
}
