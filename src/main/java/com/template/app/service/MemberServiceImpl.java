package com.template.app.service;

import java.util.ArrayList;
import java.util.List;

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
		List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		
		if ("test".equals(username)) {
			roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}
		
		UserDetails user = new User("test", passwordEncoder.encode("1234"), roles);
		
		return user;
	}
}
