package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task03 {

	public static void main(String[] args) {
		int n;
		int m;

		Random rand = new Random();

		n = rand.nextInt(15);
		m = rand.nextInt(15);

		int[][] matrix = new int[n][m];

		initMatrix(matrix);

		System.out.println("Имеем матрицу");
		printMatrix(matrix);

		int k = scannerInt("Введите номер строки k"); 
		int p = scannerInt("Введите номер столбца p");
		
		System.out.println("Выводим строку:");
		printLine(matrix, k);
		System.out.println("Выводим столбец:");
		printColumn(matrix, p);

	}

	public static void printColumn(int[][] mas, int p) {
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].length >= p) {
				System.out.println(mas[i][p - 1]);
				j++;
			}
		}
		if (j == 0) {
			System.out.println("Некорректный номер столбца!");
		}

	}

	public static void printLine(int[][] mas, int k) {
		if (k >= mas.length || k <= 0) {
			System.out.println("Строки с таким номером не существует!");
		} else {
			for (int i = 0; i < mas[k].length; i++) {
				System.out.print(mas[k - 1][i] + " ");
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

	public static void initMatrix(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(mas[i].length);
			}
		}
	}

	public static void printMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}
	}

}
