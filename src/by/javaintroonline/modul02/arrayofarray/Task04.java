package by.javaintroonline.modul02.arrayofarray;

import java.util.Scanner;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 * 
 * 					1   2   3   ...  n  
 * 					n  n-1 n-2  ...  1 
 * 					1   2   3   ...  n  
 * 					n  n-1 n-2  ...  1 
 * 				   ... ... ...  ... ... 
 * 				    n  n-1 n-2  ...  1 
 * 				     
 * 
 */
public class Task04 {

	public static void main(String[] args) {
		int n = scannerInt("Введите порядок матрицы n");

		int[][] matrix = new int[n][n];

		initMatrixSquare(matrix);

		printMatrix(matrix);
	}

	public static void initMatrixSquare(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			if (i == 0 || i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
				}
			} else if (i % 2 != 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = mas[i].length - j;
				}
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
