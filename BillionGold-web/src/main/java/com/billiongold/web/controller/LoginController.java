package com.billiongold.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.billiongold.business.service.user.UserService;
import com.billiongold.domain.user.User;
import com.billiongold.web.service.LogginService;

@Controller("loginController")
public class LoginController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("logginService")
	private LogginService logginService;
	
	@RequestMapping("/loggin")
	public ModelAndView loggin(@RequestParam("username") String username, 
			@RequestParam("password") String password, 
			@RequestParam(value = "captchaCode", required = false) String captchaCode) {
		ModelAndView view = new ModelAndView();
		User user = userService.findByUsername(username);
		if(logginService.checkPassword(user, password)) {
			view.setViewName("user/logginSuccess.jsp");
			view.addObject("user", user);
		} else {
			view.setViewName("user/logginFail.jsp");
		}
		return view;
	}
}
