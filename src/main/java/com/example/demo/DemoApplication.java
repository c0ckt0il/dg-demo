package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        String hostname = System.getenv("HOSTNAME");
	String namespace = System.getenv("NAMESPACE");

        model.addAttribute("hostname", hostname);
        model.addAttribute("namespace", namespace);

	return "index"; // /WEB-INF/index.jsp
    }

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "OK";
    }


}
