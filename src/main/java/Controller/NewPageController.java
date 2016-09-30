package Controller;

import model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kirill on 30/09/16.
 */
@Controller
public class NewPageController {
    Exercise exercise=new Exercise();
    @RequestMapping(value = "/addMinutes")

    public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
        System.out.println("exercise:" + exercise.getMinutes() );

        return "newpage";
//        return "forward:addMoreMinutes";//save request date
//        return :redirect:...-don't save request date
    }
    @RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
        System.out.println("exercising " + exercise.getMinutes() );

        return "newpage";
    }
}
