package service;

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

// première qui intercepte notre requete HTTP
// le filter est déclenché à chaque fois que the user send a HTTP request

@Component
@RequiredArgsConstructor

/*
 * OncePerRequestFilter : Assure que le filtre est appliqué une fois par requete
 */
public class JwtAuthentificationFilter extends OncePerRequestFilter
{
	/*
	 * C'est une méthode qui nous permet d'éffectuer des opérations teles k
	 * la vérifications des infos d'identification, l'autorisation...
	 */
	@Override
	protected void doFilterInternal(
			@NonNull HttpServletRequest request, // représente la requête HTTP reçue du client 
			@NonNull HttpServletResponse response, // représente la réponse HTTP que la servlet envoie au client 
			@NonNull FilterChain filterChain  // repréqente une séquence de filtre appliquée à la requete
	) throws ServletException, IOException {
		// Partie pour traiter les requetes http
		/*request.getHeader() permet d'accéder aux entete de la requete http entrante et d'éffecturer des opérations
		 */
		final String authHeader = request.getHeader("Autorization");  
														
		/*
		 * Cette ligne déclare une variable jwt qui sera utilisée
		 * pour stocker le jeton JWT extrait de l'en-tête.
		 */
		final String jwt;
		
		// Extract the username pour voir si ça existe
		final String userEmail;
		
		/*
		 * Ce bloc conditionnel vérifie si l'en-tête "Authorization" est nul ou ne commence
		 * pas par "Bearer". Si l'une de ces conditions est vraie, le filtre passe
		 * la requête au filtre suivant dans la chaîne de filtres
		 * (représentée par filterChain.doFilter(request, response)), et la méthode est
		 * interrompue avec return;. En d'autres termes, si le jeton n'est pas présent
		 * ou s'il ne commence pas par "Bearer", le filtre n'effectue aucune action supplémentaire
		 * et laisse la requête suivre son chemin normal dans l'application.
		 */
		if(authHeader == null || !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			
			return;
		}
		// extraire la chaine de caractère à partir du 7iém caractère
		jwt = authHeader.substring(7);
		
		//userEmail = jwtService.extractUsername()
	}

}
