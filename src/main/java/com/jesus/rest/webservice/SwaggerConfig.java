package com.jesus.rest.webservice;


import java.awt.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Class to configure and enable swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("a","b","c");
	// Default information that is shown in the localhost:8080/v2/api-docs
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("API doc","API doc",
			"1.0","urn:tos","hola","Apache 2.0","some url");

	@Bean		// define the bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);	
		
	}

}
