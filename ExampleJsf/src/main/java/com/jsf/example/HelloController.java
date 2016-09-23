package com.jsf.example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {

	public String showHello() {
		return "First ExampleJSF from managed bean";
	}
}