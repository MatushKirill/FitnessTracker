package model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

/**
 * Created by kirill on 30/09/16.
 */
public class Goal {
    @Range(min=1 ,max=120)
//    @Email()
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
