package com.pishchynski.sc.trainapp.utils;

import java.math.*;

/**
 * Created by pishchinsky on 08.07.2016.
 */
public class Carriage {
    private TrainAppUtils.CarriageType type;
    private int price;
    private int id;

    private void generateID() {
        this.id = (int) (Math.random() % 99999);
    }

    public Carriage(TrainAppUtils.CarriageType type, int price) {
        this.type = type;
        this.price = price;
        generateID();
    }

    public int getPrice() {
        return price;
    }

    public TrainAppUtils.CarriageType getType() {
        return type;
    }

    public int getID() {
        return id;
    }
}
