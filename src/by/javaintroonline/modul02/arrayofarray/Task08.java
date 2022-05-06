package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class Task08 {

	public static void main(String[] args) {

		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу");
		printMatrix(matrix);

		int firstColumn = scannerInt("Какой столбец необходимо заменить? Введите номер!");
		int secondColumn = scannerInt(" На какой столбец необходимо заменить? Введите номер!");

		changeColumns(matrix, firstColumn, secondColumn);

		printMatrix(matrix);

	}

	public static void changeColumns(int[][] mas, int first, int second) {
		if (first >= 1 && second >= 1 && first != second) {

			int[] tempMas = new int[mas.length];

			// делаем копию первого столбца
			for (int i = 0; i < tempMas.length; i++) {
				if (mas[i].length >= first) {
				}
				tempMas[i] = mas[i][first - 1];
			}

			// записываем в первый столбец второй
			for (int i = 0; i < mas.length; i++) {
				if (mas[i].length >= second) {
					mas[i][first - 1] = mas[i][second - 1];
					mas[i][second - 1] = tempMas[i];
				}
			}
		} else {
			System.out.println("Замена столбцов не выполнена, некорректный ввод номеров столбцов!!");
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
