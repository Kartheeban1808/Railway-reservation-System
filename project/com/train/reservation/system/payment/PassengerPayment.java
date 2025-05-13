package com.train.reservation.system.payment;

import java.util.*;
import com.train.reservation.system.utility.SeatTypeUtility;
import com.train.reservation.system.passdetail.PassDetail;

public class PassengerPayment 
{
    Scanner sc = new Scanner(System.in);
    PaymentMode paymentMode;
    public long pass_payment;
    public long fare;
    public Calendar calendar = Calendar.getInstance();
    public void payment(SeatTypeUtility seatTypeUtility, PassDetail passeengerDetail) 
    {
        String s = seatTypeUtility.getFinalChoice();
        int  num_pass = passeengerDetail.getNum_pass();
        
        
        System.out.println("\n----------------------FARE DETAILS---------------------\n");

        if (s.equals("1")) 
        {
            System.out.println("Total travelling distance : 648km");
            fare = 405;
            System.out.println("Ticket Fare per person    : Rs." + fare);
            System.out.println("Service Charge            : Rs.40");
            pass_payment = num_pass * fare + 40;
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Total Fare :: Rs. " + pass_payment);
        } 
        else if (s.equals("2")) 
        {
            System.out.println("Total travelling distance : 648km");
            fare = 1060;
            System.out.println("Ticket Fare per person    : Rs." + fare);
            System.out.println("Service Charge            : Rs.40");
            pass_payment = num_pass * fare + 40;
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Total Fare :: Rs. " + pass_payment);
        } 
        else if (s.equals("3")) 
        {
            System.out.println("Total travelling distance : 648km");
            fare = 1505;
            System.out.println("Ticket Fare per person    : Rs."+fare);
            System.out.println("Service Charge            : Rs.40");
            pass_payment = num_pass * fare + 40;
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Total Fare :: Rs. " + pass_payment);
        } 
        else 
        {
            System.out.println("Total travelling distance : 648km");
            fare = 2045;
            System.out.println("Ticket Fare per person    : Rs."+fare);
            System.out.println("Service Charge            : Rs.40");
            pass_payment = num_pass * fare + 40;
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Total Fare :: Rs. " + pass_payment);
        }
    }

    public void seattype() {
        System.out.println("\n--------------------PAYMENT METHODS--------------------\n");
        System.out.println("Select the method-");
        System.out.println("Press 1 for Debit Card");
        System.out.println("Press 2 for Credit Card");
        System.out.println("Press 3 for BHIM UPI");
        String choice = sc.next();
        switch (choice) {
            case "1": 
                paymentMode = new DebitCard();
                paymentMode.Paymentmode();
                break;
            case "2":
                paymentMode = new CreditCard();
                paymentMode.Paymentmode();
                break;
            case "3":
                paymentMode = new BheemUPI();
                paymentMode.Paymentmode();
                break;
            default:
                System.out.println("Please, enter the number which are given above.");
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------Exit--------------------------");
        }
    }

    class BheemUPI extends PaymentMode {
        @Override
        public void Paymentmode() {
            System.out.println("-----------------------BHIM UPI-----------------------");
            System.out.println("Enter UPI ID -");
            String card_num = sc.next();
            System.out.println("Enter Password -");
            String passward = sc.next();
            System.out.println("-------------------------------------------------------");
            System.out.println("-----------------------Loading-------------------------");
            System.out.println("Congratulations,You have successfully booked a ticket at " + calendar.getTime());
            System.out.println("\n");
        }
    }

    class DebitCard extends PaymentMode{
        @Override
        public void Paymentmode(){
            System.out.println("-----------------------DEBIT CARD----------------------");
            System.out.println("Card Details -");
            System.out.println("Enter Card Number -");
            String card_num=sc.next();
            System.out.println("Enter Card Holder Name -");
            String name=sc.next();
            System.out.println("Enter Validity of Card -");
            String Valid=sc.next();
            System.out.println("Enter CVV number -");
            String cvv=sc.next();
            System.out.println("Enter Password -");
            String passward=sc.next();
            System.out.println("-------------------------------------------------------");
            System.out.println("-----------------------Loading-------------------------");
            System.out.println("Congratulations,You have successfully booked a ticket at " + calendar.getTime());
            System.out.println("\n");
        }
    }

    class CreditCard extends PaymentMode{
        @Override
        public void Paymentmode()
        {
            System.out.println("--------------------CREDIT CARD-----------------------");
            System.out.println("Card Details -");
            System.out.println("Enter Card Number -");
            String card_num=sc.next();
            System.out.println("Enter Card Holder Name -");
            String name=sc.next();
            System.out.println("Enter Validity of Card -");
            String Valid=sc.next();
            System.out.println("Enter CVV number -");
            String cvv=sc.next();
            System.out.println("Enter Password -");
            String passward=sc.next();
            System.out.println("-------------------------------------------------------");
            System.out.println("-----------------------Loading-------------------------");
            System.out.println("Congratulations,You have successfully booked a ticket at " + calendar.getTime());
            System.out.println("\n");
        }
    }
}