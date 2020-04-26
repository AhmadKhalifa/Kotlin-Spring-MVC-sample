package com.spring.mvc.model

import com.spring.mvc.validation.CourseCode
import javax.validation.constraints.*

class Customer {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    var firstName: String? = null

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 characters")
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    var lastName: String? = null

    @CourseCode("LUV", message = "a7a")
    val courseCode: String? = null

    @NotNull
    @Min(value = 1)
    @Max(value = 10)
    val age: Int? = null
}