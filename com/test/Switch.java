package com.test;

import java.util.Scanner;

public class Switch {

    static int dayNumber;
    static int monthNumber;


    public static void main(String[] args){
        
        Scanner classscanner = new Scanner(System.in);

        System.out.println("enter day number");


        dayNumber = classscanner.nextInt();

        System.out.println("enter Month number");
        monthNumber = classscanner.nextInt();
        
        

        determineNameOfMonth(monthNumber);
        determineNameOfDay(  dayNumber);
        isWeekDay(dayNumber);


    }

    public static boolean isWeekDay( int dayNumber){

        if((dayNumber) != 1 ){

            System.out.println(dayNumber);


        }


        return true;

    }



    public static void determineNameOfDay( int dayNumber){

        //Scanner scanner = new Scanner(System.in);

        //dayNumber = scanner.nextInt();

        switch(dayNumber){

            case 1 : 
                System.out.println("Sun");
                break;

            case 2 : 
                System.out.println("Mon");
                break;
            case 3 : 
                System.out.println("Tue");
                break;
            default : 
                System.out.println("break");

        }


    }
    
    public static void determineNameOfMonth( int monthNumber){

        //Scanner scanner = new Scanner(System.in);

        //1monthNumber = scanner.nextInt();

        switch(monthNumber){

            case 1 : 
                System.out.println("Jan");
                break;

            case 2 : 
                System.out.println("Feb");
                break;
            case 3 : 
                System.out.println("Mar");
                break;
            default : 
                System.out.println("default");

        }


    }
}
