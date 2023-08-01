package com.example.ioc_config;


public class MsSqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Added to ms sql database.");
    }
    
}
