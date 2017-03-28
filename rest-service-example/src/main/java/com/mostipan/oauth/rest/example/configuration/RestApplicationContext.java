package com.mostipan.oauth.rest.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by anton on 04.03.17.
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.mostipan.oauth.resource.*", "com.mostipan.oauth.rest.*"})
@PropertySource("classpath:rest.properties")
public class RestApplicationContext {
}
