package rmugattarov.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmugattarov.beans.impl.HelloStringProvider;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("generators.xml");
        HelloStringProvider helloStringProvider = (HelloStringProvider) context.getBean("HelloStringProvider");
        System.out.println(helloStringProvider.getString());
    }
}
