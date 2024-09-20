package com.deloitte.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddDemo {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in); 

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
        	
        	System.out.println("Add a new employee: ");
        	System.out.println("Enter name:");
        	String name = sc.next();
        	System.out.println("Enter salary: ");
        	double salary = sc.nextDouble();
        			
            Employee newEmployee = new Employee(name, salary);

            session.beginTransaction();

            session.save(newEmployee);

            session.getTransaction().commit();

            System.out.println("Done...");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
            sc.close();
        }
    }
}
