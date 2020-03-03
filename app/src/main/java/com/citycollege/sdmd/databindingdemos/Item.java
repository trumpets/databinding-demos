package com.citycollege.sdmd.databindingdemos;

import java.io.Serializable;

public class Item implements Serializable {

    private String name;
    private float quantity;

    public Item(String name, float quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }
}
