package com.spring.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/home")
class HomeController {

    @RequestMapping("/", method = [RequestMethod.GET])
    fun showHome(model: ModelMap): String {
        model.addAttribute("message", "Hello Spring MVC")
        return "home"
    }

    @RequestMapping("/showForm", method = [RequestMethod.GET])
    fun showForm() = "student-form"

    @RequestMapping("/processForm", method = [RequestMethod.GET])
    fun processForm() = "process-form"

    @RequestMapping("/processFormWithUpperCase", method = [RequestMethod.GET])
    fun processFormWithUpperCase(@RequestParam("studentName") studentName: String, model: Model): String {
        model.addAttribute("message", studentName.toLowerCase())
        return "home"
    }
}