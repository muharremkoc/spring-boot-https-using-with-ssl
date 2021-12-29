package com.example.springbootopenapiwithhttpsserver.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().addServersItem(new Server().url("http://localhost:5161").description("Generated default Url"))
                .addServersItem(new Server().url("https://localhost:5161").description("Generated security url"));


    }

}
