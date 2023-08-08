package com.example.spring.Business;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.example.spring.DataAccess.ICityDal;
import com.example.spring.Entities.City;

@Service
public class CityManager implements ICityService {
    private ICityDal cityDal;


    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        //business rules
        this.cityDal.add(city);
        
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);

    }


    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public City getById(int id) {

        return this.cityDal.getById(id);
    }

}
