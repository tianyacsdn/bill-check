package com.sinochem.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.sinochem")
@Configuration
@EnableAutoConfiguration
public class BillMain extends WebMvcConfigurerAdapter implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(BillMain.class,args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8080);
    }
}
