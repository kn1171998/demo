/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5dc0d9f09ef7a1181f8e133e
*
* You will get 10% discount for each one of your friends
* 
*/
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication()
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	public static void main(String[] args) {
		System.out.println("\r\n\r\n-----------------------------------\r\n\r\nStarting demo \r\nGenerated by\r\n\r\n   _____ _          __  __      _     _           \r\n  / ____| |        / _|/ _|    | |   | |          \r\n | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __ \r\n  \\___ \\| |/ / _` |  _|  _/ _ \\| |/ _` |/ _ \\ '__|\r\n  ____) |   < (_| | | | || (_) | | (_| |  __/ |   \r\n |_____/|_|\\_\\__,_|_| |_| \\___/|_|\\__,_|\\___|_|   \r\n\r\nFor more documentation please visit https://skaffolder.com/#/documentation\r\n\r\n-----------------------------------\r\n\r\n");

		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CorsFilter corsFilter() {
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true); 
	    config.addAllowedOrigin("*");
	    config.addAllowedHeader("*");
	    config.addAllowedMethod("GET");
	    config.addAllowedMethod("POST");
	    config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PUT");
	    source.registerCorsConfiguration("/**", config);
	    return new CorsFilter(source);
	}
}
