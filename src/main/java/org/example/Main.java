package org.example;
import java.util.*;
import java.util.logging.*;

class Main{
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Simplecalculator k = new Simplecalculator();
        Scanner sc=new Scanner(System.in);
        l.info("Enter the num1:");
        double n1=sc.nextDouble();
        l.info("Enter the num2:");
        double n2=sc.nextDouble();
        double num1=k.setnum1(n1);
        double num2=k.setnum2(n2);
        boolean t=true;
        while(t){
            l.info("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            l.info("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    Addition add=new Addition();
                    String ad="Addition of two element: "+add.calculate(num1, num2);
                    l.info(ad);
                    break;
                case 2:
                    Subtraction sub=new Subtraction();
                    String su="Subtraction of two elements: "+sub.calculate(num1, num2);
                    l.info(su);
                    break;
                case 3:
                    Multiplication mul=new Multiplication();
                    String mu="Multiplication of two elements: "+ mul.calculate(num1, num2);
                    l.info(mu);
                    break;
                case 4:
                    Division div=new Division();
                    String di="Division of two elements: "+ div.calculate(num1, num2);
                    l.info(di);
                    break;
                case 5:
                    t=false;
                    break;
                default:
                    l.info("invalid choice: choose correct option");
            }
        }

    }
}