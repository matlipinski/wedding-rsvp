package pl.mlipinski.wedding.rsvp.web.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by mlipinski on 04.02.17.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/static/"};
    private final String WEBJARS_RESOURCE_LOCATION = "classpath:/META-INF/resources/webjars/";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
            registry.addResourceHandler("/webjars/**").addResourceLocations(WEBJARS_RESOURCE_LOCATION);

            registry.addResourceHandler("/static/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);

    }
}

