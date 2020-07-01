package demo1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Coach coach = context.getBean("test", Coach.class);
        ((ClassPathXmlApplicationContext) context).close();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("lifecycle.xml");
        Coach coach1 = context1.getBean("test", Coach.class);

        System.out.println(coach == coach1 );

        ((ClassPathXmlApplicationContext) context1).close();
    }
}
