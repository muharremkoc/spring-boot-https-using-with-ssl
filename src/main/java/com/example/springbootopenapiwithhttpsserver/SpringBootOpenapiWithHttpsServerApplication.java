package com.example.springbootopenapiwithhttpsserver;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class SpringBootOpenapiWithHttpsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpenapiWithHttpsServerApplication.class, args);
    }


}





