package kirill.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kirill on 30/09/16.
 */
@Controller
//@SessionAttributes("name")
public class HelloController {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String addHello(  Model model){
        model.addAttribute("name","hello world");

        return "hello";
    }
    @RequestMapping(value = "/redirect")
    public String redirect(){
        return "redirect:addGoal";
    }

   
}
