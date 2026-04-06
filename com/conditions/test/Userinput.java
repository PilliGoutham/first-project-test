package com.conditions.test;

import java.util.Scanner;

public class Userinput{

    int i;
    int j;
    int add,sub,mul,div;
    
    public static void main(String[] args){

        

        System.out.println("Enter any 2 numbers : ");

        Userinput object = new Userinput();

        Scanner scanner = new Scanner(System.in);

        object.i= scanner.nextInt();
        object.j= scanner.nextInt();
        
        System.out.println("Numbers are :" + object.i+" , "+object.j);

        System.out.println("Choose any below choices \n 1. Add \n 2. Sub \n 3. Mul \n 4. Div");
        
        Scanner choice = new Scanner(System.in);

        int userChoice = choice.nextInt();
        object.add= userChoice;
        object.sub= userChoice;
        object.mul= userChoice;
        object.div= userChoice;




        
        if(object.add==1){
            object.Add();
        }
        else if(object.sub==2){
            object.Sub();
        }
        else if(object.mul==3){
            object.Mul();
        }else if(object.div==4){
            object.Div();
        }

        scanner.close();
        choice.close();
        
    }

    public void Add(){

        
        //Userinput object = new Userinput();
        System.out.println(" Addition :: " + (i + j));

    }

    public void Sub(){

        
        //Userinput object = new Userinput();
        System.out.println(" Substraction :: " + (i - j));

    }
    public void Mul(){

        
        //Userinput object = new Userinput();
        System.out.println(" Mulitplication :: " + (i * j));

    }
    public void Div(){

        
        //Userinput object = new Userinput();
        System.out.println(" Division :: " + (i / j));

    }





}