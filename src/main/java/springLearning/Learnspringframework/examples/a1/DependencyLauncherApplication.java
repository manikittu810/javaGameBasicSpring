package springLearning.Learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class  YourBusinessClass{
    @Autowired
Dependency1 dependency1;
    @Autowired //Field injection. it is performed as soon as you write @Autowired on the Dependencies
Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection -setDependency1");
        this.dependency1 = dependency1; //Setter injection
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection -setDependency2");
        this.dependency2 = dependency2; //setter injection
    }

    public String toString(){
    return "Using  " + dependency1 + " and  " + dependency2;
}
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}
@Configuration
@ComponentScan
public class DependencyLauncherApplication {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(DependencyLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }

    }
}
