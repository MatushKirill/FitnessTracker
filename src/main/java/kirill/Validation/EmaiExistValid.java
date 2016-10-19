package kirill.Validation;

import kirill.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by kirill on 14/10/16.
 */
public class EmaiExistValid  implements ConstraintValidator<EmailExist,String> {
    @Autowired
    UserDao userDao;
    public void initialize(EmailExist emailExist) {

    }

    public boolean isValid(String email, ConstraintValidatorContext ctx) {
        if (userDao.getUsersEmail().contains(email)) {
            return false;
        }
        return true;

    }
}
