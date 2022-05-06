package by.javaintroonline.modul01.basic;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class CycleTask08 {

	public static void main(String[] args) {
		int a;
		int b;
		String a1;
		String b1;

		a = 5697413;
		b = 220851;
		a1 = "";
		b1 = "";

		System.out.println("Первое число = " + a);
		System.out.println("Второе число = " + b);

		a1 = Integer.toString(a);
		b1 = Integer.toString(b);

		System.out.print("Числа в ходящие в состав обоих чисел: ");

		for (int i = 0; i < a1.length(); i++) {
			int temp1 = a1.charAt(i) - '0';

			for (int t = 0; t < b1.length(); t++) {
				int temp2 = b1.charAt(t) - '0';

				if (temp1 == temp2) {
					System.out.print(temp2);
				}
			}
		}

	}

}
