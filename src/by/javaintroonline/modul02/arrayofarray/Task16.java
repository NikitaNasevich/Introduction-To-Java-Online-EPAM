package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 * ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 *
 *												6 1 8
 *												7 5 3
 *												2 9 4
 */
public class Task16 {

	public static void main(String[] args) {
		boolean check;
		int n = scannerInt("Введите порядок n");

		int[][] magic = new int[n][n];

		initMagMas(magic);

		while (true) {

			check = checkOfMagic(magic);
			if (check == true) {
				break;
			}

			changeElement(magic);

		}
		System.out.println("Магический квадрат " + n + "-го порядка");
		printMatrix(magic);

	}

	public static boolean checkOfMagic(int[][] mas) {

		int sumOfElements = 0; // сумма всех элементов магического квадрата

		int numberToCheck; // число которому должны быть равны суммы столбцов строк и диагоналей

		for (int i = 1; i <= mas.length * mas.length; i++) {
			sumOfElements += i;
		}

		numberToCheck = sumOfElements / mas.length;

		for (int i = 0; i < mas.length; i++) {

			int sum = 0;

			for (int j = 0; j < mas.length; j++) {
				sum += mas[i][j];
			}
			if (sum != numberToCheck) {
				return false;
			}
		}

		// проверяем суммы столбцов

		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas.length; j++) {
				sum += mas[j][i];
			}

			if (sum != numberToCheck) {
				return false;
			}
		}

		// проверяем главную диагональ int sum = 0;
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {

			sum += mas[i][i];

		}
		if (sum != numberToCheck) {
			return false;
		}

		// проверяем вторую диагональ
		sum = 0;
		int j = mas.length - 1;
		for (int i = 0; i < mas.length; i++) {

			sum += mas[i][j];
			j--;

		}
		if (sum != numberToCheck) {
			return false;
		}

		return true;
	}

	public static void changeElement(int[][] mas) {
		Random rand = new Random();

		int i;
		int j;
		int ii;
		int jj;

		while (true) {
			i = rand.nextInt(mas.length);
			j = rand.nextInt(mas.length);

			ii = rand.nextInt(mas.length);
			jj = rand.nextInt(mas.length);

			if (i != ii && j != jj) {
				break;
			}
		}

		int temp = mas[i][j];
		mas[i][j] = mas[ii][jj];
		mas[ii][jj] = temp;

	}

	public static void initMagMas(int[][] mas) {
		int count = 1;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = count;
				count++;
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
