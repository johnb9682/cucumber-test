package com.envision.cucumbertest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author john.bi
 */
@Configuration
@ComponentScan(basePackages = {
        "com.envision.cucumbertest.employee"
})
public class SystemConfiguration {
}
