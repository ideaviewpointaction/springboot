package bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void run1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Object carFactoryBean = context.getBean("&car");
        Object car =  context.getBean("car");

        System.out.println(car);
        System.out.println(carFactoryBean);
    }
}
