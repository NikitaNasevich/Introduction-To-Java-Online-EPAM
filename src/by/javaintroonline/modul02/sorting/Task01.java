package by.javaintroonline.modul02.sorting;

import java.util.Random;
import java.util.Scanner;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Task01 {

	public static void main(String[] args) {

		Random rd = new Random();

		int n1;
		int n2;
		int k;

		n1 = rd.nextInt(10);
		n2 = rd.nextInt(10);

		int[] mas1 = new int[n1];
		int[] mas2 = new int[n2];
		int[] masFinal = new int[n1 + n2];

		initArrayInt(mas1, 20);
		initArrayInt(mas2, 10);

		toPrint(mas1, "Первый массив = ");
		toPrint(mas2, "Второй массив = ");

		while (true) {
			k = scannerInt("Введите число k");
			if (k < mas1.length && k > 0) {
				break;
			}
			System.out.println("Чиcло должно быть больше 0 и меньше " + mas1.length);
		}

		pasteMasInOtherMas(mas1, mas2, masFinal, k);

		toPrint(masFinal, "Общий массив = ");
	}

	public static void pasteMasInOtherMas(int[] mas1, int[] mas2, int[] mas3, int k) {
		for (int i = 0; i < k; i++) {
			mas3[i] = mas1[i];
		}

		for (int i = 0; i < mas2.length; i++) {
			mas3[i + k] = mas2[i];
		}
	
		for (int i = k; i < mas1.length; i++) {
			
			mas3[i + mas2.length] = mas1[i];
		}
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
