package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {

	public static void main(String[] args) {

		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(matrix);

		sortMatrixMinToMax(matrix);

		System.out.println("Отсортировали строки матрицы по возростанию:");
		printMatrix(matrix);
		
		sortMatrixMaxToMin(matrix);
		
		System.out.println("Отсортировали строки матрицы по убыванию:");
		printMatrix(matrix);

	}

	public static void sortMatrixMinToMax(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			sortMasMinToMax(mas[i]);
		}
	}

	public static void sortMatrixMaxToMin(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			sortMasMaxToMin(mas[i]);
		}
	}

	public static void sortMasMinToMax(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			int min = mas[i];
			for (int j = i; j < mas.length; j++) {

				if (min > mas[j]) {
					min = mas[j];
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
	}

	public static void sortMasMaxToMin(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			int max = mas[i];
			for (int j = i; j < mas.length; j++) {
				if (max < mas[j]) {
					max = mas[j];
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
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
