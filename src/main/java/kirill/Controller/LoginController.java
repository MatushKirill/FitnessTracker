package kirill.Controller;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kirill on 07/10/16.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login (ModelMap model){
        System.out.println("in the login method");
        return "login";
    }

    @RequestMapping(value = "/registration" ,method = RequestMethod.GET)
    public String registration (ModelMap model){

        return "registration";
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
