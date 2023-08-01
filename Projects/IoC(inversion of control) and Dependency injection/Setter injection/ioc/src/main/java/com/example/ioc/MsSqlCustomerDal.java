package com.example.ioc;



public class MsSqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Added to ms sql database.");
    }
    
}
