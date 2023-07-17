package springLearning.Learnspringframework;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class app02HelloWorldSpring {
    public static void main(String[] args) {
        //1:launch a spring context
        var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2:configure the things that we want spring framework to manage-@Configuration
        //HelloWorldConfiguration -@Configration
        //name :@Bean


        //3: Retrieving Beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("add2"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context
                .getBean(Person.class));
        System.out.println(context.getBean(Address.class));
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
