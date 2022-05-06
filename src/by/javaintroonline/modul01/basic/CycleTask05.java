package by.javaintroonline.modul01.basic;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 *	заданному е. Общий член ряда имеет вид: а(n) = 1 / 2^n + 1 / 3^n");
 */

public class CycleTask05 {

	public static void main(String[] args) {
		double e;
		int n;
		double sum;
		double a;

		e = -6.7;
		n = 40;
		sum = 0;

		for (int i = 1; i <= n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма равна " + sum);

	}

}
