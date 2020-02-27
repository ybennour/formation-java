package com.maths.trois;

import java.time.Instant;

import com.exceptions.MyProgramException;
import com.exceptions.MyProgramRuntimeException;

public class Multiples {
	public static void main(String[] args) throws MyProgramException {
		Instant start = Instant.now();
		
		// solution tp4.3
		if (args.length == 0) {
			throw new MyProgramRuntimeException("Veuillez passer un argument au programme!");
		}

		Integer num = 0;
		try {
			num = new Integer(args[0]);
		} catch (NumberFormatException ex) {
			throw new MyProgramException("L'argument entré doit être un nombre", ex);
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
