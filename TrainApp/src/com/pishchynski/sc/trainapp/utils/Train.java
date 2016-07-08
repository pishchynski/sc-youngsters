package com.pishchynski.sc.trainapp.utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by pishchinsky on 08.07.2016.
 */
public class Train {
    private HashMap<TrainAppUtils.CarriageType, Integer> carriagesTypes;
    private ArrayList<Carriage> carriages;
    private int number;
    private String name;
    private boolean complete = true;

    public Train(ArrayList<Carriage> carriages, String name, int number) {
        carriagesTypes = new HashMap<>();
        TrainAppUtils.CarriageType[] types = TrainAppUtils.CarriageType.values();
        for (TrainAppUtils.CarriageType type : types) {
            carriagesTypes.put(type, 0);
        }
        this.carriages = carriages;
        this.name = name;
        this.number = number;
        this.complete = checkCompletion();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int evaluatePrice() {
        int sum = 0;
        for (Carriage carriage : carriages) {
            sum += carriage.getPrice();
        }
        return sum;
    }

    private boolean checkCompletion() {
        boolean trainComplete = false;
        for (Carriage carriage : carriages) {
            carriagesTypes.put(carriage.getType(), carriagesTypes.get(carriage.getType()) + 1);
        }
        if (carriagesTypes.get(TrainAppUtils.CarriageType.LOCOMOTIVE) > 0 && carriagesTypes.get(TrainAppUtils.CarriageType.RESTAURANT) < 2) {
            trainComplete = true;
        } else {
            trainComplete = false;
        }

        return trainComplete;
    }

}
