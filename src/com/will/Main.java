package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Utility hours = new Utility();

        System.out.println("version 1: ");
        hours.convertHours(21, 00, 5, false);
        hours.convertHours(21, 00, 36 , false);

        System.out.println("version 2: ");
        hours.convertHours(21, 00, -5 , false);
        System.out.println("version 3: ");
        hours.convertMinutes(21, 00, 147, false);
        System.out.println("version 4: ");
        hours.convertHours(21, 27, 2, true);
        System.out.println(hours.toString(21, 27, 2, true));

    }
}
