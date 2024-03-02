package com.developer.logisticsmanagement.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.developer.logisticsmanagement.Entity.logisticEntity;
import com.developer.logisticsmanagement.repository.LogisticRepo;
import com.developer.logisticsmanagement.service.logisticservice;

@Service
public class logisticserviceimpl implements logisticservice {
    private final LogisticRepo logisticrepository ;
    public logisticserviceimpl(LogisticRepo logisticrepository){
        this.logisticrepository=logisticrepository;
    }

    @Override
    public List<logisticEntity> FindAllloads() {
        return logisticrepository.findAll();
    }

    @Override
    public Optional <logisticEntity> findById(int id) {
        
        
        return logisticrepository.findById(id);
    }

    @Override
    public logisticEntity saveloads(logisticEntity logisticentity) {
        
        return logisticrepository.save(logisticentity);
    }

    @Override
    public logisticEntity updateloads(logisticEntity logisticentity) {
       
       
        return logisticrepository.save(logisticentity);

    }

    @Override
    public void deleteloads(int id) {
        
        logisticrepository.deleteById(id);
        
    }

   
    
}
