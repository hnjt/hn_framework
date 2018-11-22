package security_sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import security_sso.config.SecurityConfig;

import java.security.Principal;

@RestController
public class SSOController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SecurityConfig securityConfig;

    @GetMapping(value = "/SecuritySSO")
    public Principal SecuritySSO (Principal principal){

        //System.out.println(user.toString() + "---" + password.toString());

        //this.securityConfig.configure();
        System.out.println(principal);
        return principal;
    }
}
