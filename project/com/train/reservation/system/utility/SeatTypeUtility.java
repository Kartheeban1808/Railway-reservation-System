package com.train.reservation.system.utility;

import java.util.*;

public class SeatTypeUtility {
        Scanner sc = new Scanner(System.in);
        
        private String userChoice;
        private String FinalChoice;
        SeatUtility utility;
        public String getUserChoice() {
                return userChoice;
        }
        public String getFinalChoice(){
                return FinalChoice;
        }
        public void seattype() {
                System.out.println("\nSelect the class : ");
                System.out.println("1. SLEEPER CLASS");
                System.out.println("2. THIRD AC");
                System.out.println("3. SECOND AC");
                System.out.println("4. FIRST AC\n");
                System.out.println("Enter the number(1-4) for the class which you are willing to get a reservation in for status of availability::");
               userChoice=sc.next();
               FinalChoice=userChoice;
                switch (userChoice) {
                        case "1": {
                                utility = new SlepperUtilityImpl();
                                userChoice = utility.getSeatAvailability();
                        }
                                break;
                        case "2":
                                utility = new ThirdACUtility();
                                userChoice = utility.getSeatAvailability();
                                break;
                        case "3":
                                utility = new SecondACUtility();
                                userChoice = utility.getSeatAvailability();
                                break;
                        case "4":
                                utility = new FirstACUtility();
                                userChoice = utility.getSeatAvailability();
                                break;
                        default:
                                System.out.println("Enter the number which are given in above only.");
                                System.exit(0);
                }

        }

}