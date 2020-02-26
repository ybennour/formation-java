package com.maths;

import java.time.Instant;

public class Multiples {
	public static void main(String[] args) {
		Instant start = Instant.now();
		
		if (args.length == 0) {
			System.err.println("Veuillez passer un argument au programme!");
			return;
		}

		Integer num = new Integer(args[0]);
		for (int i = 0; i < 1000; i++) {
			if (i % num == 0) {
				System.out.println(i);
			}
		}
		
		Instant end = Instant.now();
		System.out.println("Program takes : " + (end.toEpochMilli() - start.toEpochMilli()) + " ms");

	}
}
