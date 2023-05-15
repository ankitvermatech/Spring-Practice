package com.springpractice.javaconfiguration.college.config;

import com.springpractice.javaconfiguration.college.classes.Principal;
import com.springpractice.javaconfiguration.college.classes.Teacher;
import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This is using @Component Scan for dependency Injection for creating beans
 */
@Configuration
@PropertySource("classpath:college-config.properties")
@ComponentScan(basePackages = "com.springpractice.javaconfiguration.college")
public class CollegeConfig {
}
