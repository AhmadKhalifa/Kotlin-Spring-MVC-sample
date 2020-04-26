package com.spring.mvc.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class CourseCodeValidator : ConstraintValidator<CourseCode, String> {

    private lateinit var coursePrefix: String

    override fun initialize(constraintAnnotation: CourseCode?) {
        coursePrefix = constraintAnnotation!!.value
    }

    override fun isValid(courseCode: String?, constraintValidatorContext: ConstraintValidatorContext?): Boolean {
        return courseCode?.startsWith(coursePrefix) ?: false
    }
}