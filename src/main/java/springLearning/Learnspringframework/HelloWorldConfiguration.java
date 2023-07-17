package springLearning.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address addd){};

//Eliminate verbosity in creating a java Beans
//Public accesor methods, constructor
//equals,hashcode and toString are automatically created
//Released in JDK 16 -- about record.

record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Smk";
    }
    @Bean
    public int age(){
        return 15;
    }

@Bean
    public Person person(){
        return new Person("mani",23,new Address("smk","khv"));
}

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), addd());
    }

@Bean(name = "add2")
    public Address addd(){
      return new Address("Dharmapuri","Hyderabad");
}


@Bean
    public Person person3Parameters(String name,int age,Address add3){
        return new Person(name,age, add3);
    }
    @Bean(name = "add3")
    public Address ad3(){
        return new Address("dmp","Hyderabad");
    }
}
