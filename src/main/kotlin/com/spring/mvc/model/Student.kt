package com.spring.mvc.model

import java.lang.StringBuilder

class Student(

        var firstName: String? = null,
        var lastName: String? = null,
        val gender: String? = null,
        var country: String? = null,
        var programmingLanguage: Array<String> = arrayOf(),
        val language: String? = null
) {
    val programmingLanguageText
    get() = programmingLanguage.toText()
}
fun Array<String>.toText() = StringBuilder().let { stringBuilder ->
    if (isEmpty()) {
        stringBuilder.append("No programming languages")
    } else {
        stringBuilder.append("Programming languages: [ ")
        forEachIndexed { index, programmingLanguage ->
            stringBuilder.append(programmingLanguage)
            if (index < size - 1) {
                stringBuilder.append(", ")
            } else {
                stringBuilder.append(" ]")
            }
        }
    }
    stringBuilder.toString()
}