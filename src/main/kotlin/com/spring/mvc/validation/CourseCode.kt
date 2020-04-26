package com.spring.mvc.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [CourseCodeValidator::class])
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class CourseCode(
        val value: String = "LUV",
        val message: String = "Error",
        val groups: Array<KClass<*>> = [],
        val payload: Array<KClass<out Payload>> = []
)