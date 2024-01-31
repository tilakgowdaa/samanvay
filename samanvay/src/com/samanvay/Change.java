package com.samanvay;

import java.util.Arrays;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Item Price: ");
		double itemPrice = scanner.nextDouble();

		System.out.print("Amount Paid: ");
		double amountPaid = scanner.nextDouble();

		double itemPriceInPaise = itemPrice * 100;
		double amountPaidInPaise = (amountPaid * 100);

		int remaininfAmountInPaise = (int) (amountPaidInPaise - itemPriceInPaise);
		System.out.println(remaininfAmountInPaise);
		scanner.close();
		Change.getChange(remaininfAmountInPaise);
	}

	private static void getChange(int remaininfAmountInPaise) {

		int[] denominations = { 100, 50, 25, 10, 5, 1 };
		int[] change = new int[denominations.length];

		for (int i = 0; i < denominations.length; i++) {
			while (remaininfAmountInPaise >= denominations[i]) {
				change[i]++;
				remaininfAmountInPaise = remaininfAmountInPaise - denominations[i];
			}
		}

		System.out.println(Arrays.toString(change));
	}

}
