package com.dragan.ipainter.backend_classes_main.work_actions;

/**
 * Created by Dragan on 1/18/2018.
 */

public abstract class WorkAction {

    private double price;

    public WorkAction()
    {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
