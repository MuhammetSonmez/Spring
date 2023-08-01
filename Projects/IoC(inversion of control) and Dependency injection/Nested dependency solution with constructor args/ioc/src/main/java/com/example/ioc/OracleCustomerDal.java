package com.example.ioc;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add(){
        System.out.println("Added to oracle database.");
    }


}
