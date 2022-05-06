package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {

	public static void main(String[] args) {

		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(matrix);

		int[][] matrixT = transposeMatrix(matrix);

		sortMatrixMinToMax(matrixT);

		matrix = returnTransposeMatrix(matrixT);

		System.out.println("Отсортировали столбцы матрицы по возростанию:");
		printMatrix(matrix);

		sortMatrixMaxToMin(matrixT);

		matrix = returnTransposeMatrix(matrixT);

		System.out.println("Отсортировали столбцы матрицы по убыванию:");
		printMatrix(matrix);
	}

	public static int[][] transposeMatrix(int[][] mas) {
		// Проверяем максимальную длинну строк в матрице на случай если матрица не
		// равномерная.
		int max = mas[0].length;
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i].length) {
				max = mas[i].length;
			}
		}

		int[][] masT = new int[max][mas.length];

		for (int i = 0; i < masT.length; i++) {
			for (int j = 0; j < masT[i].length; j++) {
				masT[i][j] = mas[j][i];
			}
		}

		return masT;
	}

	public static int[][] returnTransposeMatrix(int[][] masT) {

		int[][] mas = new int[masT[0].length][masT.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = masT[j][i];
			}
		}

		return mas;
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
