package pl.mlipinski.wedding.rsvp.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "pl.mlipinski.wedding.rsvp")
public class WeddigGuestRsvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeddigGuestRsvpApplication.class, args);
	}

	@Bean
	public AuthenticationTrustResolver getAuthenticationTrustResolver() {
		return new AuthenticationTrustResolverImpl();
	}
}
