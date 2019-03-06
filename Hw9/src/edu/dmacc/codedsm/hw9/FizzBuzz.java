package edu.dmacc.codedsm.hw9;

import java.util.ArrayList;
import java.util.Random;

public class FizzBuzz {

	public static void main(String[] args) {

		ArrayList<Integer> integers = generateIntegers(20);

		for (int i : integers) {

			int RemainderDivideByThree = 0;
			int RemainderDivideByFive = 0;

			System.out.println("  i = " + i);

			if (i > 0 && i != 0) {

				RemainderDivideByThree = i % 3;
				RemainderDivideByFive = i % 5;
				if (RemainderDivideByThree == 0) {
					System.out.println("i =" + i + " Fizz");
				}
				if (RemainderDivideByFive == 0) {
					System.out.println("i =" + i + " Buzz");
				}
				if (RemainderDivideByThree == 0 && RemainderDivideByFive == 0) {
					System.out.println("i =" + i + " Fizzbuzz");
				}
				if (RemainderDivideByThree != 0 && RemainderDivideByFive != 0) {
					System.err.println("i " + i + " Number [n] is not fizzy");
				}

			} else
				System.err
						.println("i =" + i + "is either zero or not positive");

		}

	}

	public static ArrayList<Integer> generateIntegers(int size) {

		ArrayList<Integer> xs = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < size; i++) {

			xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));

		}

		return xs;

	}

}
