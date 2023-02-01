package com.bridgelabz;

import java.util.Scanner;

public class Account {

    int accountBalance = 100000;

    void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount you want to debit: ");
        int debitAmount = sc.nextInt();
        if (debitAmount<accountBalance) {
            System.out.println("Amount Rs" + debitAmount + " is withdraw from your account and remaining account balance is " + (accountBalance - debitAmount));
        }else{
            System.out.println("Debit amount exceeded account balance.");
        }
    }
    public static void main(String[] args) {
        Account withdraw1 = new Account();
        withdraw1.debit();
    }
}
