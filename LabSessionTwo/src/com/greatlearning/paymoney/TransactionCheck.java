package com.greatlearning.paymoney;
import java.util.*;
public class TransactionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the daily target: ");
        int target = sc.nextInt();
        System.out.print("Enter the number of transactions: ");
        int n = sc.nextInt();
        int[] transactions = new int[n];
        System.out.println("Enter the transaction amounts:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        int sum = 0;
        int transactionNumber = -1;
        for (int i = 0; i < n; i++) {
            sum += transactions[i];
            if (sum >= target) {
                transactionNumber = i + 1;
                break;
            }
        }
        if (transactionNumber != -1) {
            System.out.println("PayMoney achieved the daily target at transaction " + transactionNumber);
        } else {
            System.out.println("PayMoney could not achieve the daily target.");
        }
    }
}
