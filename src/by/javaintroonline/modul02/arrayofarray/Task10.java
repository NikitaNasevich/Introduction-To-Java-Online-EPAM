package by.javaintroonline.modul02.arrayofarray;

import java.util.Scanner;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

	public static void main(String[] args) {

		int n = scannerInt("Введите размерность квадратной матрицы");

		int[][] matrix = new int[n][n];

		initMatrix(matrix);

		System.out.println("Матрица имеет вид:");
		printMatrix(matrix);

		System.out.print("В данной матрице на главной диагонали имеются следующие положителььные элементы:");
		chekAndPrintPossitiveDiag(matrix);

	}

	public static void chekAndPrintPossitiveDiag(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] >= 0) {
				System.out.print(" " + mas[i][i]);
			}
		}
		System.out.print(";");
		System.out.println();
	}

	public static void initMatrix(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				double nn = Math.random() * 21 - 10;
				int n = (int) nn;
				mas[i][j] = n;
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
