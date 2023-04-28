package com.greatlearning.currency;
import java.util.*;
public class CurrencyDenominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of currency denominations: ");
        int n = sc.nextInt();
        int[] denominations = new int[n];
        System.out.println("Enter the currency denominations:");
        for (int i = 0; i < n; i++) {
            denominations[i] = sc.nextInt();
        }
        System.out.print("Enter the amount to be paid: ");
        int x = sc.nextInt();
        Arrays.sort(denominations);
        int notes = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (x >= denominations[i]) {
                x -= denominations[i];
                notes++;
            }
        }
        if (x == 0) {
            System.out.println("Minimum number of notes required: " + notes);
        } else {
            System.out.println("Payment cannot be made with the given denominations.");
        }
    }
}
