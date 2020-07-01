import hb.entities.Student;
import hb.util.DateUtil;
import net.bytebuddy.utility.RandomString;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        try (SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class).configure("hibernate.cfg.xml").buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Student s = session.get(Student.class, 1);
            session.delete(s);
            session.getTransaction().commit();
            session.close();
        }
    }
}
