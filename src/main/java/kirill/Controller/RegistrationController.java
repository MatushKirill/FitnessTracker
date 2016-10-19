package kirill.Controller;

import kirill.dao.UserDao;
import kirill.dto.UserDetails;
import kirill.model.Authority;
import kirill.service.AuthenticateUser;
import kirill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by kirill on 10/10/16.
 */
@Controller
@SessionAttributes("user")
public class RegistrationController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticateUser authenticateUser;
    @Autowired
    @Qualifier("authenticationManager")
    protected AuthenticationManager authenticationManager;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String reg(Model model) {
        UserDetails user = new UserDetails();
        model.addAttribute("user", user);
        return "registration";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registeNewUser(@Valid @ModelAttribute("user") UserDetails user, BindingResult result,
                                 HttpServletRequest request) {
        if (result.hasErrors() || userDao.getUsersName().contains(user.getUserName())) {
            return "registration";
        } else {
            user.setEnabled(true);
            user.setCalories(userService.calculateCalories(user));
            Authority authority=new Authority();
            authority.setAuthority("ROLE_USER");
            user.setAuthorities(authority);
            userDao.setNewUser(user);
            userDao.addUserRole(user);
            try {
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user
                        ,user.getUserPass(),user.getAuthorities());
                authenticationManager.authenticate(auth);

                if(auth.isAuthenticated()) {
                    SecurityContextHolder.getContext().setAuthentication(auth);
                    return "redirect:hello";
                }
            } catch (Exception e) {
                System.out.println("error");
            }

            return "redirect:login";

        }
    }



}

