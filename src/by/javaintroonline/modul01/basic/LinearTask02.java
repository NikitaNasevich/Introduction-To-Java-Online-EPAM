package by.javaintroonline.modul01.basic;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (b + sqrt(b*b + 4*a*c)) / (2*a) - (a^3) * c + b^-2
 */

public class LinearTask02 {
	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		a = 2;
		b = 77;
		c = 4;

		// Упростим выражение до вида: a1 / a2 - a3 + b^-2

		double a1;
		double a2;
		double a3;
		double sq;
		double sq1;

		sq = b * b + 4 * a * c;
		sq1 = Math.sqrt(sq);

		a1 = b + sq1;
		a2 = 2 * a;
		a3 = Math.pow(a, 3) * c;
		z = a1 / a2 - a3 + Math.pow(b, -2);

		System.out.println("z =" + z);

	}

}
