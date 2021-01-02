package com.docswebapps.msazuresandpit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String CONTAINER_LOCATION_URL_V1="/api/v1/storage/container";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable(); // Required to use H2 in memory DB - remove for Prod
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers(CONTAINER_LOCATION_URL_V1+"/**").permitAll()
//                .anyRequest().authenticated()
                .anyRequest().permitAll()
                .and().cors().and().csrf().disable();
    }
}
