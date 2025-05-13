package com.train.reservation.system.main;

import java.util.*;
import com.train.reservation.system.booktck.*;
import com.train.reservation.system.login.*;

public class sysmain 
{
    static Trainsec ts = new Trainsec();
    static int choice;
    static int fchoice;

    public static int display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************************************************************************************************");
        System.out.println("                                      TRAIN RESERVATION SYSTEM                                                ");
        System.out.println("**************************************************************************************************************\n");
        System.out.println("Welcome to Train Reservation System");
        System.out.println("Please select the service: \n");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("1. Book a Ticket                        3. View Train Schedule ");
        System.out.println("2. Cancel a Ticket                      4. Exit");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.print("Selected Choice : ");
        choice = sc.nextInt();

        return choice;
    }
    public static void main(String[] args) 
    {
        fchoice = display();
        switch (fchoice) 
        {
            case 1:
                TrainReservationMain.main(null);
                break;
            case 2:
                cancel.main(args);

                break;
            case 3:
                try 
                {
                    ts.main(args);
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println("\nThank you.");
                System.exit(0);
                break;
        }
    }
}
