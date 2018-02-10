package rmugattarov.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmugattarov.beans.api.StringProvider;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("generators.xml");
        StringProvider helloStringProvider = (StringProvider) context.getBean("autowiredStringProvider");
        System.out.println(helloStringProvider.getString());
    }
}
