package com.ifsul.restaurante.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Restaurante")
                        .description("API que retorna dados de um restaurante")
                        .version("0.0.2") // alterei coisas ent adicionei mais 0.0.1 :D
                        .contact(new Contact()
                                .name("João Guilherme Severo Schröer")
                                .email("joaoguilhermeseveroschroer2@gmail.com")));
    }
}