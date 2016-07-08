package com.pishchynski.sc.trainapp.utils;

import java.util.HashMap;

/**
 * Created by pishchinsky on 08.07.2016.
 */
public class Order {
    private int id;
    private Customer customer;
    private HashMap<Train, Integer> trains;

    private void generateID() {
        this.id = (int) (Math.random() % 99999);
    }

    public Order(Customer customer) {
        generateID();
        this.customer = customer;
        trains = new HashMap<>();
    }

    public void addTrain(Train train, int num) {
        int trainNum = num;
        if (trains.get(train) != null) {
            trainNum += trains.get(train);
        }
        trains.put(train, trainNum);
    }
}
