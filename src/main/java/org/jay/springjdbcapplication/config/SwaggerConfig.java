package org.jay.springjdbcapplication.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {



    @Bean
    public OpenAPI springJdbcOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Sping JDBC CRUD API")
                        .version("1.0.0")
                        .description("API Documentation for Employee Crud Operations using SpringJDBC and PostgreSQL"));
    }

}
