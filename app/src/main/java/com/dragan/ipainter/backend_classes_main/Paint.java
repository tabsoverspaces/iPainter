package com.dragan.ipainter.backend_classes_main;

/**
 * Created by Dragan on 1/18/2018.
 */

public class Paint {

    private String name;
    private double litersPerBucket;
    private double metersPerBucket;
    private double averageConsumptionPerMeterSquared;
    private double pricePerBucket;
    private double pricePerLiter;

    /**
     * Basic constructor with no parameters
     */
    public Paint()
    {

    }

    public Paint(String name, double litersPerBucket, double metersPerBucket, double pricePerBucket)
    {
        // set initial attribute values
        this.name = name;
        this.litersPerBucket = litersPerBucket;
        this.metersPerBucket = metersPerBucket;
        this.pricePerBucket = pricePerBucket;

        // calculate dependant attributes
        this.averageConsumptionPerMeterSquared = this.litersPerBucket / this.metersPerBucket;
        this.pricePerLiter = this.pricePerBucket / this.litersPerBucket;
    }

    //////////////////////
    // GETTERS AND SETTERS
    //////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLitersPerBucket() {
        return litersPerBucket;
    }

    public void setLitersPerBucket(double litersPerBucket) {
        this.litersPerBucket = litersPerBucket;
    }

    public double getMetersPerBucket() {
        return metersPerBucket;
    }

    public void setMetersPerBucket(double metersPerBucket) {
        this.metersPerBucket = metersPerBucket;
    }

    public double getAverageConsumptionPerMeterSquared() {
        return averageConsumptionPerMeterSquared;
    }

    public void setAverageConsumptionPerMeterSquared(double averageConsumptionPerMeterSquared) {
        this.averageConsumptionPerMeterSquared = averageConsumptionPerMeterSquared;
    }

    public double getPricePerBucket() {
        return pricePerBucket;
    }

    public void setPricePerBucket(double pricePerBucket) {
        this.pricePerBucket = pricePerBucket;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
}
