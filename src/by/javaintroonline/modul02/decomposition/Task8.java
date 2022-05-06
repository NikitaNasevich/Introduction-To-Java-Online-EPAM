package by.javaintroonline.modul02.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
* D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
* суммы трех последовательно расположенных элементов массива с номерами от k до
* m.
*/

public class Task8 {

	public static void main(String[] args) {

		int n;
		double sum1;
		double sum3;
		double sum4;

		n = scannerInt("Ввести величину массива");

		double[] d = new double[n];

		for (int i = 0; i < n; i++) {

			d[i] = scannerDouble("Введите " + (i + 1) + " элемент массива");
		}

		System.out.println("Получили массив D = " + Arrays.toString(d));

		sum1 = sumOfThreeElements(d, 1);
		sum3 = sumOfThreeElements(d, 3);
		sum4 = sumOfThreeElements(d, 4);

		System.out.println("Сумма D1-D3 =" + sum1 + "; ");
		System.out.println("Сумма D3-D5 =" + sum3 + "; ");
		System.out.println("Сумма D4-D6 =" + sum4 + "; ");
	}

	private static double sumOfThreeElements(double[] x, int start) {
		double sum;
		int m;

		m = start + 2;
		sum = 0;

		if (start < 0 || start > x.length - 1 || m > x.length - 1) {
			System.out.println("Неправильные параметры!!");
			System.exit(0);
		}

		if (m < x.length) {
			for (int i = start; i <= m; i++) {
				sum += x[i];
			}
		} else {
			for (int i = start; i < x.length; i++)
				sum += x[i];
		}

		return sum;
	}

	@SuppressWarnings({ "resource" })
	private static double scannerDouble(String message) {
		Scanner num = new Scanner(System.in);
		double number;
		System.out.println(message);
		while (!num.hasNextDouble()) {
			num.nextLine();
			System.out.println("Не допустимый формат!");
			System.out.println(message);
		}
		number = num.nextDouble();

		return number;
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
