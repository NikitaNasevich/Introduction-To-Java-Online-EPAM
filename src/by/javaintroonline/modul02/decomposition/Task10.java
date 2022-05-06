package by.javaintroonline.modul02.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class Task10 {

	public static void main(String[] args) {

		int n = scannerInt("Введите число N");

		System.out.println("Получаем массив N =" + Arrays.toString(massiveN(n)));
	}

	private static int[] massiveN(int a) {
		String num;
		int length;
		char ch;
		int element;

		num = String.valueOf(a);
		length = num.length();

		int[] mas = new int[length];

		for (int i = 0; i < length; i++) {
			ch = num.charAt(i);
			element = Character.getNumericValue(ch);
			mas[i] = element;
		}

		return mas;
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
