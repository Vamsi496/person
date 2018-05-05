package com.mypack.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/person")
public class PersonController {
	
	@RequestMapping(method=RequestMethod.GET, path="/")
	public @ResponseBody String home() {
		return "Hi.. Vamsi..";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/hello/{personName}")
	public @ResponseBody String sayHello(@PathVariable String personName) {
		System.out.println("Returning String:" + "Hello.. " + personName.toUpperCase() + "...");
		return "Hello.. " + personName.toUpperCase() + "...";
	}

}
