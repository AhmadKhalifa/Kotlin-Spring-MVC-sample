package com.spring.mvc.security.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User

@Configuration
@EnableWebSecurity
open class SecurityConfiguration : WebSecurityConfigurerAdapter() {

    override fun configure(auth: AuthenticationManagerBuilder?) {
        val users = User.withDefaultPasswordEncoder()
        auth!!.inMemoryAuthentication()
                .withUser(users.username("khalifa").password("123").roles("ADMIN"))
                .withUser(users.username("ahmed").password("123").roles("EMPLOYEE"))
                .withUser(users.username("dina").password("123").roles("MANAGER"))
    }
}