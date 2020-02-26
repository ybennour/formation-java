package com.arrays;

public class Program {
	public static void main(String[] args) {
		int[] ints = { 17, 4, 8, 11, 54, 91, 66, 90, 53, 0 };

		// 1
		printInts(ints);

		// 2
		int sum = sumInts(ints);
		System.out.println("sum : " + sum);

		// 3
		int greater = greaterInt(ints);
		System.out.println("greater : " + greater);

		// 4
		int[] reversed = reverseArray(ints);
		printInts(reversed);
	}

	public static void printInts(int[] ints) {
		for (int num : ints) {
			System.out.print(num + " ");
		}
		System.out.println(); // retour à la ligne
	}

	public static int sumInts(int[] ints) {
		int sum = 0;
		for (int num : ints) {
			sum += num;
		}
		return sum;
	}

	public static int greaterInt(int[] ints) {
		int greater = Integer.MIN_VALUE;
		for (int num : ints) {
			if (num > greater) {
				greater = num;
			}
		}
		return greater;
	}

	public static int[] reverseArray(int[] ints) {
		int[] reversed = new int[ints.length];

		int index = ints.length - 1;
		for (int num : ints) {
			reversed[index] = num;
			index--;
		}

		return reversed;
	}
}
