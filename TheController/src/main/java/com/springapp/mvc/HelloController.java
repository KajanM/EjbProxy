package com.springapp.mvc;

import com.arachchi.ejbproxy.core.ejb.EjbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ejb.EJB;

@Controller
@RequestMapping("/")
public class HelloController {

	@EJB
	EjbService ejbService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}