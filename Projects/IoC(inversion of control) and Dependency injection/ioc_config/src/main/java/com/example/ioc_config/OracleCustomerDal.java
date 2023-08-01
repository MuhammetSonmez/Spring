package com.example.ioc_config;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add(){
        System.out.println("Added to oracle database.");
    }


}
