package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
* Вычислить площадь правильного шестиугольника со стороной а, используя метод
* вычисления площади треугольника.
*/

public class Task3 {

	public static void main(String[] args) {

		double a;
		double areaHexagon;

		a = scannerDouble("Ввелите сторону шестиугольника а");
		areaHexagon = 6 * areaTriangleEqual(a);

		System.out.println(areaHexagon);

	}

	private static double areaTriangleEqual(double a) {

		double area;

		area = a * a * Math.sqrt(3) / 4;

		return area;
	}

	@SuppressWarnings({ "resource" })
	private static double scannerDouble(String message) {
		Scanner num = new Scanner(System.in);
		double number;
		System.out.println(message);
		while (!num.hasNextDouble()) {
			num.nextLine();
			System.out.println("Не допустимый формат!");
			System.out.println(message);
		}
		number = num.nextDouble();

		return number;
	}
}
