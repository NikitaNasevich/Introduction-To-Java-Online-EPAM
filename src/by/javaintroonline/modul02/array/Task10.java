package by.javaintroonline.modul02.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {

	public static void main(String[] args) {
		int n = scannerInt("Введите количество элементов массива n");

		int[] array = new int[n];

		initArrayInt(array, 100);

		System.out.println("Имеем массив =" + Arrays.toString(array));

		secondElementEqualsZero(array);

		System.out.println("Заполняем нулями каждый второй элемент" + Arrays.toString(array));
		
		toPrint(array, "Вывод полученного масива без нулей");
	}

	public static void secondElementEqualsZero(int[] array) {
		for (int i = 1; i < array.length; i += 2) {
			array[i] = 0;
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

	public static void toPrint(int[] mas, String s) {
		System.out.print(s);
		System.out.print(" [");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {

			} else if (i == mas.length - 1) {
				System.out.print(mas[i]);
			} else {
				System.out.print(mas[i] + ", ");
			}
		}
		System.out.print("] ");
		System.out.println();

	}

}
