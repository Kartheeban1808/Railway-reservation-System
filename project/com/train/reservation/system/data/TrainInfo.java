package com.train.reservation.system.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class TrainInfo {

    private static Map<String, List<String>> trainDetailMap = new HashMap<>();
    private static List<String> NzmNgpList = new ArrayList<>();
    private static List<String> CsmtNgpList = new ArrayList<>();
    private static List<String> NzmJhsList = new ArrayList<>();
    public static String tname;

    public static void addTrainDetails() {
        NzmNgpList.add("Train Name                        Train Number  Arrival Time   Departure Time");
        NzmNgpList.add("1. Rajdhani Express(NZM<->MAS)       12741        20:25pm         20:30pm");
        NzmNgpList.add("2. Telangana Express(NDLS<->HYD)     12852        15:10pm         15:15pm");
        NzmNgpList.add("3. Tamil Nadu Express(NDLS<->MGR)    12123        12:34pm         12:39pm");
        trainDetailMap.put("NZM-NGP", NzmNgpList);
        trainDetailMap.put("JHS-NGP", NzmNgpList);

        CsmtNgpList.add("Train Name                       Train Number  Arrival Time   Departure Time");
        CsmtNgpList.add("1. Duronto Express(NGP<->CSMT)      12600         -----          20:40pm");
        CsmtNgpList.add("2. Sewagram Express(NGP<->CSMT)     12852         -----          21:15pm");
        CsmtNgpList.add("3. Garib Rath Express(HWR<->CSMT)   12223        17:07pm         17:10pm");
        trainDetailMap.put("CSMT-NGP", CsmtNgpList);
        trainDetailMap.put("CSMT-NK", CsmtNgpList);

        NzmJhsList.add("Train Name                           Train Number   Arrival Time   Departure Time");
        NzmJhsList.add("1. Rajdhani Express(NZM<->MAS)          12741         20:25pm         20:30pm");
        NzmJhsList.add("2. Telangana Express(NDLS<->HYD)        12852         21:45pm         21:55pm");
        NzmJhsList.add("3. Tamil Nadu Express(NDLS<->MGR)       12123         12:34pm         12:39pm");
        NzmJhsList.add("4. Rajdhani Express(NZM<->CSMT)         22222         20:25pm         20:30pm");
        NzmJhsList.add("5. Shatabdi Express(NDLS<->BPL)         12002         09:10am         09:15am");
        NzmJhsList.add("6. S.Kranti(UP) Express(NZM<->MKP)      12123         01:30am         01:37am");
        trainDetailMap.put("NZM-JHS", NzmJhsList);
    }

    public static List<String> getTrainDetails(String sourceDestination) {
        Scanner sc = new Scanner(System.in);
        if (!trainDetailMap.containsKey(sourceDestination)) {
            System.out.println("Enter valid Station code.");
            System.exit(0);
        }
        return trainDetailMap.get(sourceDestination);        
    }

    static String happpy = " ";

    public static String getTrainDtails1(String sourceDestination) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Train index: ");
        int i = sc.nextInt();
        if (trainDetailMap.containsKey(NzmNgpList)) {
            if (i == 1) {
                System.out.println("\nSelected Train is : ");
                System.out.println(NzmNgpList.get(i));
                tname = NzmNgpList.get(i);
                System.out.println("*No catering will be provided due to novel corona virus*");
            } else {
                System.out.println("\nSelected Train is : ");
                System.out.println(NzmNgpList.get(i));
                tname = NzmNgpList.get(i);
            }
        } else if (trainDetailMap.containsKey(CsmtNgpList)) {
            if (i == 1) {
                System.out.println("\nSelected Train is : ");
                System.out.println(CsmtNgpList.get(i));
                tname = CsmtNgpList.get(i);
                System.out.println("*No catering will be provided due to novel corona virus*");
            } else {
                System.out.println("\nSelected Train is : ");
                System.out.println(CsmtNgpList.get(i));
                tname = CsmtNgpList.get(i);
            }
        } else {
            if (i == 1) {
                System.out.println("\nSelected Train is : ");
                System.out.println(NzmJhsList.get(i));
                tname = NzmJhsList.get(i);
                System.out.println("*No catering will be provided due to novel corona virus*");
            } else {
                System.out.println("\nSelected Train is : ");
                System.out.println(NzmJhsList.get(i));
                tname = NzmJhsList.get(i);
            }
        }
        return happpy;
    }
}