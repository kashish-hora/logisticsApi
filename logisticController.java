package com.developer.logisticsmanagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.logisticsmanagement.Entity.logisticEntity;
import com.developer.logisticsmanagement.service.logisticservice;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/loads")
public class logisticController {
    private final logisticservice ls;
    public logisticController(logisticservice ls){
        this.ls=ls;
    }
    @GetMapping
    public List<logisticEntity> FindAllloads(){
        return ls.FindAllloads();
    }
    @GetMapping("/{id}")
    public Optional<logisticEntity> findById(@PathVariable("id")int id){
        return ls.findById(id);
    }

    @PostMapping
    public logisticEntity saveloads(@RequestBody logisticEntity logisticentity){
        return ls.saveloads(logisticentity);
       
    }
    @PutMapping("/{id}")
   
    public logisticEntity updateloads(@RequestBody logisticEntity logisticentity){
        return ls.saveloads(logisticentity);
       
    }
    
    @DeleteMapping("/{id}")
    public void deleteloads(@PathVariable("id")int id){
        ls.deleteloads(id);
    }
    





}
