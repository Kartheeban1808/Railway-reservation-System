package com.train.reservation.system.passdetail;
import java.util.Scanner;

public class PassDetail 
{
    public String name[] = new String[4];
    public String lname[] = new String[4];
    public String age[] = new String[4];
    public String gender[] = new String[4];
    public String number[] = new String[4];
    
    private int num_pass;
        Scanner sc = new Scanner(System.in);
        PassDetail passDetail;

        public int getNum_pass() {
                return num_pass;
        }
    
    public void details() 
    {
        System.out.println("PASSENGER DETAILS : \n");
        System.out.print("Enter the number of passengers for booking a ticket : ");
        num_pass = sc.nextInt();

        for (int i = 0; i < num_pass; i++) 
        {
            System.out.print("Enter First Name : ");
            name[i]=sc.next();

            System.out.print("Enter Last name : ");
            lname[i]=sc.next();

            System.out.print("Enter Age : ");
            age[i]=sc.next();

            System.out.print("Enter Gender : ");
            gender[i]=sc.next();

            System.out.print("Enter Mobile Number : ");
            number[i]=sc.next();
            System.out.print("\n");
        }
        System.out.println("-------------------------------------------------------\n");
        System.out.println("SrNo.  First Name        Last Name      Age   Gender   Mobile Number");
        for (int i = 0; i < num_pass; i++) 
        {
            System.out.print(i+1);
            System.out.print("   "+name[i]);
            System.out.print("       "+lname[i]);
            System.out.print("       "+age[i]);
            System.out.print("   "+gender[i]);
            System.out.print("   "+number[i]+"\n");
        }


    }
}