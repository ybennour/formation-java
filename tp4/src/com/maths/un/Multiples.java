package com.maths.un;

import java.time.Instant;

public class Multiples {
	public static void main(String[] args) {
		Instant start = Instant.now();
		
		if (args.length == 0) {
			System.err.println("Veuillez passer un argument au programme!");
			return;
		}

		// solution tp4.1
		Integer num = 0;
		try {
			num = new Integer(args[0]);
		} catch (NumberFormatException ex) {
			System.err.println("L'argument entré doit être un nombre");
			return;
		}
		
		for (int i = 0; i < 1000; i++) {
			if (i % num == 0) {
				System.out.println(i);
			}
		}
		
		Instant end = Instant.now();
		System.out.println("Program takes : " + (end.toEpochMilli() - start.toEpochMilli()) + " ms");

	}
}
