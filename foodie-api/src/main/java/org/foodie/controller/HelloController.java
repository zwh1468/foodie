package org.foodie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dahao
 */
@RestController
@RequestMapping("hello")
public class HelloController
{

	@GetMapping
	public String hello()
	{
		return "Hello";
	}
}
