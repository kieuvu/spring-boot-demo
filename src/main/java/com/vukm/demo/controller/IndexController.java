/**
 * 
 */
package com.vukm.demo.controller;

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
		programmingLanguage.add("JS");
		programmingLanguage.add("C#");
		programmingLanguage.add("Javascript");
		
		return programmingLanguage;
	}
}
