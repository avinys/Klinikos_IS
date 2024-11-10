package com.example.klinikos_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctor-home")
    public String doctorMainPage() {
        return "doctor/doctor-main";
    }

    @GetMapping("/doctor-view-procedure-reports")
    public String viewProcedureReportsPage() {
        return "doctor/view-procedure-reports";
    }

    @GetMapping("/edit-procedure-report")
    public String editProcedureReportPage() {
        return "doctor/edit-procedure-report";
    }

    @GetMapping("/schedule")
    public String schedulePage() {
        return "doctor/schedule";
    }

    @GetMapping("/create-referral")
    public String createSendPage() {
        return "doctor/create-referral";
    }

    @GetMapping("/view-patients")
    public String viewPatientsPage() {
        return "doctor/view-patients";
    }

    @GetMapping("/view-single-patient")
    public String viewSinglePatientPage() {
        return "doctor/view-single-patient";
    }
}
