/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Niks
 *
 */
@RestController
public class WebRestController {

	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World from Restful API";
	}
}
