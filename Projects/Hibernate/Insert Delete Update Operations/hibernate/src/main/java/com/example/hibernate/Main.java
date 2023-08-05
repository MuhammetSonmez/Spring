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
        
        //Unit of Work
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            //CRUD(create read update delete) operations
            
            //INSERT
            City c = new City();
            c.setName("Düzce 10");
            c.setCountryCode("TUR");
            c.setDistrict("Karadeniz");
            c.setPopulation(100000);
            session.save(c);
        
            
        
            //UPDATE
            City city = session.get(City.class, 4082);
            System.out.println(city.getPopulation());
            city.setPopulation(110000);
            session.save(city);
            System.out.println(city.getPopulation());
            

            
            //DELETE
            city = session.get(City.class, 4080);
            session.delete(city);
            System.out.println(city.getName() + " deleted.");
            
        

            /*
            List<City> cities = session.createQuery("from City").getResultList();
            for (City ci:cities){
                System.out.println(ci.getName());
            }
            */
             
            session.getTransaction().commit();
        }finally{
            factory.close();
        }

           
    }
}
