package com.example.klinikos_is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/patient-home")
    public String patientMainPage() {
        return "patient/patient-main";
    }

    @GetMapping("/view-recommended-procedures")
    public String viewRecommendedProceduresPage() {
        return "patient/view-recommended-procedures";
    }

    @GetMapping("/view-doctors")
    public String viewDoctorsPage() {
        return "patient/view-doctors";
    }

    @GetMapping("/view-single-doctor")
    public String viewSingleDoctorPage() {
        return "patient/view-single-doctor";
    }

    @GetMapping("/patient-view-procedure-reports")
    public String viewProcedureReportsPage() {
        return "patient/view-procedure-reports";
    }

    @GetMapping("/view-single-procedure-report")
    public String viewSingleProcedureReportPage() {
        return "patient/view-single-procedure-report";
    }

    @GetMapping("/view-referrals")
    public String viewReferralsPage() {
        return "patient/view-referrals";
    }

    @GetMapping("/view-single-referral")
    public String viewSingleReferralPage() {
        return "patient/view-single-referral";
    }

    @GetMapping("/view-reservations")
    public String viewReservationsPage() {
        return "patient/view-reservations";
    }

    @GetMapping("/edit-reservation")
    public String editReservationPage() {
        return "patient/edit-reservation";
    }

    @GetMapping("/create-reservation")
    public String createReservationPage() {
        return "patient/create-reservation";
    }

    @GetMapping("/confirm-delete-reservation")
    public String confirmDeleteReservationPage() {
        return "patient/confirm-delete-reservation";
    }

     @GetMapping("/confirm-delete-account")
    public String confirmDeleteAccountPage() { return "patient/confirm-delete-account"; }
}
