package by.javaintroonline.modul02.arrayofarray;

import java.util.Scanner;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * 
 * 				A[I, J] = sin (( I^2 - J^2 ) / N)
 * 	
 * и подсчитать количество положительных элементов в ней.
 */
public class Task07 {

	public static void main(String[] args) {

		int n = scannerInt("Введите порядок матрицы N");

		double[][] matrix = new double[n][n];

		initMatrix(matrix);

		System.out.println("Сформировали следующую матрицу:");
		printMatrix(matrix);

		System.out.println();

		int number = numbersOfPositive(matrix);
		System.out.println("Число положительных элементов в матрице = " + number);

	}

	public static void initMatrix(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {

				double a = ((i * i - j * j) / mas.length * 1.0);

				mas[i][j] = Math.sin(a);
			}
		}
	}

	public static int numbersOfPositive(double[][] mas) {
		int number = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] >= 0) {
					number++;
				}
			}
		}

		return number;
	}

	public static void printMatrix(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

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
