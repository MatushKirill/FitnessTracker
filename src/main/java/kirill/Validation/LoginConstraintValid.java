package kirill.Validation;

import kirill.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by kirill on 11/10/16.
 */
public class LoginConstraintValid implements ConstraintValidator<LoginExist,String> {
    @Autowired
    UserDao userDao;
    public void initialize(LoginExist loginExist) {

    }

    public boolean isValid(String login, ConstraintValidatorContext ctx) {
        if (userDao.getUsersName().contains(login)) {
            return false;
        }
        return true;

    }
}
