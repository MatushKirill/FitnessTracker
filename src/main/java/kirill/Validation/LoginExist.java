package kirill.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by kirill on 11/10/16.
 */
@Documented
@Constraint(validatedBy = LoginConstraintValid.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginExist {
    String message() default "{LoginExist}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

