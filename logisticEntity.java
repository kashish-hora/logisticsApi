package com.developer.logisticsmanagement.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="truck_table")
public class logisticEntity {
    @Column(name="Loadpoint")
    private String loadingPoint;
    @Column(name="unloadpoint")
    private String unloadingPoint;
    @Column(name="prod_type")
    private String ProductType;
    @Column(name="truck_type")
    private String truckType;
    @Column(name="nooftrucks")
    private int noofTrucks;
    @Column(name="weight")
    private int weight;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="shipper_id")
    private int Id;
public logisticEntity() {
    }
    @JsonFormat(pattern="dd-mm-yyyy",shape=Shape.STRING)
    @Column(name="date")
    private java.util.Date Date;
public String getLoadingPoint() {
    return loadingPoint;
}
public void setLoadingPoint(String loadingPoint) {
    this.loadingPoint = loadingPoint;
}
public String getUnloadingPoint() {
    return unloadingPoint;
}
public void setUnloadingPoint(String unloadingPoint) {
    this.unloadingPoint = unloadingPoint;
}
public String getProductType() {
    return ProductType;
}
public void setProductType(String productType) {
    ProductType = productType;
}
public String getTruckType() {
    return truckType;
}
public void setTruckType(String truckType) {
    this.truckType = truckType;
}
public int getNoofTrucks() {
    return noofTrucks;
}
public void setNoofTrucks(int noofTrucks) {
    this.noofTrucks = noofTrucks;
}
public int getWeight() {
    return weight;
}
public void setWeight(int weight) {
    this.weight = weight;
}
public int getShipperId() {
    return Id;
}
public void setShipperId(int shipperId) {
    this.Id = shipperId;
}
public java.util.Date getDate() {
    return Date;
}
public void setDate(java.util.Date date) {
    Date = date;
}
public logisticEntity(String loadingPoint, String unloadingPoint, String productType, String truckType, int noofTrucks,
        int weight, int shipperId, java.util.Date date) {
    this.loadingPoint = loadingPoint;
    this.unloadingPoint = unloadingPoint;
    ProductType = productType;
    this.truckType = truckType;
    this.noofTrucks = noofTrucks;
    this.weight = weight;
    this.Id = shipperId;
    Date = date;
}

    
}
