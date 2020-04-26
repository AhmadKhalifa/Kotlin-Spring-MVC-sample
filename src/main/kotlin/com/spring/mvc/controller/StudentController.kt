package com.spring.mvc.controller

import com.spring.mvc.model.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/student")
class StudentController {

    @RequestMapping("/registration-form", method = [RequestMethod.GET])
    fun showRegistrationFor(model: Model): String {
        model.addAttribute("student", Student())
        return "student-registration-form"
    }

    @RequestMapping("/registration-succeeded", method = [RequestMethod.GET])
    fun registrationSucceeded(@ModelAttribute("student") student: Student, model: Model) =
            "registration-succeeded"
}