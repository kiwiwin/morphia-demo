package org.kiwi.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("cars")
public class Car {
    @Id
    private ObjectId id;
    private String carNumber;
    private String brand;
    private int price;

    //for morphia
    Car() {
    }

    public Car(String carNumber, int price, String brand) {
        this.brand = brand;
        this.price = price;
        this.carNumber = carNumber;
    }

    public ObjectId getId() {
        return id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
