package pl.smartcases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.smartcases.entity.Package;
import pl.smartcases.service.PackageService;

@Controller
public class PackageController {

	@Autowired
	private PackageService packageService;
	
	@ModelAttribute("package")
	private Package construct() {
		return new Package();
	}
	
	@RequestMapping("/packages")
	public String packages(Model model) {
		model.addAttribute("packages", packageService.findAll());
		return "packages";
	}
	
	@RequestMapping("/packages/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("package", packageService.findOneWithApp(id));
		return "package-detail";
	}
	
	@RequestMapping("/addpackage")
	public String showAdd() {
		return "add-package";
	}
	
	@RequestMapping(value="/addpackage", method=RequestMethod.POST)
	public String doAdd(@ModelAttribute("package") Package package1) {
		packageService.save(package1);
		return "add-package";
	}
	
}
