package org.kiwi.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("users")
public class User {
    @Id
    private ObjectId id;
    private String name;
    private Contact contact;
    @Reference
    private Car car;

    User() {
    }

    public User(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public ObjectId getId() {
        return id;
    }

    public Contact getContact() {
        return contact;
    }

    public void addCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
