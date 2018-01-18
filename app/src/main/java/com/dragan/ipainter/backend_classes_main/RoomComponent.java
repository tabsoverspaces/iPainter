package com.dragan.ipainter.backend_classes_main;

import com.dragan.ipainter.backend_classes_main.work_actions.Glet;
import com.dragan.ipainter.backend_classes_main.work_actions.Painting;
import com.dragan.ipainter.utility.DefaultValues;

/**
 * Created by Dragan on 1/18/2018.
 */

public abstract class RoomComponent {

    private double screenSize;

    private boolean hasPainting;
    private boolean hasGlet;

    private Painting painting;
    private Glet glet;

    /**
     * Basic constructor with no parameters
     */
    public RoomComponent()
    {
        this.hasGlet = false;
        this.hasPainting = false;

        this.painting = new Painting();
        this.glet = new Glet();
    }

    /**
     * Method used to create an instance of the class with known screen size
     * @param screenSize
     */
    public RoomComponent(double screenSize)
    {
        this();

        this.screenSize = screenSize;
    }


    ////////////////////////////////////////////
    ////////////////////////////////////////////
    /// IMPORTANT FUNCTIONAL METHODS GO HERE ///
    ////////////////////////////////////////////
    ////////////////////////////////////////////


}
