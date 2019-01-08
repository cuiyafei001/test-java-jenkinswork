package com.somnam.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	  @GetMapping(value="/index")  
	   public String index() {
	      return "index";  
	     } 
	  
	  @RequestMapping(value="")  
	   public String nullz(@RequestParam String name) {
	      return name;  
	     } 
	
}
