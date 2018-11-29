package security;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/**
 * Custom Authentication Provider
 * 
 * @author ThienMai
 * @since 17-10-2016
 */
//@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	protected static Logger logger = Logger.getLogger(AuthenticationProvider.class);

	/**
	 * Set Authentication
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		logger.info("[START] : authenticate");

		// Get Parameter
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();

		// Check Basic Authen Dummy
		if (checkAuthen(username, password)) {

			// Set ROLE for accessing API which configuration in spring-security.xml
			List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
			return new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
		}
		return null;
	}

	/**
	 * Class<?> authentication
	 */
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	/**
	 * Login Handler
	 * 
	 * @param username
	 * @param password
	 * @return UserR2S
	 */
	public boolean checkAuthen(String username, String password) {
		return username.equals(password);
	}
}