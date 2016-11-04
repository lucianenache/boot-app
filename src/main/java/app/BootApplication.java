package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
@EnableAsync
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class BootApplication {

    public static void main(String[] args) {
        SecurityContextHolder.getContext()
                .setAuthentication(new UsernamePasswordAuthenticationToken("user",
                        "12345",
                        AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER")));

        SpringApplication.run(BootApplication.class);
    }


}
