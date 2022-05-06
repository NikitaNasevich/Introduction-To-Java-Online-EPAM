package by.javaintroonline.modul01.basic;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class CycleTask03 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Сумма квадратов равна " + sum);

	}

}
