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

            //query
            //SELECT * FROM city
            /* 
            List<City> cities = session
            .createQuery("from City c where c.countryCode = 'TUR' OR c.countryCode = 'usa'")
            .getResultList();
            
            List<City> cities = session
            .createQuery("from City c where c.countryCode = 'TUR' AND c.district = 'Ankara'")
            .getResultList();
            */
            List<City> cities = session
            .createQuery("from City c where c.name LIKE '%kar%'")
            .getResultList();


            
            for (City query:cities){
                System.out.println(query.getName());
            }


            session.getTransaction().commit();
        }finally{
            factory.close();
        }

           
    }
}
