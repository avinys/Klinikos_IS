package com.example.klinikos_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/")
    public String homePage() {
        // renamed method to avoid conflict
        return "redirect:/admin-home";
}

    @GetMapping("/create-doctor")
    public String doctorCreationPage() {
        return "administrator/create-doctor";
    }

    @GetMapping("/view-procedures")
    public String procedureOverviewPage() {
        return "administrator/view-procedures";
    }

    @GetMapping("/create-procedure")
    public String procedureCreationPage() {
        return "administrator/create-procedure";
    }

    @GetMapping("/edit-procedure")
    public String procedureEditingPage() {
        return "administrator/edit-procedure";
    }

    @GetMapping("/confirm-delete-procedure")
    public String confirmDeleteProcedurePage() { // renamed method to avoid conflict
        return "administrator/confirm-delete-procedure";
    }

    @GetMapping("/admin-home")
    public String adminHomePage() { // renamed method to avoid conflict
        return "administrator/main";
    }
}
