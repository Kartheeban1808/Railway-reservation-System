package com.train.reservation.system.login;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filedet {
    public static void main(String[] args) throws IOException
    {   
        BufferedReader reader1 = new BufferedReader(new FileReader("E:\\CODE\\PROJECTS\\JAVA PROJECT\\project\\Details.txt"));
         
        BufferedReader reader2 = new BufferedReader(new FileReader("E:\\CODE\\PROJECTS\\JAVA PROJECT\\project\\canceldetails.txt"));
         
        String line1 = reader1.readLine();
         
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
        int lineNum = 1;
         
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
             
            lineNum++;
        }
         
        if(areEqual)
        {
            System.out.println("Deatils are verified successfully.");
            System.out.println("Your payment will be refunded in 2 to 3 working days.\n");
            System.out.println("-----------------------------------------------------------------------------------------\n");
            System.out.println("Thank you for using our services");
        }
        else
        {
            System.out.println("Details not verified");
            System.out.println("Please provide proper details.");
            System.out.println("\nThank you.");
        }
         
        reader1.close();
         
        reader2.close();
    }
}
