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

    public Train(ArrayList<Carriage> carriages, String name, int number) {
        this.carriages = carriages;
        this.name = name;
        this.number = number;
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

}
