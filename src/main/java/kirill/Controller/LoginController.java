package kirill.Controller;

import com.sun.javafx.sg.prism.NGShape;
import kirill.dao.UserDao;
import kirill.dto.UserDetails;
import kirill.service.AuthenticateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ldap.core.AuthenticationSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import sun.text.normalizer.ICUBinary;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.security.Security;

/**
 * Created by kirill on 07/10/16.
 */
@Controller
@SessionAttributes("user")
public class LoginController {

    @Autowired
    private AuthenticateUser authenticateUser;
    @Autowired
    @Qualifier("authenticationManager")
    protected AuthenticationManager authenticationManager;
    @Autowired
    UserDao userDao;


    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login (HttpServletRequest request,Model model){
        System.out.println("in the login method");
//        if (request.getSession().getAttribute("user")!=null) {
//            UserDetails user= (UserDetails) request.getSession().getAttribute("user");
//            authenticateUser.autoLogin(user, request,authenticationManager);
//            return "redirect:hello";
//        }
//        String name=request.getParameter("j_username");
        model.addAttribute("user",new UserDetails());
        return "login";
    }




    @RequestMapping(value = "/loginFailed",method = RequestMethod.GET)
    public String loginFailed(ModelMap model){
        System.out.println("Login Failed");

        model.addAttribute("error","true");
        return "login";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(ModelMap model){
        System.out.println("Logout");

        return "login";
    }

    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public String Error403(ModelMap model){
        System.out.println("403");
        return "403";
    }

}
