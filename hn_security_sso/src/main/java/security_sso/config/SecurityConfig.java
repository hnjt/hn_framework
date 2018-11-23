package security_sso.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import security_sso.dao.UserDAO;

import java.util.List;
import java.util.Map;

/**
 * 安全配置类 of 2018-11-21 by Chenyb
 */
@Configuration
@Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final static Logger log = LoggerFactory.getLogger(SecurityConfig.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    protected void configure(HttpSecurity http) throws Exception { // @formatter:off
        http.requestMatchers()
                .antMatchers("/login", "/oauth/authorize")
                /*.antMatchers("/login")*/
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                /*.loginPage("/my_login")*/
                .permitAll();
    } // @formatter:on

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { // @formatter:off

        List<Map<Object, Object>> users = this.userDAO.getUsers();

        /*默认用户*/
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(passwordEncoder().encode("123456"))
                .roles("ROOT");

        /*缓存用户*/
        for (Map<Object, Object> user : users) {
            log.info("-------Date:{}------",user);
            auth.inMemoryAuthentication()
                    .withUser(user.get("userName").toString())
                    .password(passwordEncoder().encode(user.get("passWord").toString()))
                    .roles("USER");
        }

    } // @formatter:on

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}