package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task02 {

	public static void main(String[] args) {
		int size = scannerInt("Введите размерность квадратной матрицы");

		int[][] matrix = new int[size][size];

		initMatrix(matrix);

		printMatrix(matrix);

		printDiagonal(matrix);

	}

	public static void printDiagonal(int[][] mas) {
		System.out.print("Первая диагональ: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][i] + " ");
		}
		System.out.println();

		System.out.print("Вторая диагональ: ");
		int j = mas.length - 1;
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i][j] + " ");
			j--;
		}
		System.out.println();
	}

	public static void printMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}
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
