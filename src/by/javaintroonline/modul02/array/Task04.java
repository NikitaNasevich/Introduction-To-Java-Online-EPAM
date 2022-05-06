package by.javaintroonline.modul02.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {

	public static void main(String[] args) {
		int n;

		n = scannerInt("Введите количество элементов n");

		double[] a = new double[n];
		initArray(a);

		System.out.println("Получаем следующие числа " + Arrays.toString(a));
		sortMinMax(a);

		System.out.println("Меняем максимальное и минимально местами " + Arrays.toString(a));

	}

	public static void sortMinMax(double[] a) {
		int maxNum = 0;
		int minNum = 0;
		double temp;
		double max = a[0];
		double min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				maxNum = i;
			}
		}

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				minNum = i;
			}
		}
		temp = a[maxNum];
		a[maxNum] = a[minNum];
		a[minNum] = temp;

	}

	public static void initArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * 201) - 100; // генерация случайных числе в диапазоне [-100; 101);
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
