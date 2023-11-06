package br.com.usuarioapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Define o padrão de URL que você deseja permitir o acesso
                        .allowedOrigins("*") // Especifique os domínios permitidos (neste caso, permitindo de qualquer origem)
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Especifique os métodos HTTP permitidos
                        .allowedHeaders("*"); // Especifique os cabeçalhos permitidos
            }
        };
    }
}
