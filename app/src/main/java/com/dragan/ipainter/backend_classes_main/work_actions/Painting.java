package com.dragan.ipainter.backend_classes_main.work_actions;

import com.dragan.ipainter.backend_classes_main.PaintWrapper;
import com.dragan.ipainter.utility.DefaultValues;

import java.util.ArrayList;

/**
 * Created by Dragan on 1/18/2018.
 */

public class Painting extends WorkAction {

    private ArrayList<PaintWrapper> listOfPaints;


    /**
     * Basic constructor with no parameters, used to initialize some values of attributes
     */
    public Painting()
    {
        super();
        this.setPrice(DefaultValues.defaultPriceCeiling);
    }

    /**
     * Constructor that is used to create an instance of the class with known price and paint list
     *
     * @param price Value representing the price of painting per meter squared
     * @param paints List of paints that are to be used
     */
    public Painting(double price, ArrayList<PaintWrapper> paints)
    {
        this();

        this.setPrice(price);
        this.listOfPaints = paints;
    }

    /**
     * Method used to add paint wrapper object to the list of paints for this painting action
     *
     * @param paint The PaintWrapper object that is to be added to the list
     */
    public void addPaint(PaintWrapper paint)
    {
        this.listOfPaints.add(paint);
    }


}
