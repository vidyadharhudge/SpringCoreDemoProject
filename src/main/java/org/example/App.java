package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");// if you call context then every time it go in xml for load configration
        Car obj= (Car) context.getBean("car");
        obj.drive();

        /* Vehicle obj=new Bike();
         obj.drive();*/

        /*Vehicle obj= (Vehicle) context.getBean("bike");//cast kel vehicle keyword ahe so tya sati xml file create karawa lagto
        obj.drive();*/

       /* Tyre t= (Tyre) context.getBean("tyre");
        System.out.println(t);*/
    }
}
