package com.jlastudioiv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ); // scanner.nextLine();

        VehicleInfo vehicleInfo1 = new VehicleInfo();
        // User input later: scanner.nextLine();
        vehicleInfo1.setVIN(1);
        vehicleInfo1.setMilesOdometer(12);
        vehicleInfo1.setOilOdometer(22);
        vehicleInfo1.setEngineSize(2);

        VehicleInfo vehicleInfo2 = new VehicleInfo();
        // User input later: scanner.nextLine();
        vehicleInfo2.setVIN(2);
        vehicleInfo2.setMilesOdometer(22);
        vehicleInfo2.setOilOdometer(32);
        vehicleInfo2.setEngineSize(3);

        VehicleInfo vehicleInfo3 = new VehicleInfo();
        // User input later: scanner.nextLine();
        vehicleInfo3.setVIN(3);
        vehicleInfo3.setMilesOdometer(32);
        vehicleInfo3.setOilOdometer(42);
        vehicleInfo3.setEngineSize(4);

        TelematicsService telematicsService = new TelematicsService();
//        telematicsService.addReport(vehicleInfo1);
//        telematicsService.addReport(vehicleInfo2);
//        telematicsService.addReport(vehicleInfo3);

        telematicsService.readReports();
    }


}
