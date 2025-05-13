package com.train.reservation.system.booktck;
 
import java.util.*;
import java.io.*;
import com.train.reservation.system.data.*;
import com.train.reservation.system.service.*;
import com.train.reservation.system.utility.*;
import com.train.reservation.system.payment.*;
import com.train.reservation.system.passdetail.*;

public class TrainReservationMain
{
    static Traindetail obj = new Traindetail();
    static SeatTypeUtility seatTypeUtility;
    static String choice;
    static PassengerPayment passengerPayment;
    static PassDetail passDetail;
    static PaymentMode paymentmode;
    static TrainInfo tinfo;
    static TrainReservationMain obj2 = new TrainReservationMain();
    public static void main(String[] args) 
    {    
        TrainInfo.addTrainDetails();
        obj.dis();
        
        seatTypeUtility = new SeatTypeUtility();
        seatTypeUtility.seattype();
        passengerPayment = new PassengerPayment();
        passDetail = new PassDetail();

        tinfo = new TrainInfo();
        choice = seatTypeUtility.getUserChoice();
        obj2.disee(choice);
        passDetail.details();
        passengerPayment.payment(seatTypeUtility, passDetail);
        passengerPayment.seattype();
        obj2.dis2();
    }

    public void disee(String choice) {
        final Traindetail obj = new Traindetail();
        System.out.println("-------------------------------------------------------\n");
        if (choice.equals("C")) 
        {
            obj.dis();
        }
        else if (choice.equals("S")) 
        {
            seatTypeUtility.seattype();
        } 
        else if (choice.equals("Y")) 
        {
            
        }
    }

    public void dis2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to print ticket- Y/N");
        String tk = sc.next();

        if(tk.equals("Y"))
        {
            tck();
            System.out.println("Thank You.\n");
            System.out.println("Do you want to Book Return Ticket or New Ticket- Y/N");
            String inp = sc.next();
            
            if(inp.equals("Y"))
            {
                TrainReservationMain.main(null);
            }
            else
            {
                System.out.println("Thank You for using our services.");
            }
        }
        else
        {
            System.out.println("Thank You.\n");
            System.out.println("Do you want to Book Return Ticket or New Ticket- Y/N");
            String inp = sc.next();
            
            if(inp.equals("Y"))
            {
                TrainReservationMain.main(null);
            }
            else
            {
                System.out.println("Thank You for using our services.");
            }
        }
    }

    public static void tck()
    {
        try 
        {
            File myObj = new File("Ticket.txt");
            if(myObj.createNewFile())
            {
                System.out.println("Ticket printed successfully.");
            }

            PrintWriter pw = new PrintWriter(myObj);
            pw.println("------------------------------------------e-Ticketing Services---------------------------------------");
            pw.println("--------------------------------Electronic Reservation Slip (Personal User)--------------------------");
            pw.println("-----------------------------------------------------------------------------------------------------");

            pw.println("PNR No                   : 86021581");
            pw.println("Transaction ID           : 20221101");
            pw.println("Boarding At              : " + obj.st_dcode);
            pw.println("Reservation Upto         : " + obj.st_scode);
            pw.println("Passenger Mobile Number  : " + passDetail.number[0]);
            pw.println("Train details            : " + TrainInfo.tname);
            pw.println("Date and time of Booking : " + passengerPayment.calendar.getTime()); 
            pw.println("Date of Journey          :");
            pw.println("-----------------------------------------------------------------------------------------------------\n");

            pw.println("FARE DETAILS : ");
            pw.println("-----------------------------------------------------------------------------------------------------");
            pw.println("Ticket Fare per person   : Rs. "+passengerPayment.fare);
            pw.println("Service Charge           : Rs.   40");
            pw.println("Total Fare               : Rs. "+passengerPayment.pass_payment);
            pw.println("-----------------------------------------------------------------------------------------------------\n");

            pw.println("PASSENGER DETAILS : ");
            pw.println("-----------------------------------------------------------------------------------------------------");
            pw.println("Sr.No.  Name                       Age       Gender       Current Status");
            for (int i = 0; i < passDetail.getNum_pass(); i++) 
            {
                pw.print(i+1);
                pw.print("   "+passDetail.name[i]+" "+passDetail.lname[i]);
                pw.print("       ");
                pw.print("       "+passDetail.age[i]);
                pw.print("   "+passDetail.gender[i]);
                pw.print("CONFIRMED\n");
            }

            pw.println("\nThank you for using our Services.");
            pw.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        try 
        {
            File myObj2 = new File("Details.txt");
            if(myObj2.createNewFile())
            {
                System.out.println("");
            }

            PrintWriter pw2 = new PrintWriter(myObj2);
            pw2.println("Passenger details : \n");
            pw2.println("-----------------------------------------------------------------------------------------\n");
            pw2.println("Name     : " + passDetail.name[0] + " " + passDetail.lname[0]);
            pw2.println("Password : " + "1234");
            pw2.println("PNR No.  : " + "86021581");
            pw2.close();
        }
        catch (IOException e) 
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
