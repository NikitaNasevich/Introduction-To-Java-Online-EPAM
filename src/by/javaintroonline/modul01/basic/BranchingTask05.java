package by.javaintroonline.modul01.basic;

/*
 * Вычислить значение функции F(x) = x ^ 2 -3 * x + 9 если x <= 3 и F(x) = 1 / (x ^ 3 + 6) если x > 3.
 */

public class BranchingTask05 {

	public static void main(String[] args) {
		double x;
		double f;

		x = 4.1;

		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else {
			f = 1 / (x * x * x + 6);
		}
		System.out.println("Значение функции при x =" + x + " равно =" + f + ";");

	}

}
