package com.dsa.lab1;

import java.util.*;

public class TransactionTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Welcome to PayMoney Transactions*****\n");
		System.out.print("Enter number of transactions:");
		int noOfTransactions = sc.nextInt();

		int transactions[] = new int[noOfTransactions];
		System.out.println("\nEnter list of transactions:");

		for (int i = 1; i <= noOfTransactions; i++) {
			System.out.print("Transaction #" + i + ":");
			transactions[i - 1] = sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter the total number of targets to be achieved:");
		int targetNo = sc.nextInt();

		int sum = 0;
		int count = 0;
		int i = 0;

		while (targetNo > 0) {

			int flag = 0;
			count++;

			System.out.print("\nEnter target #" + count + ":");
			int target = sc.nextInt();

			while (i < noOfTransactions) {

				sum += transactions[i];

				if (sum >= target) {

					flag = 1;
					System.out.println("Target achieved at " + (i + 1) + " transaction ");

					sum = sum - target;
					System.out.println("After target achievement, remaining balance is:" + sum);
					i++;
					break;
				}
				i++;
			}
			if (flag == 0)
				System.out.println("Target cannot not achieved ");

			targetNo--;
		}
		sc.close();

	}

}
