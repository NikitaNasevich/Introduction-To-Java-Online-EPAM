package by.javaintroonline.modul02.decomposition;

import java.util.Arrays;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не
 * большее N.
 */

public class Task12 {

	public static void main(String[] args) {
		int[] a;
		int k;
		int n;

		k = 20;
		n = 1000;
		a = elementGenerator(k, n);

		System.out.println(Arrays.toString(a));

	}

	private static int sumDigits(int number) {
		int sum;
		String num;
		int length;
		char ch;

		sum = 0;
		num = String.valueOf(number);
		length = num.length();

		for (int i = 0; i < length; i++) {
			ch = num.charAt(i);
			sum += Character.getNumericValue(ch);
		}
		return sum;
	}

	private static int[] elementGenerator(int k, int n) {
		int[] a = new int[10];
		int h;
		boolean bool;

		h = 0;

		for (int i = 0; i < 10; i++) {
			bool = true;
			for (int t = h; bool; t++) {
				if (sumDigits(t) == k && t < n) {
					a[i] = t;
					t++;
					h = t;
					bool = false;
				}
			}
		}
		return a;
	}
}
