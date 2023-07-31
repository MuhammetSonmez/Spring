package com.example.IoC;

public class MsSqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("added to Ms Sql database.");
    }
    
}
