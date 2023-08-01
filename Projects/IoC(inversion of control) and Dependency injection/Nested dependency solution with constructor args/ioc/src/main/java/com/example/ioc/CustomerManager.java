package com.example.ioc;


public class CustomerManager implements ICustomerService{

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){ 
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
    }
}
