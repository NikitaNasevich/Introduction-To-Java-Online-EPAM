package by.javaintroonline.modul02.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Task03 {

	public static void main(String[] args) {
		int n;
		int[] result;

		n = scannerInt("Введите размерность массива N");

		double[] numbers = new double[n];
		initArray(numbers);

		System.out.println("Массив = " + Arrays.toString(numbers));

		result = counter(numbers);

		System.out.println("Количество отрицательных элементов в массиве " + result[0]);
		System.out.println("Количество положительных элементов в массиве " + result[2]);
		System.out.println("Количество элементов 0 в массиве " + result[1]);

	}

	public static void initArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * 201) - 100; // генерация случайных числе в диапазоне [-100; 101);
		}
	}

	public static int[] counter(double[] a) {
		int[] count = new int[3]; // count[0] - negative elements; count[1] - zero elements; count[2] - positive
									// elements;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count[2]++;
			} else if (a[i] < 0) {
				count[0]++;
			} else {
				count[1]++;
			}
		}
		return count;
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
