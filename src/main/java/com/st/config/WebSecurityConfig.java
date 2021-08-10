package com.st.config;

import com.st.handler.FormAuthenticationFailureHandler;
import com.st.handler.SsoLogoutSuccessHandler;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

/**
 * @author shent
 * 认证相关配置
 */
@Primary
@Order(90)
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    @SneakyThrows
    protected void configure(HttpSecurity http) {
        http.authorizeRequests().antMatchers("/").permitAll();
//                .formLogin().loginPage("/token/login").loginProcessingUrl("/token/form")
//                .failureHandler(authenticationFailureHandler()).and().logout()
//                .logoutSuccessHandler(logoutSuccessHandler()).deleteCookies().invalidateHttpSession(true)
//                .and().authorizeRequests().antMatchers("/token/**", "/actuator/**", "/mobile/**", "/").permitAll()
//                .anyRequest().authenticated().and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider();
    }

    @Override
    public void configure(WebSecurity web) {
         web.ignoring().antMatchers("/user/add");
    }

    @Bean
    @Override
    @SneakyThrows
    public AuthenticationManager authenticationManagerBean() {
        return super.authenticationManagerBean();
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new FormAuthenticationFailureHandler();
    }

    /**
     * 支持SSO 退出
     *
     * @return LogoutSuccessHandler
     */
    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new SsoLogoutSuccessHandler();
    }

    /**
     * https://spring.io/blog/2017/11/01/spring-security-5-0-0-rc1-released#password-storage-updated
     * Encoded password does not look like BCrypt
     *
     * @return PasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
