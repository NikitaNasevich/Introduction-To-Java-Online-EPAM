package by.javaintroonline.modul02.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {

	public static void main(String[] args) {
		int horizontal = scannerInt("Введите размер матрицы по горизонтали");
		int vertical = scannerInt("Введите размер матрицы по вертикали");

		int[][] matrix = new int[vertical][horizontal];

		initMatrix(matrix);

		System.out.println("Получили следующую матрицу:");
		printMatrix(matrix);
		
		int max = maxElementOfMatrix(matrix);
		System.out.println("Максимальный элемент в матрице = " + max);
		
		replacementElementsOnMax(matrix, max);
		
		System.out.println("После замены нечетных элементов матрицы на максимальный получаем следующую матрицу:");
		printMatrix(matrix);
	}
	
	public static void initMatrix(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(mas[i].length * 10);
			}

		}
	}
	
	public static void replacementElementsOnMax(int[][] mas, int max) {
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(count > 0) {
					if (count % 2 != 0) {
						mas[i][j] = max;
					}
				}
				count++;
			}

		}
	}
	
	public static int maxElementOfMatrix(int[][] mas) {
		int max = 0;
		for(int i = 0; i < mas.length; i++) {
			for( int j = 0; j < mas[i].length; j++) {
				if(max < mas[i][j]) {
					max = mas[i][j];
				}
			}
		}
		return max;
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
