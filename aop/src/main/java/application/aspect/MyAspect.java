package application.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(public void application.dao.IDao.addStudent())")
    public void beforeAddStudent(){
        System.out.println("==== Before addding student ======");
    }
}

