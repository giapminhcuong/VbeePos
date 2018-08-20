package com.vbee.vbeepos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value= {"/", "/home"})
public class HomeController extends BaseController {

	@GetMapping(value="/")
	public String index() {
		return "home";
	}
	
}
