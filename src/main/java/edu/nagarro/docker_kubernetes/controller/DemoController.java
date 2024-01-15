package edu.nagarro.docker_kubernetes.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class DemoController {

	@GetMapping("/demo")
	public String getMessage() {
		return "Welcome to Docker Kubernetes";
	}

}
