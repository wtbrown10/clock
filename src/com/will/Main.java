package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Utility hours = new Utility();

        System.out.println("version 1: ");
        hours.convertHours(21, 00, 5);
        hours.convertHours(21, 00, 36);

        System.out.println("version 2: ");
        hours.convertHours(21, 00, -5);
        System.out.println("version 3: ");
        hours.convertMinutes(21, 50, 147);
        System.out.println("version 4: ");
        hours.convertHours(21, 27, 2, false);
        hours.convertMinutes(21, 0, 147, true);

        System.out.println("version 5: ");
        hours.convertHours(9, 27, "am", 12, true);
        hours.convertMinutes(9,12,"pm", 147, true);


    }
}
