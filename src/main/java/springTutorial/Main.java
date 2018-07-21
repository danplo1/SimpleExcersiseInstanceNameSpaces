package springTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daniel_D'AGE on 21.07.2018.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/context");

        User user = context.getBean("someUser", User.class);
        System.out.println(user);


    }
}
