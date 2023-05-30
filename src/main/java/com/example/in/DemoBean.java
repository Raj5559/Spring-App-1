package com.example.in;

public class DemoBean implements Demo {

	private String name;
	private int age;
	
	
	
	public DemoBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	



	@Override
	public String wish() {

		return "Welcome," + name+" Your Age is :"+age;
	}

}
