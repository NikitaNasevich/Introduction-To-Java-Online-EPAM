package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class Task09 {

	public static void main(String[] args) {

		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(matrix);

		int[] mas = sumElements(matrix);
		toPrint(mas, "Суммы столбцов =");

		int max = numberColumnWithMaxElement(mas);
		System.out.println("Номер столбца (если начало отсчета 0) с максимальной суммой = " + max);

	}

	public static int numberColumnWithMaxElement(int[] mas) {
		int max = mas[0];
		int number = 0;
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				number = i;
			}
		}

		return number;
	}

	public static int[] sumElements(int[][] mas) {

		// Узнаем максимальное количество столбцов на случай если матрица не
		// равномерная.
		int max = mas[0].length;
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i].length) {
				max = mas[i].length;
			}
		}

		int[] massivOfSum = new int[max];

		for (int i = 0; i < max; i++) {
			int sum = 0;
			for (int j = 0; j < mas.length; j++) {
				if (mas[j].length >= i) {
					sum += mas[j][i];

				}
			}
			massivOfSum[i] = sum;

		}
		return massivOfSum;
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

	public static void toPrint(int[] mas, String s) {
		System.out.print(s);
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
