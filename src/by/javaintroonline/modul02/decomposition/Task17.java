package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
 * решения задачи использовать декомпозицию.
 */

public class Task17 {

	public static void main(String[] args) {
		int n;
		int count;

		n = scannerInt("Введите число");
		count = countMinus(n);

		System.out.println("Количество вычитаний из числа = " + count);
	}

	private static int countMinus(int n) {
		int count;

		count = 0;

		while (n != 0) {
			n -= sumDigits(n);
			count++;
		}

		return count;
	}

	private static int sumDigits(int number) {
		int sum;
		String num;
		int length;
		char ch;

		sum = 0;
		num = String.valueOf(number);
		length = num.length();

		for (int i = 0; i < length; i++) {
			ch = num.charAt(i);
			sum += Character.getNumericValue(ch);
		}
		return sum;
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
