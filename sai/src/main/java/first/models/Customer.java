package first.models;

import first.validators.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min= 2, message = "should be greater than 2 characters" )
    private String lastName;

    @NotNull(message = "required")
    @Min(value = 0, message = "Should be greater than 0")
    @Max(value = 10, message = "Should be lesser than 10")
    private Integer freePasses;

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "5 aplhanumeric chars only")
    private String postalCode;

    @CourseCode.Many(value = {@CourseCode(value = "SAI"), @CourseCode("MAT")})
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastname) {
        lastName =  lastname;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
