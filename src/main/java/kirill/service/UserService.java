package kirill.service;

import kirill.dto.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by kirill on 19/10/16.
 */
@Service
public class UserService {

    public int calculateCalories(UserDetails user){
        if (user.getSex()=="female"){
            return (int) (user.getActivity()*(447.593 + (9.247 * user.getWeight()) + (3.098 * user.getRise()) - (4.330 * user.getAge())));
        }else {
            return (int) (user.getActivity()*(88.362 + (13.397 * user.getWeight()) + (4.799 * user.getRise()) - (5.677 * user.getAge())));
        }
    }
}

