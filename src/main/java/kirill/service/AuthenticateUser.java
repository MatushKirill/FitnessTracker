package kirill.service;

import kirill.dto.UserDetails;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by kirill on 17/10/16.
 */
@Service
public class AuthenticateUser {
    public boolean autoLogin( UserDetails user, HttpServletRequest request,AuthenticationManager authenticationManager) {
        try {
            UsernamePasswordAuthenticationToken usernameAndPassword =
                    new UsernamePasswordAuthenticationToken(user.getUserName(),user.getUserPass(),user.getAuthorities());

            Authentication auth = authenticationManager.authenticate(usernameAndPassword);

            SecurityContextHolder.getContext().setAuthentication(auth);

        } catch (AuthenticationException e) {
            SecurityContextHolder.getContext().setAuthentication(null);
        }
        return true;
    }

}
