package com.example.helloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	// Method to return a greeting message
	public String getGreeting() {
		return "Hello, World!";
	}

	// Additional methods can be added here if needed
	public String getH1Message() {
		return "This is the h1 message.";
	}

	public String getH2Message() {
		return "This is the h2 message.";
	}
}
