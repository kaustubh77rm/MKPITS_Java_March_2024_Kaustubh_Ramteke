package com.example.products_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public JdbcUserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);

        manager.setUsersByUsernameQuery(
                "select email, password, enabled from users where email = ?"
        );

        manager.setAuthoritiesByUsernameQuery(
                "select u.email, r.role_name " +
                        "from user_roles ur " +
                        "join users u on ur.user_id = u.id " +
                        "join roles r on ur.role_id = r.id " +
                        "where u.email = ?"
        );
        return manager;
    }

    @Bean
    public org.springframework.security.web.DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/register", "/register/**").permitAll()
                        .requestMatchers("/login", "/login/**").permitAll()
                        .requestMatchers("/static","/static/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/admin","admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/customer","customer/**").hasRole("CUSTOMER")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/home",true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .invalidateHttpSession(true)
                )
                .csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }
}