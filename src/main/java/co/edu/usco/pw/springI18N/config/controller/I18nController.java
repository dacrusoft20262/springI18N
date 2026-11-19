package co.edu.usco.pw.springI18N.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18nController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}