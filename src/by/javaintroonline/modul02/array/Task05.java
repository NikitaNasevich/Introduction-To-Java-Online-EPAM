package by.javaintroonline.modul02.array;

import java.util.Random;
import java.util.Scanner;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task05 {

	public static void main(String[] args) {
		int n;

		n = scannerInt("Введите количество элементов n");

		int[] a = new int[n];

		initArrayInt(a);

		toPrint(a, "Имеем следующие целые числа");

		printAbiggerThanI(a);
	}

	public static void printAbiggerThanI(int[] a) {

		System.out.print("Элементы у которых a(i) > i : ");

		boolean chek = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > i) {
				if (chek) {
					System.out.print(", " + a[i]);
				} else {
					System.out.print(a[i]);
					chek = true;
				}

			} else if (a[i] > i) {
				System.out.print(a[i]);
			}
		}
		System.out.print(".");
		System.out.println();
	}

	public static void initArrayInt(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(mas.length);
		}
	}

	public static void toPrint(int[] mas, String message) {
		System.out.print(message);
		System.out.print(" ");
		for (int i = 0; i < mas.length; i++) {
			if (i == mas.length - 1) {
				System.out.print(mas[i]);
			} else {
				System.out.print(mas[i] + ", ");
			}
		}
		System.out.print(".");
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
