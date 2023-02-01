package com.bridgelabz.stockaccountmanegment;

import java.util.Scanner;

public class StockPortfolio {

    public static final int tcsShareValue = 1020;
    public static final int relienceShareValue = 90;
    public static final int mahindraShareValue = 83;
    public static final int heroShareValue = 71;
    public static final int yamahaShareValue = 56;

    static int totalStocksValue;
    static int stockValueCalculation(int shareValue){
        Scanner sc = new Scanner(System.in);
        int shares = sc.nextInt();
        int stockValue = shares * shareValue;
        totalStocksValue += stockValue;
        return stockValue;
    }
    static void choose(){
        Scanner sc = new Scanner(System.in);
        int chooseCompany;
        int shareValue;
        do {
            System.out.println("Choose Company \n1.TCS \n2.Relience \n3.Mahindra \n4.HERO \n5.YAMAHA \n6.Display Total Stock Value Exit");
            chooseCompany = sc.nextInt();
            switch (chooseCompany){
                case 1:
                    System.out.println("enter TCS share: ");
                    shareValue = tcsShareValue;
                    stockValueCalculation(shareValue);
                    break;
                case 2:
                    System.out.println("enter Relience share: ");
                    shareValue = relienceShareValue;
                    stockValueCalculation(shareValue);
                    break;
                case 3:
                    System.out.println("enter Mahindra share: ");
                    shareValue = mahindraShareValue;
                    stockValueCalculation(shareValue);
                    break;
                case 4:
                    System.out.println("enter Hero share: ");
                    shareValue = heroShareValue;
                    stockValueCalculation(shareValue);
                    break;
                case 5:
                    System.out.println("enter Yamaha share: ");
                    shareValue = yamahaShareValue;
                    stockValueCalculation(shareValue);
                    break;
                case 6:
                    System.out.println("Display Total Stock Value and Exit");
                    break;
            }
        }while(chooseCompany != 6);
    }
}
