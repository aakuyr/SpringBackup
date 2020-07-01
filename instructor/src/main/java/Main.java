import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession();
        ) {

            session.beginTransaction();

            Student student = session.get(Student.class, 7);

            session.delete(student);

            session.getTransaction().commit();
        }

    }
}
