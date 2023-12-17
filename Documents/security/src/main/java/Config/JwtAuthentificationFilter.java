package Config;

import java.io.IOException;

import org.springframework.security.config.annotation.rsocket.RSocketSecurity.JwtSpec;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.micrometer.common.lang.NonNull;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor

public class JwtAuthentificationFilter extends OncePerRequestFilter
{
	private JwtService jwtService;

	@Override
	protected void doFilterInternal(
			@NonNull HttpServletRequest request,
			@NonNull HttpServletResponse response, 
			@NonNull FilterChain filterChain
	) throws ServletException, IOException {
		final String authHeader = request.getHeader("Autorization");
	
		if(authHeader == null || !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			
			return;
		}
		
		final String jwt = authHeader.substring(7);
		final String userEmail  = jwtService.extractUsername(jwt);
		
	
	}

}
