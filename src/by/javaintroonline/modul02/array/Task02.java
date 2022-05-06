package by.javaintroonline.modul02.array;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task02 {

	public static void main(String[] args) {
		int n;
		int z;
		int count;

		n = scannerInt("Введите размер последовательности n");
		int[] a = new int[n];

		z = scannerInt("Введите число Z");

		initArrayInt(a, z * 10);
		toPrint(a, "Массив а =");

		count = equalsZ(a, z);
		toPrint(a, "Массив a с учетом Z =");
		System.out.println("Количество замен =" + count);
	}

	public static int equalsZ(int[] a, int z) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < z) {
				a[i] = z;
				count++;
			}
		}
		return count;
	}

	public static void initArrayInt(int[] mas, int k) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(k);
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
