package application.dao;

import org.springframework.stereotype.Component;

@Component
public class StudentDao implements IDao{

    public void addStudent(){
        System.out.println("=================== Adding student =========================");
    }
}
