package com.example.klinikos_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin-home")
    public String adminHomePage() { // renamed method to avoid conflict
        return "administrator/admin-main";
    }


    @GetMapping("/view-procedures")
    public String viewProceduresPage() {
        return "administrator/view-procedures";
    }

    @GetMapping("/create-procedure")
    public String procedureCreationPage() {
        return "administrator/create-procedure";
    }

    @GetMapping("/edit-procedure")
    public String procedureEditPage() {
        return "administrator/edit-procedure";
    }

    @GetMapping("/confirm-delete-procedure")
    public String confirmDeleteProcedurePage() { // renamed method to avoid conflict
        return "administrator/confirm-delete-procedure";
    }

    @GetMapping("/view-users")
    public String viewUsersPage() {
        return "administrator/view-users";
    }

    @GetMapping("/create-patient")
    public String createPatientPage() {
        return "administrator/create-patient";
    }

    @GetMapping("/edit-patient")
    public String editPatientPage() {
        return "administrator/edit-patient";
    }

    @GetMapping("/confirm-delete-user")
    public String confirmDeleteUserPage() {
        return "administrator/confirm-delete-user";
    }

    @GetMapping("/create-doctor")
    public String doctorCreationPage() { return "administrator/create-doctor";}

    @GetMapping("/edit-doctor")
    public String editDoctorPage() {
        return "administrator/edit-doctor";
    }
}
