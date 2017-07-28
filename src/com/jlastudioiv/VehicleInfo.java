package com.jlastudioiv;

public class VehicleInfo {
    private int VIN;
    private double milesOdometer;
    private double consumption;
    private double oilOdometer;
    private double engineSize;

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "VIN=" + VIN +
                ", milesOdometer=" + milesOdometer +
                ", consumption=" + consumption +
                ", oilOdometer=" + oilOdometer +
                ", engineSize=" + engineSize +
                '}';
    }

    void report(VehicleInfo vehicleInfo) {

    }

    // empty constructor
    public VehicleInfo() {
    }

    public VehicleInfo(int VIN, double milesOdometer, double consumption, double oilOdometer, double engineSize) {
        this.VIN = VIN;
        this.milesOdometer = milesOdometer;
        this.consumption = consumption;
        this.oilOdometer = oilOdometer;
        this.engineSize = engineSize;
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
