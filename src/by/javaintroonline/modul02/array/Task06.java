package by.javaintroonline.modul02.array;

import java.util.Scanner;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task06 {

	public static void main(String[] args) {
		int n;
		double sum;

		n = scannerInt("Введите количество элементов в последовательности N");

		double[] mas = new double[n];

		initArray(mas, -1000, 2001);

		toPrint(mas, "Имеем следующую последовательность ");

		sum = sumSimpleNumber(mas);

		System.out.println("Сумма элементов порядкое номера которых простые числа = " + sum);

	}

	public static void initArray(double[] a, int start, int finish) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * (finish - start) - finish);
		}
	}

	public static double sumSimpleNumber(double[] array) {
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (chekSimple(i)) {
				sum += array[i];
			}
		}

		return sum;
	}

	public static boolean chekSimple(int num) {
		boolean result = false;

		if (num > 1) {

			result = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					result = false;
					break;
				}
			}
		}

		return result;
	}

	public static void toPrint(double[] mas, String message) {
		System.out.print(message);
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
			System.out.println("Ð�ÐµÐ´Ð¾Ð¿ÑƒÑ�Ñ‚Ð¸Ð¼Ñ‹Ð¹ Ñ„Ð¾Ñ€Ð¼Ð°Ñ‚!!!");
			System.out.println(message);
		}
		number = num.nextInt();

		return number;
	}

}
