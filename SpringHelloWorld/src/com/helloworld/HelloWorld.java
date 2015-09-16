package com.helloworld;

import java.util.List;

public class HelloWorld implements Greeter {
	
	List<String> names;
	
	@Override
	public void setNames(List<String> names) {
		// TODO Auto-generated method stub
		this.names=names;	
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello world from " + names.get(0);
	}
	
}
