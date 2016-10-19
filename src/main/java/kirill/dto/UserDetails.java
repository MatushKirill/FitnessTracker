package kirill.dto;

import kirill.Validation.EmailExist;
import kirill.Validation.LoginExist;
import kirill.model.Authority;
import kirill.service.ByCode;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirill on 10/10/16.
 */
public class UserDetails{
    @NotEmpty
    @LoginExist
    private String userName;
    @NotEmpty
//    @Size(min = 3 , max = 20)
    private String userPass;
    @Email
    @NotEmpty
    @EmailExist
    private String email;
    @Range(min = 100,max = 240)
    @NotNull
    private int rise;
    @Range(min = 30,max = 150)
    @NotNull
    private int weight;
    @Range(min = 10,max = 100)
    @NotNull
    private int age;
    @NotEmpty
    private String sex;
    private int calories;
    @NotNull
    private double activity;
    private List<Authority> authorities=new ArrayList<Authority>();



    private boolean enabled;
    private ByCode byCode=new ByCode();

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authority authority) {
        this.authorities.add(authority);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getRise() {
        return rise;
    }

    public void setRise(int rise) {
        this.rise = rise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getActivity() {
        return activity;
    }

    public void setActivity(double activity) {
        this.activity=activity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = byCode.CodPass(userPass);
    }


}
