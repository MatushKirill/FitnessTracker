package kirill.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kirill on 30/09/16.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String addHello(Model model){
        model.addAttribute("greeting","hello world");
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String updateHello(){


       return "redirect:addMinutes";
    }

   
}
