package com.atguigu.gulimall.oms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class OmsSercurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //禁掉
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**").permitAll();
    }
}
