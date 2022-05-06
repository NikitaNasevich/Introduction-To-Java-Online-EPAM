package by.javaintroonline.modul02.sorting;

import java.util.Random;

/*
 * Даны дроби p1/q1, p2/q2, ... , pn/qn (p , q - натуральные). Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task08 {

	public static void main(String[] args) {
		int[] p = new int[10];
		int[] q = new int[10];

		initArrayInt(p);
		initArrayInt(q);

		toPrint(p, q, "Даны дроби");

		commonDenominator(p, q);

		toPrint(p, q, "Привели к общему знаменателю");

		shellsSort(p);

		toPrint(p, q, "Упорядочили");
	}

	public static void commonDenominator(int[] num, int[] den) {
		if (num.length <= 1 || den.length <= 1) {
			System.out.println("НУЖНО БОЛЬШЕ ДРОБЕЙ!!!");
			System.exit(0);
		}

		int lcm = getLCM(den[0], den[1]);

		for (int i = 2; i < den.length; i++) {
			lcm = getLCM(lcm, den[i]);
		}

		for (int i = 0; i < num.length; i++) {
			num[i] *= lcm / den[i];
		}

		for (int i = 0; i < den.length; i++) {
			den[i] = lcm;
		}
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
			mas[i] = rand.nextInt(9) + 1;
		}
	}

	public static void toPrint(int[] mas, int[] mas2, String s) {
		System.out.print(s);
		System.out.print(": ");
		for (int i = 0; i < mas.length; i++) {
			if (i == mas.length - 1) {
				System.out.print(mas[i] + "/" + mas2[i]);
			} else {
				System.out.print(mas[i] + "/" + mas2[i] + ", ");
			}
		}
		System.out.print("; ");
		System.out.println();

	}

	public static int getGCD(int a, int b) {
		if (a == 0) {
			return b;
		}
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static int getLCM(int a, int b) {

		int lcm = a * b / getGCD(a, b);

		return lcm;
	}

}
