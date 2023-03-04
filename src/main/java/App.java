import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println("HelloWorld = " + (helloWorld == helloWorld1) + "\n"
                + "Cat = " + (cat == cat1));
    }
}