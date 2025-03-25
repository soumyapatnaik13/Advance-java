import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carRentalApp {
    public static void main(String[] args) {
        // Load Spring Configuration File
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the Car Bean
        Car myCar = (Car) context.getBean("carBean");

        // Display Car Information
        myCar.displayCarInfo();
    }
}
