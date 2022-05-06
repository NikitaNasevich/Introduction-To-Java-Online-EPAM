package by.javaintroonline.modul02.array;

import java.util.Random;
import java.util.Scanner;

/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {
		int n;
		int k;
		int sum;

		n = scannerInt("Введите величину массива N");

		int[] a = new int[n];

		initArrayInt(a);

		toPrint(a, "Массив A = ");

		k = scannerInt("Введите число K");

		sum = sumElementToK(a, k);

		System.out.println("Сумма элементов кратных числу  " + k + " = " + sum);
	}

	public static int sumElementToK(int[] mas, int k) {
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}

		return sum;
	}

	public static void initArrayInt(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}

	public static void toPrint(int[] mas, String s) {
		System.out.print(s);
		System.out.print(" [");
		for (int i = 0; i < mas.length; i++) {
			if (i == mas.length - 1) {
				System.out.print(mas[i]);
			} else {
				System.out.print(mas[i] + ", ");
			}
		}
		System.out.print("] ");
		System.out.println();

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
