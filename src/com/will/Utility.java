package com.will;

public class Utility {

    public void convertHours(int hours, int minutes, int hoursPassed) {
        int h = (hours + hoursPassed) % 24;
        int m = (minutes) % 60;
        System.out.println(h + ":" + m);
    }

    public void convertMinutes(int hours, int minutes, int minutesPassed) {
        int h = ((hours + ((minutes + minutesPassed) / 60)) % 24);
        int m = ((minutes + minutesPassed) % 60);
        System.out.println(h + ":" + m);

    }

   public void convertHours(int hours, int minutes, int hoursPassed , boolean standard) {
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
           int h = ((hours + ((minutes + minutesPassed)/ 60)) % 12);
           int m = ((minutes + minutesPassed) % 60);
           System.out.println("Standard Time: " + h + ":" + m );
           return;
       }
            int h = ((hours + (minutesPassed / 60)) % 24);
            int m = ((minutes + minutesPassed) % 60);
            System.out.println("Military Time: " + h + ":" + m);
    }

    private String amOrPm1(int num) {
       if  (((num/12) % 2) < 1) {
            return "am";
        }
       return "pm";
    }

    private String amOrPm2(int num) {
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
            System.out.println("Standard Time: " + h + ":" + m + amOrPm1(h));

            return;
        } else if (suffix == "pm"){
            int h = (hours + 12 + hoursPassed) % 24;
            int m = (minutes) % 60;
            System.out.println("Military Time: " + h + ":" + m);
       } else if (suffix == "am"){
           int h = (hours + hoursPassed) % 24;
           int m = (minutes) % 60;
           System.out.println("Military Time: " + h + ":" + m);
       }

    }

    public void convertMinutes(int hours, int minutes, String suffix, int minutesPassed, boolean standard) {
        if (standard) {
            int h = ((hours + ((minutes + minutesPassed) / 60)) % 12);
            int h1 = (hours + ((minutes + minutesPassed) / 60));
            int m = ((minutes + minutesPassed) % 60);
            System.out.println("Standard Time: " + h + ":" + m + amOrPm2(h1) );
            return;
        }
        int h = (((hours + 12) + ((minutes + minutesPassed) / 60)) % 24);
        int m = ((minutes + minutesPassed) % 60);
        System.out.println("Military Time: " + h + ":" + m);

    }

}
