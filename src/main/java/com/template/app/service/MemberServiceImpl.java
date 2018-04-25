package com.template.app.service;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * security-context.xml
 * 
 * <security:authentication-provider user-service-ref="memberService">
 *		<security:password-encoder hash="bcrypt" />
 *	</security:authentication-provider>
 */
@Service("memberService")
public class MemberServiceImpl implements UserDetailsService {
	Logger logger = Logger.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/**
	 * sample
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = new User("test", passwordEncoder.encode("1234"), Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
		
		return user;
	}
}
