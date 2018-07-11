package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

//        baiTapMot();
        baiTapBa();
    }
    public static void baiTapMot(){
        Scanner scanner=new Scanner(System.in);
        double weight, height, bmi;
        System.out.printf("Your weight :");
        weight=scanner.nextDouble() ;
        System.out.printf("Your height :");
        height=scanner.nextDouble();
        bmi=weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","interpretation\n");

        if(bmi<18.0)
            System.out.printf("%-20.2s%s","bmi","underweight\n");
        else if(bmi<25.0)
            System.out.printf("%-20.2s%s","bmi","Normal\n");

        else if(bmi<30.0)
            System.out.printf("%-20.2s%s","bmi","overweight\n");
        else
            System.out.printf("%-20.2f%s","bmi","obese\n");

    }
    public static void baiTapHai(){
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.printf("Enter a year :");
        year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0);
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
        } else {
            System.out.printf("%d is a leap year", year);
        }
    }
    public static void baiTapBa(){
        Scanner scanner = new Scanner(System.in);
        int so, dem,hangchuc,hangdonvi,hangtram;

        System.out.printf("Enter a so can doc :");
        so = scanner.nextInt();
        hangtram=so/100;
        hangchuc=(so%100)/10;
        hangdonvi=so%10;
        System.out.println(" hang don vi la "+ hangdonvi +"  hang tram  "+hangtram+"  hang chuc  "  +hangchuc);
        switch (hangtram){
            case 1 :System.out.printf("one  hundred"); break;
            case 2 :System.out.printf("two hundred"); break;
            case 3 :System.out.printf("three  hundred"); break;
            case 4 :System.out.printf("four  hundred"); break;
            case 5 :System.out.printf("five  hundred"); break;
            case 6 :System.out.printf("six  hundred"); break;
            case 7 :System.out.printf("seven  hundred"); break;
            case 8 :System.out.printf("eight hundred"); break;
            case 9 :System.out.printf("nine hundred"); break;
            case 10 :System.out.printf("ten hundred"); break;

        }
        switch (hangchuc){
            case 1 :System.out.printf("  ten"); break;
            case 2 :System.out.printf("  twety"); break;
            case 3 :System.out.printf("  thrity"); break;
            case 4 :System.out.printf("  fourty"); break;
            case 5 :System.out.printf("  fivety"); break;
            case 6 :System.out.printf("  sixty"); break;
            case 7 :System.out.printf("  seventy"); break;
            case 8 :System.out.printf("  eighty"); break;
            case 9 :System.out.printf("  ninety"); break;


        }
        switch (hangdonvi){
            case 1 :System.out.printf("  one "); break;
            case 2 :System.out.printf("  two"); break;
            case 3 :System.out.printf("  three "); break;
            case 4 :System.out.printf("  four "); break;
            case 5 :System.out.printf("  five "); break;
            case 6 :System.out.printf("  six "); break;
            case 7 :System.out.printf("  seven "); break;
            case 8 :System.out.printf("  eight "); break;
            case 9 :System.out.printf("  nine"); break;

        }
    }
}
