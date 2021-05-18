package com.smartcontact.manager.configpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.UserDetailsServiceFactoryBean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService getDoctorDetailService()
	{
		return new DoctorDetailService();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		
		daoAuthenticationProvider.setUserDetailsService(this.getDoctorDetailService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		
		return daoAuthenticationProvider;
		
	}
	
	
	
	
	
	
	
	
	//configure method
	
	protected void configure (AuthenticationManagerBuilder auth) throws Exception
	{
		auth.authenticationProvider(authenticationProvider());//from database
		//auth.inMemoryAuthentication(authenticationProvider)//from inmemory
		
		
	}
	
	
	protected void configure(HttpSecurity http) throws Exception
	{
		/*http.authorizeRequests().antMatchers("/admin/**").hasRole("Admin").antMatchers("/doctor/**").hasRole("Doctor").antMatchers("/**").permitAll().
		and().formLogin().loginPage("/urloflogin").loginProcessingUrl("/checkuserurl").defaultSuccessUrl("/Homeurl").failureUrl("/failpage")
		.and().csrf().disable();
	
	*/
		
		http.csrf().disable();
		
		
		
		//http.authorizeRequests().antMatchers("/**").permitAll().and().formLogin().loginPage("/logincheck").permitAll();
	
	}
	
	
}
