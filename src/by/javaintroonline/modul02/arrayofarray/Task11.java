package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */
public class Task11 {

	public static void main(String[] args) {

		int[][] matrix = new int[10][20];

		initMatrix(matrix);
		
		System.out.println("Имеем матрицу следующего вида: ");
		printMatrix(matrix);
		
		System.out.println();
		chekStringsWithFives(matrix);
	}

	public static void chekStringsWithFives(int[][] mas) {

		int[] n = new int[mas.length];
		int chek = 0;

		for (int i = 0; i < mas.length; i++) {
			int number = 0;

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					number++;
				}
			}

			if (number >= 3) {
				n[i] = i;
				chek++;
			}
		}
		if (chek > 0) {
			System.out.print("Строки(а) в которых(ой) число 5 встречается 3 и более раз имеют следующие номера:");

			for (int i = 0; i < n.length; i++) {
				if (n[i] > 0) {
					System.out.print(" " + n[i]);
				}
			}
		} else {
			System.out.print("Данная матрица не имеет строк в которых(ой) число 5 встречается 3 и более раз.");
		}
		System.out.println();
	}

	public static void initMatrix(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
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
