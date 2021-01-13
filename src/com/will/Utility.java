package com.will;

public class Utility {
//    private int hours;
//    private int minutes;
//    private int hoursPassed;
//    private int minutesPassed;
//    private boolean standard;

   public Utility() {
//        this.hours = hours;
//        this.minutes = minutes;
//        this.hoursPassed = hoursPassed;
//        this.minutesPassed = minutesPassed;
//        this.standard = standard;
    }

    public void convertHours(int hours, int minutes, int hoursPassed, boolean standard) {
        int h = (hours + hoursPassed) % 24;
        int m = (minutes) % 60;
        System.out.println(h + ":" + m);
    }

    public void convertMinutes(int hours, int minutes, int minutesPassed, boolean standard) {
        int h = ((hours + (minutesPassed / 60)) % 24);
        int m = ((minutes + minutesPassed) % 60);
        System.out.println(h + ":" + m);

    }

   @Override
   public String toString(int hours, int minutes, int hoursPassed, boolean standard) {
        if (standard) {
            int h = (hours + hoursPassed) % 12;
            int m = (minutes) % 60;
            System.out.println("standard time: " + h + ":" + m + "PM");
        }
            return "";

    }

}
