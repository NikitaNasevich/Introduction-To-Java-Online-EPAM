package by.javaintroonline.modul02.sorting;

import java.util.Random;
import java.util.Scanner;

/*
 * Даны две последовательности: a1 <= a2 <= a3 <= ... <= an и b1 <= b2 <= b3 <= ... <= bm 
 * Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task02 {

	public static void main(String[] args) {
		int n;
		int m;

		while (true) {
			n = scannerInt("Введите число n");
			if (n > 0) {
				break;
			} else {
				System.out.println("Число n должно быть больше 0!");
			}
		}

		while (true) {
			m = scannerInt("Введите число m");
			if (m > 0) {
				break;
			} else {
				System.out.println("Число m должно быть больше 0!");
			}
		}

		int[] a = new int[n];
		int[] b = new int[m];

		initArrayInt(a);
		initArrayInt(b);

		sortUp(a);
		sortUp(b);
		toPrint(a, "Последовательность a = ");
		toPrint(b, "Последовательность b = ");

		a = unitTwoMas(a, b);
		sortUp(a);
		toPrint(a, "Образовали = ");

	}

	public static int[] unitTwoMas(int[] mas1, int[] mas2) {
		int[] unit = new int[mas1.length + mas2.length];

		for (int i = 0; i < mas1.length; i++) {
			unit[i] = mas1[i];
		}

		for (int i = 0; i < mas2.length; i++) {
			unit[mas1.length + i] = mas2[i];
		}

		return unit;
	}

	public static void sortUp(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			int min = mas[i];
			int number = i;
			int temp = 0;
			for (int j = i + 1; j < mas.length; j++) {
				if (min > mas[j]) {
					min = mas[j];
					number = j;
				}
			}
			temp = mas[i];
			mas[i] = mas[number];
			mas[number] = temp;
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

	public static void initArrayInt(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
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
