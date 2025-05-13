package com.train.reservation.system.utility;
import java.util.*;
public class FirstACUtility implements SeatUtility {
    static int avail = 2;
    @Override
    public String getSeatAvailability() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSeat Availability :\n");
        System.out.println("Available : "+avail);
        System.out.println("Press C to change Station codes");
        System.out.println("Press Y to continue to book a tickets");
        System.out.println("Press S to change Seattype prefrence");
        avail--;

        return sc.next();

    }
}