package com.mostipan.oauth.auth.configuration.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by anton on 25.03.17.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mostipan.oauth.auth.*")
public class ApplicationContext {
}
