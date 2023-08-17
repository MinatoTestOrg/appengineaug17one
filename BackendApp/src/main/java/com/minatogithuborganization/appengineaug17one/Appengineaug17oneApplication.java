package com.minatogithuborganization.appengineaug17one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import com.vs.rappit.jersey.webservice.mapper.JsonMessageConverter;
import com.vs.rappit.base.loader.file.SchemaFileLoader;
import com.vs.rappit.base.logic.ISearchFilterFormatter;
import com.vs.rappit.base.util.Constants;


@SpringBootApplication(scanBasePackages = {"com.vs.rappit","com.vs","com.minatogithuborganization.appengineaug17one"})
@EnableCaching
@OpenAPIDefinition(info = @Info(title = "'${module_name}'", version = "v1"))
@SecurityScheme(
   name = "RSESSION",
   type = SecuritySchemeType.APIKEY,
   in = SecuritySchemeIn.COOKIE,
   bearerFormat = "JWT"
)
public class Appengineaug17oneApplication {

	public static void main(String[] args) {
		SpringApplication.run(Appengineaug17oneApplication.class, args);
	}
	
	@Bean
	public JsonMessageConverter paginationRequestMapper() {
		return new JsonMessageConverter();
	}
	
	@Bean
    public SchemaFileLoader schemaFileLoader() {
        return new SchemaFileLoader(Constants.SCHEMA_FILE_NAME);
    }
	
	@Bean
	ISearchFilterFormatter searchFilterFormatter() {
	}
}
