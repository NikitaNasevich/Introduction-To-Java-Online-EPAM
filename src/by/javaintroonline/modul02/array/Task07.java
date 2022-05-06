package by.javaintroonline.modul02.array;

import java.util.Scanner;

/*
 * Даны действительные числа n a1, a2, ... ,a2n. Найти max(a1 + a2n, a2 + a2n-1,..., an + an+1).
 */

public class Task07 {

	public static void main(String[] args) {
		int n;
		double max;

		n = scannerInt("Введите n");

		double[] array = new double[2 * n];

		double[] sum = new double[n];

		initArray(array, -1000, 1001);

		toPrint(array, "Имеем следющие действительные числа");

		sum = sumCouple(array);

		toPrint(sum, "Суммы пар элементов = ");

		max = maxElementFromArray(sum);

		System.out.println("Максимальное из суммы пар элементов = " + max);

	}

	public static double maxElementFromArray(double[] array) {
		double max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static double[] sumCouple(double[] array) {
		double[] sum = new double[array.length / 2];

		for (int i = 0; i < array.length / 2; i++) {
			sum[i] = array[i] + array[array.length - 1 - i];
		}
		return sum;
	}

	public static void initArray(double[] a, int start, int finish) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * (finish - start) - finish);
		}
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
			System.out.println("Недопустимый формат!!!");
			System.out.println(message);
		}
		number = num.nextInt();

		return number;
	}

}
