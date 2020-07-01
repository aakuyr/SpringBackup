package first.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraints implements ConstraintValidator<CourseCode, String> {

    String prefix;

    @Override
    public void initialize(CourseCode courseCode) {
        this.prefix = courseCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return (null == s) ? false : s.startsWith(prefix);
    }
}
