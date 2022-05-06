package by.javaintroonline.modul01.basic;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x если x > 2;
 * y = -x если x <= 2;
 */

public class CycleTask02 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;
		int y;

		a = -9;
		b = 7;
		h = 3;

		for (int i = a; i <= b; i += h) {
			if (i > 2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("Значение функии на отрезке [" + a + ", " + b + "] с шагом " + h + ", у =" + y);
		}

	}

}
