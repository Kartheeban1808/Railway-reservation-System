package com.train.reservation.system.login;

import java.util.*;
import java.io.*;

public class cancel {

    static String cname;
    static String cpass;
    static String cpnr;
    static filedet det = new filedet();
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("TICKET CANCELATION : ");
        System.out
                .println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Please provide the following details same as on the ticket : \n");
        System.out.print("Enter Full Name : ");
        cname = sc.nextLine();
        System.out.print("Enter password  : ");
        cpass = sc.nextLine();
        System.out.print("Enter PNR No.   : ");
        cpnr = sc.nextLine();

        try {
            File myObj1 = new File("canceldetails.txt");
            if (myObj1.createNewFile()) {
            }
            System.out.println("\nDetails sent for authentication");
            System.out.println("-----------------------------------------------------------------------------------------\n");
            PrintWriter pw1 = new PrintWriter(myObj1);
            pw1.println("Passenger details : \n");
            pw1.println("-----------------------------------------------------------------------------------------\n");
            pw1.println("Name     : " + cname);
            pw1.println("Password : " + cpass);
            pw1.println("PNR No.  : " + cpnr);
            pw1.close();

            System.out.println("Dear User, we have received your request for cancellation of ticket.");

            filedet.main(null);
        } 
        catch (IOException e) {
            System.out.println("Please provide proper details.");
            e.printStackTrace();
        }

    }
}
