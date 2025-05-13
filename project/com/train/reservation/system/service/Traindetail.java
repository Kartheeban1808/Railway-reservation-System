package com.train.reservation.system.service;
import java.util.*;
import java.util.Scanner;
//import com.train.reservation.system.utility.*;
import com.train.reservation.system.data.TrainInfo;

public class Traindetail {
    Scanner sc = new Scanner(System.in);
    public String st_dcode; 
    public String st_scode;

    public void dis() 
    {
        System.out.println("Station Information: ");
        System.out.println("-------------------------------------------------------\n");
        System.out.println("Please, enter valid station codes only as given below::");
        System.out.println("-------------------------------------------------------");
        System.out.println("Hazrat Nizamuddin--NZM");
        System.out.println("New Delhi-- NDLS");
        System.out.println("Nagpur--NGP");
        System.out.println("Bhopal--BPL");
        System.out.println("Chattrapati Shivaji Maharaj Terminus--CSMT");
        System.out.println("Chennai Central--MAS");
        System.out.println("Nashik Road--NK");
        System.out.println("Jhansi--JHS");
        System.out.println("Jaipur--JP");
        System.out.println("-------------------------------------------------------\n");
        System.out.print("Please enter the Source Code      : ");
        st_dcode = sc.nextLine();
        System.out.print("Please enter the Destination Code : ");
        st_scode = sc.nextLine();

        System.out.println("\nAvailable Trains are as follows : \n");
        ArrayList<String> a = new ArrayList<>();
        Iterator itr = TrainInfo.getTrainDetails(st_dcode+"-"+st_scode).iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
        TrainInfo.getTrainDtails1(st_dcode);
    }
}