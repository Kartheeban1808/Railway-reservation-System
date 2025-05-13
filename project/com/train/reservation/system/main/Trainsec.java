package com.train.reservation.system.main;

import java.io.*;
import java.util.Scanner;

public class Trainsec {
    public void main(String[] args) throws Exception {
        File file = new File("E:\\CODE\\PROJECTS\\JAVA PROJECT\\project\\trainschedule\\TrainSchedule.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
}
