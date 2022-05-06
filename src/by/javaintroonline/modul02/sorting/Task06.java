package by.javaintroonline.modul02.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
 * на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */
public class Task06 {

	public static void main(String[] args) {
		int n;

		while (true) {
			n = scannerInt("Введите число n");
			if (n > 0) {
				break;
			} else {
				System.out.println("Число n должно быть больше 0!");
			}
		}

		int[] a = new int[n];

		initArrayInt(a);

		System.out.println(Arrays.toString(a));

		shellsSort(a);

		System.out.println(Arrays.toString(a));

	}

	public static void shellsSort(int[] mas) {
		
		for (int i = 0; i < mas.length - 1; i++) {

			if (mas[i] > mas[i + 1]) {
				int temp = mas[i];
				mas[i] = mas[i + 1];
				mas[i + 1] = temp;
			
				if (i == 0) {
					i--;
				} else {
					i -= 2;
				}

			}
		}
	}

	public static void initArrayInt(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
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
