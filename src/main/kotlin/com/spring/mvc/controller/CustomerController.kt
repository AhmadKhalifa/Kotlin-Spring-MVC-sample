package com.spring.mvc.controller

import com.spring.mvc.model.Customer
import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import javax.validation.Valid

@Controller
@RequestMapping("/customer")
class CustomerController {

    @RequestMapping("/customer-form")
    fun showCustomerForm(model: Model): String {
        model.addAttribute("customer", Customer())
        return "customer-form"
    }

    @InitBinder
    fun initBinder(webDataBinder: WebDataBinder) {
        val stringTrimmerEditor = StringTrimmerEditor(true)
        webDataBinder.registerCustomEditor(String::class.java, stringTrimmerEditor)
    }

    @RequestMapping("/process-form")
    fun processForm(
            @Valid @ModelAttribute("customer") customer: Customer,
            bindingResult: BindingResult
    ) = if (bindingResult.hasErrors()) "customer-form" else "customer-registration-succeeded"
}