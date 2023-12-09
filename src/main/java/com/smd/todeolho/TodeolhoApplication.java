package com.smd.todeolho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class TodeolhoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodeolhoApplication.class, args);
	}
   @Bean
   public OpenAPI usersMicroserviceOpenAPI() {
       return new OpenAPI()
               .info(new Info().title("Tô de Olho")
                                .description("API do sistema para monitoramento de obras públicas inacabadas")
                                .version("1.0"));
   }
}
