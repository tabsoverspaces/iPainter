package com.dragan.ipainter.backend_classes_main;

import com.dragan.ipainter.backend_classes_main.work_actions.Wallpapers;

import java.util.ArrayList;

/**
 * Created by Dragan on 1/18/2018.
 */

public class Walls extends RoomComponent{

    private boolean hasWallpapers;

    private Wallpapers wallpapers;

    /**
     * Basic constructor with no parameters
     */
    public Walls()
    {
        super();

        this.hasWallpapers = false;
        this.wallpapers = new Wallpapers();
    }

    public Walls(double screenSize)
    {
        super(screenSize);

        this.hasWallpapers = false;
        this.wallpapers = new Wallpapers();
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    /// IMPORTANT FUNCTIONAL METHODS GO HERE ///
    ////////////////////////////////////////////
    ////////////////////////////////////////////
}
