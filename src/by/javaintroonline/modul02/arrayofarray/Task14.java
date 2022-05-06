package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */
public class Task14 {

	public static void main(String[] args) {
		int m = scannerInt("Введите размер матрицы по горизонтали");
		int n = scannerInt("Введите размер матрицы по вертикали");

		if (m == 0 || n == 0) {
			System.out.println("Размеры матрицы должны быть больше 0!");
			System.exit(0);
		}

		int[][] matrix = new int[m][n];// m и n стоят наоборот т.к. в дальнейшем матрица будет транспонирована

		initMatrix(matrix);

		int[][] finishMatrix = transposeMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(finishMatrix);

	}

	public static void initMatrix(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < i; j++) {
				int jj = rand.nextInt(mas[i].length);
				while (mas[i][jj] != 0) {
					jj = rand.nextInt(mas[i].length);
				}
				mas[i][jj] = 1;
			}

		}
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
