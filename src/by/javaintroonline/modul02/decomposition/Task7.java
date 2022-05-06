package by.javaintroonline.modul02.decomposition;

/*
* Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
* от 1 до 9.
*/

public class Task7 {

	public static void main(String[] args) {

		System.out.println("Факториал всех нечетных чисел от 1 до 9" + getSumFactorialFromOneToNine());

	}

	private static long getSumFactorialFromOneToNine() {
		int factorial;
		int sum;
		int temp;

		factorial = 0;
		sum = 0;
		temp = 1;

		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				for (int t = 1; t <= i; t++) {
					temp *= t;
					factorial = temp;
				}
			}
			sum += factorial;
			temp = 1;
			factorial = 0;
		}
		return sum;
	}
}
