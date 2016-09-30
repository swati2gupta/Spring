/**
 * Created by t_guptsw on 9/30/2016.
 */

import com.spring.beans.MyBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("beans.xml");

    MyBean obj = (MyBean) context.getBean("myBean");

    System.out.println(obj.getName());
  }
}