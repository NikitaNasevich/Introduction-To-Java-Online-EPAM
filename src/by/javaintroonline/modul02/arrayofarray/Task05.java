package by.javaintroonline.modul02.arrayofarray;

import java.util.Scanner;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 * 					1  1  1 ... 1  1  1
 * 					2  2  2 ... 2  2  0
 * 					3  3  3 ... 3  0  0
 * 					... ... ... ... ...
 * 				  n-1 n-1 0 ... 0  0  0
 * 				    n  0  0 ... 0  0  0
 *   
 */
public class Task05 {

	public static void main(String[] args) {
		int n = scannerInt("Введите порядок матрицы n");

		int[][] matrix = new int[n][n];

		initMatrix(matrix);

		System.out.println("Получаем матрицу следующего вида");
		printMatrix(matrix);

	}

	public static void initMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length - i; j++) {
				mas[i][j] = i + 1;
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
		int number = 0;
		boolean check = true;
		while (check) {
			while (!num.hasNextInt()) {
				num.next();
				System.out.println("Недопустимый формат!!!");
				System.out.println(message);
			}

			number = num.nextInt();
			if (number % 2 == 0) {
				check = false;
			} else {
				System.out.println("Необходимо ввести четное число!");
				System.out.println(message);
			}
		}

		return number;
	}

}
