package com.fielder.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.pluralsight.jacket.security.service.models.JacketUser;
//import com.pluralsight.jacketweb.viewmodels.AuthenticationUser;
//import com.pluralsight.jacketweb.viewmodels.RegistrationUser;

@Controller
public class AuthenticationController {
	//Log log;
	
	
//	@Inject
//	public AuthenticationController(Log log, JacketUserService jacketUserService) {
//		log.debug("*********Login ctor");
//		this.log = log;
//		this.jacketUserService = jacketUserService;
//	}

//	@RequestMapping(value = "/account/login")
//	public String login(Model model) {
//		model.addAttribute("authenticationUser", new AuthenticationUser());
//		return "authenticate/login";
//	}
//
//	@RequestMapping(value = "/account/register", method=RequestMethod.GET)
//	public String register(Model model) {
//		model.addAttribute("registrationUser", new RegistrationUser());
//		return "authenticate/register";
//	}
//	
//	@RequestMapping(value = "/account/register", method=RequestMethod.POST)
//	public String register(@Valid RegistrationUser registrationUser, BindingResult result, Model model) {
//		
//		if(result.hasErrors()) {
//			model.addAttribute("registrationUser", registrationUser);
//            return "authenticate/register";
//        }
//		JacketUser jacketUser = new JacketUser();
//		
//		jacketUser.setEmail(registrationUser.getEmail());
//		jacketUser.setFirstName(registrationUser.getFirstName());
//		jacketUser.setLastName(registrationUser.getLastName());
//		jacketUser.setPassword(registrationUser.getPassword());
//		jacketUser.setRepeatPassword(registrationUser.getRepeatPassword());
//		
////		try {
////			jacketUserService.registerNewUserAccount(jacketUser);
////		} catch (EmailExistsException e) {
////			return register(model);
////		}
//		return "redirect:/";
//	}

}
