package com.jlastudioiv;

public class VehicleInfo {
    private int VIN;
    private double milesOdometer;
    private double consumption;
    private double oilOdometer;
    private double engineSize;

    void report(VehicleInfo vehicleInfo) {

    }

    // empty constructor
    public VehicleInfo() {
    }
    // getters and setters
    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getMilesOdometer() {
        return milesOdometer;
    }

    public void setMilesOdometer(double milesOdometer) {
        this.milesOdometer = milesOdometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getOilOdometer() {
        return oilOdometer;
    }

    public void setOilOdometer(double oilOdometer) {
        this.oilOdometer = oilOdometer;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
