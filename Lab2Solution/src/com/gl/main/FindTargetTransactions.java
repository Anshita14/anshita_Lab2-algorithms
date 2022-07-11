package com.gl.main;

import java.util.Scanner;

public class FindTargetTransactions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of transactions per day=");
		int size = sc.nextInt();

		int[] transactionArray = new int[size];

		System.out.println("Enter the transactions now");

		for (int index = 0; index < size;) {
			int transaction = sc.nextInt();
			if (transaction > 0) {
				transactionArray[index] = transaction;
				index++;
			}
		}

		System.out.println("Enter the no.of Targets = ");
		int noOfTarget = sc.nextInt();
		printNoOfTransactions(transactionArray, noOfTarget);
	}

	private static void printNoOfTransactions(int[] transactionArray, int noOfTarget) {
		while (noOfTarget > 0) {
			System.out.println("Enter the daily Target =");
			int target = sc.nextInt();
			int transactionCount = getNumberOfTransactions(transactionArray, target);
            if (transactionCount > 0) {
				System.out.println("The number of Transactions to achieve the target =" + (transactionCount));	
			}
            else {
				System.out.println("No. of targets insufficient to achieve target");
			}
            noOfTarget--;
		}
	}

	private static int getNumberOfTransactions(int[] transactionArray, int target) {
		int transactionCount = 0;
		int sum = 0;
		int size = transactionArray.length;
		while (sum <= target && transactionCount < size) {
				sum = sum + transactionArray[transactionCount];
			transactionCount++;
		}
	    if (transactionCount >= size) { 
		    return -1;
	    } else {
		    return transactionCount;
	    }
}
}
