package org.cibiogas.cibchartsapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
	
	@RequestMapping("/")
	public String index() {
		return "dashboard.html";
	}
	
	@RequestMapping("/colombari")
	public String colombariPage() {
		return "colombari.html";
	}
	
	@RequestMapping("/haacke")
	public String haackePage() {
		return "haacke.html";
	}
	
	@RequestMapping("/itaipu")
	public String itaipuPage() {
		return "itaipu.html";
	}
	
	@RequestMapping("/starmilk")
	public String starmilkPage() {
		return "starmilk.html";
	}
	
	@RequestMapping("/stein")
	public String steinPage() {
		return "stein.html";
	}

}
