package by.javaintroonline.modul02.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Task09 {

	public static void main(String[] args) {

		int n;

		n = scannerInt("Введите количество элементов в массиве");

		int[] array = new int[n];

		initArrayInt(array, 10);

		System.out.println("Имеем массив = " + Arrays.toString(array));

		int[] meetElements = new int[n];

		initMeetElements(array, meetElements);

		int min = minElementOfMaxMeet(array, meetElements); // Если элемент один он и будет минимальным

		System.out.println(min);

	}

	public static int minElementOfMaxMeet(int[] array, int[] arrayMeets) {
		int n;
		int maxMeet;

		n = chekNumberOfMaxMeet(arrayMeets);
		int[] arrayMaxMeets = new int[n];

		maxMeet = maxElement(arrayMeets);
		int t = 0;
		for (int i = 0; i < array.length; i++) {

			if (arrayMeets[i] == maxMeet) {
				arrayMaxMeets[t] = array[i];
				t++;
			}
		}

		int min = arrayMaxMeets[0];
		for (int i = 0; i < arrayMaxMeets.length; i++) {
			if (min > arrayMaxMeets[i]) {
				min = arrayMaxMeets[i];
			}
		}

		return min;
	}

	public static int maxElement(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		return max;
	}

	public static int chekNumberOfMaxMeet(int[] array) {
		int count;
		int maxMeet;

		count = 0;
		maxMeet = maxElement(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxMeet) {
				count++;
			}
		}

		return count;
	}

	public static void initMeetElements(int[] arrayElements, int[] arrayMeetElements) {

		for (int i = 0; i < arrayElements.length; i++) {

			int count = 0;

			for (int t = 0; t < arrayElements.length; t++) {
				if (arrayElements[i] == arrayElements[t]) {
					count++;
				}
			}

			arrayMeetElements[i] = count;
		}
	}

	public static void initArrayInt(int[] mas, int k) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(k);
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
