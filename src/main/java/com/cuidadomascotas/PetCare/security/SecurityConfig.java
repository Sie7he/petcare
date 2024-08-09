package com.cuidadomascotas.PetCare.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(http -> {
                    http.requestMatchers(HttpMethod.GET, "/clientes").hasAnyAuthority("READ");
                    http.requestMatchers(HttpMethod.GET, "/mascotas/cliente").hasAnyAuthority("READ");
                    http.requestMatchers(HttpMethod.POST, "/clientes").hasAnyAuthority("CREATE");
                    http.requestMatchers(HttpMethod.GET, "/mascotas").hasAnyAuthority("READ");
                    http.requestMatchers(HttpMethod.POST, "/mascotas").hasAnyAuthority("CREATE");
                    http.requestMatchers(HttpMethod.GET, "/veterinarios").hasAnyAuthority("READ");
                    http.requestMatchers(HttpMethod.POST, "/veterinarios").hasAnyAuthority("CREATE");
                    http.requestMatchers(HttpMethod.GET, "/mascotas/*").hasAnyAuthority("READ");
                    http.requestMatchers(HttpMethod.POST, "/mascotas/*").hasAnyAuthority("CREATE");
                })
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {

        return authenticationConfiguration.getAuthenticationManager();

    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder());
        provider.setUserDetailsService(userDetailsService());
        return provider;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withUsername("diego")
                .password("1234")
                .roles("ADMIN")
                .authorities("READ", "CREATE", "UPDATE")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        /*Prueba*/
        return NoOpPasswordEncoder.getInstance();
    }
}
