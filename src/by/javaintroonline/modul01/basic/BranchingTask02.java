package by.javaintroonline.modul01.basic;

/*
 * Найти max{min(a,b), min(c,d)}.
 */

public class BranchingTask02 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		a = 6;
		b = 4;
		c = 9;
		d = 7;
		System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")};");

		int minAB;
		int minCD;

		if (a > b) {
			minAB = b;
		} else {
			minAB = a;
		}

		if (c > d) {
			minCD = d;
		} else {
			minCD = c;
		}

		if (minAB > minCD) {
			System.out.println("МAX = " + minAB + ";");
		} else {
			System.out.println("MAX = " + minCD + ";");
		}

	}

}
