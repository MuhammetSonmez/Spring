package com.example.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        
        SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(City.class)
        .buildSessionFactory();
        
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            /* 
            */
            String q = "SELECT countryCode from City GROUP BY countryCode";
            List<String> countryCodes = session
            .createQuery(q)
            .getResultList();


            
            for (String countryCode:countryCodes){
                System.out.println(countryCode);
            }


            session.getTransaction().commit();
        }finally{
            factory.close();
        }

           
    }
}
