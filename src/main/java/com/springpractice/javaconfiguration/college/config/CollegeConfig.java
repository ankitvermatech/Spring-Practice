package com.springpractice.javaconfiguration.college.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is using @Component Scan for dependency Injection for creating beans
 */
@Configuration
@ComponentScan(basePackages = "com.springpractice.javaconfiguration.college")
public class CollegeConfig {
}
