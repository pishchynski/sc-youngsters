package com.pishchynski.sc.trainapp.utils;

/**
 * Created by pishchinsky on 08.07.2016.
 */
public class Customer {
    private String name;
    private int id;

    private void generateID() {
        this.id = (int) (Math.random() % 99999);
    }

    public Customer(String name) {
        this.name = name;
        generateID();
    }

}
