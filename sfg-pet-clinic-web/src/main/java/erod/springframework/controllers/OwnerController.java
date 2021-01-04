package erod.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erod.springframework.services.OwnerService;
@RequestMapping("owners")
@Controller
public class OwnerController {
	
	private OwnerService ownerService;
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","/index","/index.html"})
	public String listOwner(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "/owner/index";
	}
	
	@RequestMapping("/find")
	public String findOwners() {
		return "noImplemented";
	}

}
