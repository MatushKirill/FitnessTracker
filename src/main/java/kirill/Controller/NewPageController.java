package kirill.Controller;

import kirill.model.Activity;
import kirill.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import kirill.service.ExerciseService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by kirill on 30/09/16.
 */
@Controller
public class NewPageController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
        System.out.println("exercise:" + exercise.getMinutes() );

        return "addMinutes";
//        return "forward:addMoreMinutes";//save request date
//        return :redirect:...-don't save request date
    }

    @RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){


        return exerciseService.findAllActivitues();

    }


    @RequestMapping(value = "/addMinutes" ,method = RequestMethod.POST)
    public String addMoreMinutes(@Valid @ModelAttribute("exercise") Exercise exercise, BindingResult result){
        System.out.println("exercising " + exercise.getMinutes() );
        System.out.println("exercise activity "+ exercise.getActivity());
        if (result.hasErrors()){
            return "addMinutes";
        }else {
            return "addMinutes";
        }
    }
}
