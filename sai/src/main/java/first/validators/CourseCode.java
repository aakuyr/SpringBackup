package first.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraints.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    String value() default "PSY";

    String message() default "Must start with PSY";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    public @interface Many {
        CourseCode[] value();
    }
}
