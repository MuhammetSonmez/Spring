package com.example.springioc;


import org.springframework.stereotype.Component;

@Component("database")
public class MySqlCustomerDal implements ICustomerDal{
    String connectionString;


    public String getConnectionString() {
        return connectionString;
    }


    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connection String: " + this.connectionString);
        System.out.println("Added to my sql database.");
    }
    
}
