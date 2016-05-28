package com.jiajucamp.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghugh
 *
 */
@RestController
public class HomeController {
	
	@RequestMapping("/test")
	public String test() {
		return "hello world";
	}
	

}
