package security_sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;


@EnableResourceServer/*资源服务开启*/
@SpringBootApplication
public class SecuritySsoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SecuritySsoApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){ return new RestTemplate(); }

}
