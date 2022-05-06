package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только
 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
 * решения задачи использовать декомпозицию.
 */

public class Task16 {

	public static void main(String[] args) {
		int n;
		int sumOdd;

		n = scannerInt("Введите количество знаков");
		sumOdd = sumAllOdd(n);

		System.out.println("Сумма всех чисел с нечетными цифрами = " + sumOdd);
		System.out.println("Количество четных цифр в сумме = " + numberOfEvenNumbers(sumOdd));
	}

	private static int numberOfEvenNumbers(int n) {
		String nn;
		int count;
		char ch;
		int element;

		nn = String.valueOf(n);
		count = 0;

		for (int i = 0; i < nn.length(); i++) {
			ch = nn.charAt(i);
			element = Character.getNumericValue(ch);
			if (element == 0) {

			} else if (element % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	private static int sumAllOdd(int n) {
		int sum;

		sum = 0;

		for (int i = numberOfDigitsStart(n); i <= numberOfDigitsFinish(n); i++) {
			if (checkOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private static boolean checkOdd(int n) {
		String nn;
		int countTrue;
		boolean result;
		char ch;
		int element;

		nn = String.valueOf(n);
		countTrue = 0;
		result = false;

		for (int i = 0; i < nn.length(); i++) {
			ch = nn.charAt(i);
			element = Character.getNumericValue(ch);
			if (element == 0) {

			} else if (element % 2 != 0) {
				countTrue++;
			}
		}

		if (countTrue == nn.length()) {
			result = true;
		}

		return result;
	}

	private static int numberOfDigitsStart(int n) {
		int result;
		String one;
		String zero;

		result = 0;
		one = "1";
		zero = "0";

		for (int i = 1; i < n; i++) {
			one += zero;
		}
		result = Integer.parseInt(one);

		return result;

	}

	private static int numberOfDigitsFinish(int n) {
		int result;
		String nine;
		String plusNine;

		result = 0;
		nine = "9";
		plusNine = "9";

		for (int i = 1; i < n; i++) {
			nine += plusNine;
		}
		result = Integer.parseInt(nine);

		return result;
	}

	@SuppressWarnings("resource")
	public static int scannerInt(String message) {
		Scanner num = new Scanner(System.in);
		System.out.println(message);
		int number;
		while (!num.hasNextInt()) {
			num.next();
			System.out.println("Недопустимый формат!!!");
			System.out.println(message);
		}
		number = num.nextInt();

		return number;
	}

}
