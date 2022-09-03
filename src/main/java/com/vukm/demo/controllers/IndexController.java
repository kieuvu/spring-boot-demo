/**
 * 
 */
package com.vukm.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kieuvu
 *
 * Sep 2, 2022
 * 2:58:07 PM 
 */

@RestController
public class IndexController {
	@GetMapping("/")
	public List<String> index() {
		List<String> programmingLanguage = new ArrayList<>();
		programmingLanguage.add("Javascript");
		programmingLanguage.add("C");
		programmingLanguage.add("C#");
		programmingLanguage.add("Java");
		
		return programmingLanguage;
	}
}
