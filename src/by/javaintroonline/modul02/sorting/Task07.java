package by.javaintroonline.modul02.sorting;

import java.util.Arrays;

/*
 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности  b1 <= b2 <= ... <= bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task07 {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 8, 9, 11, 12, 16 };
		int[] b = { 2, 3, 4, 5, 6, 7, 9, 10, 11, 17 };

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));

		sort(a, b);
	}

	public static void sort(int[] a, int[] b) {

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[j] > b[i]) {

					if (j == 0) {
						System.out.println(
								"Элемент " + b[i] + ", последовательности b, необходимо вставить перед элементом "
										+ a[j] + " последовательности а");
						break;

					} else if (j == a.length - 1) {
						System.out.println(
								"Элемент " + b[i] + ", последовательности b, необходимо вставить после элемента " + a[j]
										+ " последовательности а");
						break;

					} else {
						System.out.println(
								"Элемент " + b[i] + ", последовательности b, необходимо вставить между элементами "
										+ a[j - 1] + " и " + a[j] + " последовательности а");
						break;

					}

				} else if (a[j] <= b[i] && j == a.length - 1) {
					System.out.println("Элемент " + b[i] + ", последовательности b, необходимо вставить после элемента "
							+ a[j] + " последовательности а");
					break;
				}
			}
		}

	}

}
