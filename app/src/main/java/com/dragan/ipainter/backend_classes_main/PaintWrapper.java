package com.dragan.ipainter.backend_classes_main;

/**
 * Created by Dragan on 1/18/2018.
 */

public class PaintWrapper {

    private Paint paint;
    private double screenSize;
    private int layers;

    public PaintWrapper(Paint paint, double screenSize, int layers)
    {
        this.paint = paint;
        this.screenSize = screenSize;
        this.layers = layers;
    }
}
