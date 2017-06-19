package com.ecnu.config;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.ecnu.service.PeopleService;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Bean
	UserDetailsService peopleService() {
		return new PeopleService();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(peopleService());
	}
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()//.antMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
					.loginPage("/login")
					.failureUrl("/login?error")
					.permitAll()
					.and()
					.logout().permitAll();	
	}	
	
}

