package Controller;

import com.sun.net.httpserver.HttpServer;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by kirill on 30/09/16.
 */
@Controller

public class HelloController {
    @RequestMapping(value = "/greeting" ,method = RequestMethod.GET)
    public String addHello(Model model, HttpServletRequest request){
        model.addAttribute("name","hello world");

        return "hello";
    }
    @RequestMapping(value = "/redirect")
    public String redirect(){
        return "redirect:addGoal";
    }

   
}
