package by.javaintroonline.modul02.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание.
 * Координаты точек занести в массив.
 */

public class Task4 {

	public static void main(String[] args) {

		int nPoint;

		nPoint = scannerInt("Введите число точек n");

		double[] x = new double[nPoint];
		double[] y = new double[nPoint];

		for (int i = 0; i < nPoint; i++) {

			x[i] = scannerDouble("Введите координату X точки " + (i + 1));
			y[i] = scannerDouble("Введите координату Y точки " + (i + 1));
		}

		System.out.println("Массив координат X = " + Arrays.toString(x));
		System.out.println("Массив координат Y = " + Arrays.toString(y));

		maxDistanceBetweenPoints(x, y);
	}

	private static void maxDistanceBetweenPoints(double[] x, double[] y) {
		int xy1;
		int xy2;
		double result;
		double distanceX;
		double distanceY;
		double distance;

		xy1 = 0;
		xy2 = 0;
		result = 0;

		for (int i = 0; i < x.length - 1; i++) {
			for (int t = i + 1; t < x.length; t++) {
				distanceX = x[t] - x[i];
				distanceY = y[t] - y[i];
				distance = distanceX * distanceX + distanceY * distanceY;

				if (result == 0) {
					result = distance;
					xy1 = i;
					xy2 = t;
				} else if (distance >= result) {
					result = distance;
					xy1 = i;
					xy2 = t;
				}
			}
		}
		if (xy1 == 0 && xy2 == 0) {
			System.out.println("Что-то пошло не так...(возможно мало точек?)");
		} else {

			System.out.println("Самое большое растояние между точками координаты которых [" + x[xy1] + ", " + y[xy1]
					+ "] и [" + x[xy2] + ", " + y[xy2] + "]");
		}

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
