package com.muss.mypro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
    	//Vehicle obj1= (Vehicle)context.getBean("bike");
        //obj1.drive();
    	Car t = (Car) context.getBean("car");
    	t.drive();
    }
}
