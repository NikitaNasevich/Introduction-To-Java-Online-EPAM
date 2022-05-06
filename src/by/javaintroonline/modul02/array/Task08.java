package by.javaintroonline.modul02.array;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,..., an).
 */

public class Task08 {

	public static void main(String[] args) {

		int n;
		int minNumber;
		int newN;

		n = scannerInt("Введите размер последовательности n");

		int[] a = new int[n];

		initArrayInt(a, 100);

		toPrint(a, "Имеем следующую последовательность");

		minNumber = positionMinElement(a);

		System.out.println("Минимальный элемент в последовательности = " + a[minNumber]);

		newN = chekNumbersOfMin(a, a[minNumber]);

		System.out.println("Количество минимальных элементов в последовательности = " + newN);

		int[] aWithoutMin = new int[n - newN];

		initNewArrayWithoutMin(a, aWithoutMin, a[minNumber]);

		toPrint(aWithoutMin, "Поледовательность без min ");

	}

	public static void initNewArrayWithoutMin(int[] arrayWithMin, int[] arrayWithoutMin, int min) {
		int t = 0;

		for (int i = 0; i < arrayWithoutMin.length; i++) {
			if (arrayWithMin[t] == min) {
				t++;
				i--;
			} else {
				arrayWithoutMin[i] = arrayWithMin[t];
				t++;
			}
		}
	}

	public static int chekNumbersOfMin(int[] array, int min) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				count++;
			}
		}

		return count;
	}

	public static int positionMinElement(int[] array) {
		int min = array[0];
		int number = 0;

		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				number = i;
			}
		}
		return number;
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

	public static void initArrayInt(int[] mas, int k) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(k);
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
