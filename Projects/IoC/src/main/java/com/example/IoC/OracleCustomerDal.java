package com.example.IoC;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add(){
        System.out.println("added to Oracle database.");
    }


}
