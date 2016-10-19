package kirill.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by kirill on 14/10/16.
 */
@Documented
@Constraint(validatedBy = EmaiExistValid.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailExist {
    String message() default "{LoginExist}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
