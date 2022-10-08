package com.springPractiseEdureka;


import com.springPractiseEdureka.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEdureka {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(SpringEdureka.class,args);
        Customer customer=context.getBean(Customer.class);
        customer.setCourseName("Spring Course");
        customer.setCusName("Shisia James");
        customer.display();
    }
}
