package Controller;

import com.sun.net.httpserver.HttpServer;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping(value = "/redirect",method = RequestMethod.POST)
    public String redirect(){
        return "redirect:addGoal";
    }

   
}
