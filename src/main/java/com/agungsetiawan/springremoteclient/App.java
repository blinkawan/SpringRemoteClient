package com.agungsetiawan.springremoteclient;

import com.agungsetiawan.springremoteserver.entity.Person;
import com.agungsetiawan.springremoteserver.service.PersonService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Agung Setiawan
 */

public class App{
    public static void main( String[] args ){
        ApplicationContext context=new ClassPathXmlApplicationContext("client-context.xml");
        
        System.out.println("Java");
        System.out.println("===================");
        
        PersonService personService=(PersonService) context.getBean("personServiceRmi");
        List<Person> persons=personService.getAll();
        
        for(Person p:persons){
            System.out.println("Name : "+p.getName()+"And Email : "+p.getEmail());
        }
    }
}
