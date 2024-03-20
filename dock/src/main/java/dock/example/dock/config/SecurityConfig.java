package dock.example.dock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SecurityConfig {
/*
    @Bean
    public SecurityFilterChain apiSecurity (HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeHttpRequests(
                        (auth)-> auth.requestMatchers("/Users","/","/user/create")

                                .authenticated()

                )
                .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();

    }*/
}
