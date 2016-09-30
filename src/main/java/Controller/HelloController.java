package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kirill on 28/09/16.
 */
@Controller
public class HelloController {



    @RequestMapping(value = "/greeting")
    public String sayHello(Model model){

        model.addAttribute("greeting","hello");

        return "hello";
    }

}
