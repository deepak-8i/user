package com.excercise.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(Model model) {

		model.addAttribute("user", new User());
		return "addUser";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user) {

		System.out.println("user >>>> " + user);
		return "result";
	}
}
