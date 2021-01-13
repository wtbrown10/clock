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

    public void convertHours(int hours, int minutes, int hoursPassed) {
        int h = (hours + hoursPassed) % 24;
        int m = (minutes) % 60;
        System.out.println(h + ":" + m);
    }

    public void convertMinutes(int hours, int minutes, int minutesPassed) {
        int h = ((hours + (minutesPassed / 60)) % 24);
        int m = ((minutes + minutesPassed) % 60);
        System.out.println(h + ":" + m);

    }

   public void convertHours(int hours, int minutes, int hoursPassed, boolean standard) {
       if (standard) {
           int h = (hours + hoursPassed) % 12;
           int m = (minutes) % 60;
           System.out.println("Standard Time: " + h + ":" + m);
           return;
       }
           int h = (hours + hoursPassed) % 24;
           int m = (minutes) % 60;
           System.out.println("Military Time: " + h + ":" + m);
       }


    public void convertMinutes(int hours, int minutes, int minutesPassed, boolean standard) {
       if (standard) {
           int h = ((hours + (minutesPassed / 60)) % 12);
           int m = ((minutes + minutesPassed) % 60);
           System.out.println("Standard Time: " + h + ":" + m );
           return;
       }
            int h = ((hours + (minutesPassed / 60)) % 24);
            int m = ((minutes + minutesPassed) % 60);
            System.out.println("Military Time: " + h + ":" + m);
    }

    public String morningOrNight(int num) {
       if  (((num/12) % 2) < 1) {
            return "am";
        }
       return "pm";
    }

    public String morningOrNight2(int num) {
        if  ((num % 2) < 1) {
            return "am";
        }
        return "pm";
    }


    public void convertHours(int hours, int minutes, String suffix, int hoursPassed, boolean standard) {
       if (standard) {
           int h = (hours + hoursPassed) % 12;
           int m = (minutes) % 60;

           /*((hours + hoursPassed/12) % 2) < 1*/
           System.out.println("Standard Time: " + h + ":" + m + morningOrNight(h));

           return;
       }
        int h = (hours + hoursPassed) % 24;
        int m = (minutes) % 60;
        System.out.println("Military Time: " + h + ":" + m);
    }

    public void convertMinutes(int hours, int minutes, String suffix, int minutesPassed, boolean standard) {
        if (standard) {
            int h = ((hours + (minutesPassed / 60)) % 12);
            int h1 = (hours + (minutesPassed / 60));
            int m = ((minutes + minutesPassed) % 60);
            System.out.println("Standard Time: " + h + ":" + m + morningOrNight2(h1) );
            return;
        }
        int h = ((hours + (minutesPassed / 60)) % 24);
        int m = ((minutes + minutesPassed) % 60);
        System.out.println("Military Time: " + h + ":" + m);
    }

}
