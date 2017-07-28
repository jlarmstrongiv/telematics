package com.jlastudioiv;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelematicsService {
    void report (VehicleInfo vehicleInfo) {
    }
    void addReport (VehicleInfo vehicleInfo) {
        String fileName = Integer.toString(vehicleInfo.getVIN()) + ".json";
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(vehicleInfo);
            System.out.println(json);
            try {
                File file = new File(fileName);
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(json);
                fileWriter.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
    List<VehicleInfo> readReports () {
        File file = new File(".");
        List<VehicleInfo> multipleFileContents = new ArrayList<>();
        for (File myFile : file.listFiles()) {
            if (myFile.getName().endsWith(".json")) {
                try {
                    Scanner myFileScanner = new Scanner(myFile);
                    String myFileContents = myFileScanner.nextLine();
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        VehicleInfo vehicleInfo = mapper.readValue(myFileContents, VehicleInfo.class);
                        multipleFileContents.add(vehicleInfo);
                    } catch (IOException ex) { // not JsonMappingException
                        ex.printStackTrace();
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("Could not find file *" + myFile.getName() + "*");
                    ex.printStackTrace();
                    return null;
                }
            }
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(multipleFileContents);
//            System.out.println(json);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return multipleFileContents;
    }

//    void updateHtml (List<Object> multipleFileContents) {
//
//
//        for (Object fileContents : multipleFileContents) {
//            VehicleInfo fileVehicleInfo = new VehicleInfo();
//            fileVehicleInfo.toString();
//        }
//    }
//    String[] readReports () {
//        File file = new File(".");
//        List<List> multipleFileContents = new ArrayList<>();
//        for (File myFile : file.listFiles()) {
//            if (myFile.getName().endsWith(".json")) {
//                try {
//                    Scanner myFileScanner = new Scanner(myFile);
//                    List<String> myFileContents = new ArrayList<>();
//                    while (myFileScanner.hasNext()) {
//                        myFileContents.add(myFileScanner.nextLine());
////                        return myFileContents.toArray(new String[0]);
//                    }
//                    multipleFileContents.add(myFileContents);
//                } catch (FileNotFoundException ex) {
//                    System.out.println("Could not find file *" + myFile.getName() + "*");
//                    ex.printStackTrace();
//                    return null;
//                }
//                // Now you have a File object named "myFile".
//                // You can use this in the FileReader constructor
//                // new FileReader(myFile)
//            }
//        }
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writeValueAsString(multipleFileContents);
//            System.out.println(json);
//        } catch (JsonProcessingException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
}


