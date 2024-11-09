package com.example.kliniku_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String loginPage() { return "authentication/login";}

    @GetMapping("/logout")
    public String logoutPage() { return "redirect:/login";}

    @GetMapping("/recover-password")
    public String recoverPasswordPage() {
        return "authentication/recover-password";
    }
}