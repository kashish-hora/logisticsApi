package com.developer.logisticsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.logisticsmanagement.Entity.logisticEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface LogisticRepo extends JpaRepository<logisticEntity,Integer> {

   
    
}
