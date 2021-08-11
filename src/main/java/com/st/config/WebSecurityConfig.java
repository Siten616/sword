package com.st.config;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author shent
 * 认证相关配置
 */
@Primary
@Order(90)
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    @SneakyThrows
    protected void configure(HttpSecurity http) {
        //http.authorizeRequests().antMatchers("/").permitAll();

        http.formLogin()
                .loginProcessingUrl("/login.html")//登录表单form中action的地址，也就是处理认证请求的路径
                .usernameParameter("uname")///登录表单form中用户名输入框input的name名，不修改的话默认是username
                .passwordParameter("pword")//form中密码输入框input的name名，不修改的话默认是password
                .defaultSuccessUrl("/home.html")//登录认证成功后默认转跳的路径
                .and()
                .authorizeRequests().antMatchers("/role").permitAll()//不需要通过登录验证就可以被访问的资源路径
                .antMatchers("/user/add").hasRole("superAdmin")
                .and()
                .logout().logoutSuccessUrl("/index/logout")//退出登录跳转页面
                .clearAuthentication(true)
                .invalidateHttpSession(true)
                .and()
                .rememberMe()//记住密码
                .and()
                .csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //inMemoryAuthentication指的是在内存里面存储用户的身份认证和授权信息。
        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder())
                .withUser("admin").password(passwordEncoder().encode("123456")).roles("superAdmin")
                .and()
                .withUser("user1").password(passwordEncoder().encode("123456")).roles("common");
    }

    @Override
    public void configure(WebSecurity web) {
        //将项目中静态资源路径开放出来
        web.ignoring().antMatchers("/config/**", "/css/**", "/fonts/**", "/img/**", "/js/**", "/html/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
