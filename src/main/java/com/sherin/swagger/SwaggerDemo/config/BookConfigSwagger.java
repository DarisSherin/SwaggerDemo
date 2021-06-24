package com.sherin.swagger.SwaggerDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class BookConfigSwagger {
	
    @Bean
    public Docket postApi() { 
        return new Docket(DocumentationType.SWAGGER_2)                                 
          .apiInfo(apiInfo()).select()            
          .paths(regex("^/book/.*$"))                          
          .build();                                           
    }
    
    private ApiInfo apiInfo() {
    	return new ApiInfoBuilder().title("Book service")
    			.description("SampleBook api info")
    			.license("sherin")
    			.licenseUrl("https://github.com/DarisSherin")
    			.version("1.0").build();
    }

}
