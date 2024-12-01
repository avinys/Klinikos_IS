package com.example.klinikos_is.controllers;

import org.h2.engine.Procedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.klinikos_is.repositories.ProcedureRepository;

import scala.collection.immutable.List;

@Controller
public class AdminController {
    
    @Autowired
    private ProcedureRepository procReposity;
    @GetMapping("/admin-home")
    public String adminHomePage() { // renamed method to avoid conflict
        return "administrator/admin-main";
    }


    @GetMapping("/view-procedures")
    public String viewProceduresPage(Model model) {
        java.util.List<com.example.klinikos_is.models.Procedure> procedures = procReposity.getAllProcedures();
        model.addAttribute("procedures", procedures);
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
    public String viewUsersPage(Model model) {
       
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
