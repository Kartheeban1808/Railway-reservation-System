package com.train.reservation.system.utility;

public enum SeatType {
    FIRSTAC(4),
    SECONDAC(3),
    THIRDAC(2),
    SLEEPER(1);
    private int value;

    SeatType(int seatType) {
        this.value = seatType;
    }

    public int getValue()
    {
        return value;
    }
}
