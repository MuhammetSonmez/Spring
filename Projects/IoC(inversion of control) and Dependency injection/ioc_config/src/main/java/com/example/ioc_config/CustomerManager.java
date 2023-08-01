package com.example.ioc_config;

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){ 
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
    }
}
