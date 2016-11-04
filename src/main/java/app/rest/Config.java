package app.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class Config extends ResourceConfig {
    public Config() {
        register(MainController.class);
    }
}
