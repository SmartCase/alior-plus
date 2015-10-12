package pl.smartcases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.smartcases.service.ApplicationService;

@Controller
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping("/applications")
	public String applications(Model model) {
		model.addAttribute("applications", applicationService.findByEnvironment());
		return "applications";
	}
	
}
