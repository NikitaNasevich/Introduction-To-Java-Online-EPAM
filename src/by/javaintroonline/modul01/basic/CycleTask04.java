package by.javaintroonline.modul01.basic;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class CycleTask04 {

	public static void main(String[] args) {
		long mult;
		long chek;

		mult = 1;
		chek = 1;

		for (int i = 1; i <= 200; i++) {
			chek *= (long) i * i;

			if (chek < mult) {
				System.out.println("Переполнение!! достигнуто на числе " + i + " ...конец программы.");
				System.out.println("Произведение квадратов первых " + (i - 1) + " чисел равно " + mult);
				System.exit(0);
			}

			mult = chek;
		}
		System.out.println("Произведение квадратов первых двухсот чисел = " + mult);

	}

}
