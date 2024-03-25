package dock.example.dock.config;
/*
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import static org.springframework.http.HttpMethod.POST;
*/

//@EnableWebSecurity
//@Configuration
public class SecurityConfig {
/*
    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    @Bean
    public SecurityFilterChain apiSecurity (HttpSecurity httpSecurity)throws Exception{
       return httpSecurity
               //.csrf().disable()
               .authorizeHttpRequests(auth->

                            auth
                                    //requestMatchers(POST, "/correction/create","/user/find/{id}").permitAll();
                            .requestMatchers(HttpMethod.GET,"/users","/").hasRole("USER")
                            .requestMatchers(HttpMethod.POST,"/correction/create/**").hasRole("ADMIN")
                            .anyRequest()
                            .authenticated()

                )

               .httpBasic(Customizer.withDefaults())
               .build();



    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder().encode("user"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    //Authentication manager
    @Bean
    public AuthenticationManager authenticationManager(
        AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }
*/
/*
    @Bean
    public BCryptPasswordEncoder bCryptpasswordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

/*
    @Bean
    public AuthenticationManager authenticationManager (HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder)
        throws Exception{
        AuthenticationManagerBuilder authenticationManagerBuilder= (AuthenticationManagerBuilder) http
               .getSharedObjects();
        authenticationManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(bCryptPasswordEncoder);
        return authenticationManagerBuilder.build();
    }*/
/*
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

        authenticationManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(bCryptpasswordEncoder());
        return authenticationManagerBuilder.build();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService)
                .passwordEncoder(passwordEncoder());
    }*/


}
