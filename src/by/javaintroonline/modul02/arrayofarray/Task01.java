package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task01 {

	public static void main(String[] args) {
		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(matrix);

		System.out.println("Печатаем только нечетные столбцы у которых первый элемент больше последнего");
		printOddColumn(matrix);
	}

	public static void printOddColumn(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j += 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.print(mas[i][j] + "   ");
				} else {
					System.out.print("    ");
				}
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
