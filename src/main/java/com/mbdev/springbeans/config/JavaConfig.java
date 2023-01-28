package com.mbdev.springbeans.config;

import com.mbdev.springbeans.controller.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService() {
        return new JavaConfigService();
    }
}
