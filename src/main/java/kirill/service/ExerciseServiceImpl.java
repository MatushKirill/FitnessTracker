package kirill.service;

import kirill.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirill on 02/10/16.
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
    public List<Activity> findAllActivitues(){
        List<Activity> activities=new ArrayList<Activity>();
        Activity run =new Activity();
        run.setDesc("Run");
        activities.add(run);
        Activity bike =new Activity();
        bike.setDesc("Bike");
        activities.add(bike);
        Activity swim =new Activity();
        swim.setDesc("Swim");
        activities.add(swim);

        return activities;
    }

}
