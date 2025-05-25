package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        String hostname = System.getenv("HOSTNAME");
        model.addAttribute("hostname", hostname);
        return "index"; // /WEB-INF/index.jsp
    }

}
