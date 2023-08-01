package com.example.ioc_config;

public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Added to my sql database.");
    }
    
}
