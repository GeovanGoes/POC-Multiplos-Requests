/**
 * 
 */
package br.com.pocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author geovan.goes
 *
 */
@SpringBootApplication
public class Principal extends SpringBootServletInitializer
{

	public static void main(String[] args)
	{
		SpringApplication.run(Principal.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
        return application.sources(Principal.class);
    }
}
