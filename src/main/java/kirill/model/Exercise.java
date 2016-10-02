package kirill.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * Created by kirill on 30/09/16.
 */
public class Exercise {
    @Range(min=1 ,max=120)
    private int minutes;
    @NotEmpty
    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
