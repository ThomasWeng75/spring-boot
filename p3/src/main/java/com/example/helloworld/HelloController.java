package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
	@GetMapping("/h1")
	public String h1()
	{
		return "h1";

	}

}
