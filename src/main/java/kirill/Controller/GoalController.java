package kirill.Controller;

import kirill.model.Goal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by kirill on 30/09/16.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model){
        Goal goal=new Goal();
        goal.setMinutes(10);
        model.addAttribute("goal",goal);
        return "addGoal";
    }
    @PreAuthorize("hasRole('ROLE_ADMIN') and hasPermission(#goal,'createGoal')")
    @RequestMapping(value = "/addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){
        System.out.println("result has errors: "+result.hasErrors());
        System.out.println("Minutes update: "+goal.getMinutes());

        if (result.hasErrors()){
            return "addGoal";
        }
        return "redirect:hello";
    }
    @RequestMapping(value = "/403",method = RequestMethod.POST)
    public String Error403(ModelMap model){
        System.out.println("403");
        return "403post";
    }

}
