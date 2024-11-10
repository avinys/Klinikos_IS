package com.example.klinikos_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/")
    public String mainLoginPage() { // renamed method to avoid conflict
        return "authentication/login";
    }

    @GetMapping("/main")
    public String mainPage() { // renamed method to avoid conflict
        return "main";
    }
}
