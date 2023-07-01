package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Demo1Controller {
	@RequestMapping(value = "/" ,  method =RequestMethod.GET )
	public String outDemoMessage(Model model){
		model.addAttribute("message", "Demo screen");
		return "index";
	}
}
