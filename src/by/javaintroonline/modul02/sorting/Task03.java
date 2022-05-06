package by.javaintroonline.modul02.sorting;

import java.util.Random;
import java.util.Scanner;

/*
 * Сортировка выбором. Дана последовательность чисел  a1 <= a2 <= a3 <= ... <= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task03 {

	public static void main(String[] args) {
		int n;

		while (true) {
			n = scannerInt("Введите число n");
			if (n > 1) {
				break;
			} else {
				System.out.println("Число n должно быть больше 1!");
			}
		}

		int[] a = new int[n];

		initArrayInt(a);

		sortUp(a);

		toPrint(a, "Последовательность a = ");

		sortDown(a);

		toPrint(a, "Отсортированно методом сортировки выбора от макс до мин, a = ");

	}

	public static void sortDown(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			int max = mas[i];
			int number = i;
			int temp = 0;
			for (int j = i + 1; j < mas.length; j++) {
				if (max < mas[j]) {
					max = mas[j];
					number = j;
				}
			}
			temp = mas[i];
			mas[i] = mas[number];
			mas[number] = temp;
		}
	}

	public static void sortUp(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			int min = mas[i];
			int number = i;
			int temp = 0;
			for (int j = i + 1; j < mas.length; j++) {
				if (min > mas[j]) {
					min = mas[j];
					number = j;
				}
			}
			temp = mas[i];
			mas[i] = mas[number];
			mas[number] = temp;
		}
	}

	public static void toPrint(int[] mas, String s) {
		System.out.print(s);
		System.out.print(" [");
		for (int i = 0; i < mas.length; i++) {
			if (i == mas.length - 1) {
				System.out.print(mas[i]);
			} else {
				System.out.print(mas[i] + ", ");
			}
		}
		System.out.print("] ");
		System.out.println();

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
