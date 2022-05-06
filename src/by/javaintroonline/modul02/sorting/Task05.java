package by.javaintroonline.modul02.sorting;

import java.util.Arrays;

/*
 * Сортировка вставками. Дана последовательность чисел а1, а2, ... , аn . Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2, ... , ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <= ... <= ai . Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task05 {

	public static void main(String[] args) {
		int[] a = { 1, 17, 3, 4, 5, 19, 6, 12, 15, 11, 7, 16, 9, 8, 13, 10, 20, 14, 18, 2 };

		System.out.println("Последовательность а = " + Arrays.toString(a));

		sortByPaste(a);

		System.out.println("После сортировки вставками а = " + Arrays.toString(a));

	}

	public static void sortByPaste(int[] mas) {

		int endOfSequence = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				endOfSequence = i;
				break;
			}
		}

		for (int i = endOfSequence + 1; i < mas.length; i++) {
			int place = binarySearch(mas, i);

			int temp = mas[i];

			for (int j = i; j >= place; j--) {
				mas[j] = mas[j - 1];

			}
			mas[place] = temp;

		}
	}

	public static int binarySearch(int[] mas, int indexElement) {
		if (indexElement == 0 || indexElement >= mas.length) {
			System.out.println("Неверные параметры для двоичного поиска!!");
			System.exit(0);
		}

		int first = 0;
		int last = indexElement - 1;
		int indexToPaste = 0;

		while (true) {

			if (last < first) {
				return -1;
			}
			if (last - first == 0) {
				if (mas[first] <= mas[indexElement]) {
					indexToPaste = first + 1;

					break;
				} else {
					indexToPaste = first;
					break;
				}
			}

			if (last - first == 1) {
				if (mas[first] > mas[indexElement] && mas[last] >= mas[indexElement]) {
					indexToPaste = first;
					break;
				} else if (mas[last] < mas[indexElement]) {
					indexToPaste = last + 1;
					break;
				}

			}

			int middle = (first + last) / 2;

			if (mas[middle] < mas[indexElement]) {
				first = middle + 1;

			} else if (mas[middle] > mas[indexElement]) {
				last = middle - 1;

			} else if (mas[middle] == mas[indexElement]) {
				indexToPaste = middle;
				break;
			}
		}

		return indexToPaste;

	}

}
