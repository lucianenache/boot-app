package app.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
/*
* If using jersey in combination with Spring Boot, the ApplicationPath should not be  /
* in order for the Spring Security to work.
* */
@ApplicationPath("/v1")
public class Config extends ResourceConfig {
    public Config() {
        register(MainController.class);
    }
}
