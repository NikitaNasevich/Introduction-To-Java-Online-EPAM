package by.javaintroonline.modul02.sorting;

import java.util.Random;
import java.util.Scanner;

/*
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <= a3 <= ... <= an .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1, то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task04 {

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

		toPrint(a, "Последовательность a = ");

		sortByChange(a);

		toPrint(a, "Отсортировано обменами, a = ");
	}

	public static void sortByChange(int[] mas) {

		int numberOfCheck = 0;

		while (true) {

			int check = 0;

			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					int temp = mas[i + 1];
					mas[i + 1] = mas[i];
					mas[i] = temp;
					check++;
					numberOfCheck++;
				}
			}
			if (check == 0) {
				break;
			}
		}
		System.out.println("Количество перестановок = " + numberOfCheck);
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
