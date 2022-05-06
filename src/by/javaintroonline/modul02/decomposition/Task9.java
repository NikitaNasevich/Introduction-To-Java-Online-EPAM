package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Даны числа X,Y,Z,Т—длины сторон четырехугольника.Написать метод(методы) 
 * вычисления его площади,если угол между сторонами длиной X и Y—прямой.
 */

public class Task9 {

	public static void main(String[] args) {

		double x;
		double y;
		double z;
		double t;

		x = scannerDouble("Введите X");
		y = scannerDouble("Введите Y");
		z = scannerDouble("Введите Z");
		t = scannerDouble("Введите T");

		System.out.println("Площадь четырехугольника = " + areaFourSidesFigure(x, y, z, t));
	}

	private static double areaFourSidesFigure(double a, double b, double c, double d) {
		double area;

		area = areaEquilateralTriangle(a, b) + areaTriangleThreeSides(c, d, gipotenuseEquilateralTriangle(a, b));

		return area;
	}

	private static double areaEquilateralTriangle(double a, double b) {
		double area;

		area = 1 / 2 * (a * b);

		return area;
	}

	private static double gipotenuseEquilateralTriangle(double a, double b) {
		double gip;

		gip = Math.sqrt(a * a + b * b);

		return gip;
	}

	private static double areaTriangleThreeSides(double a, double b, double c) {
		double pp;
		double area;

		pp = (a + b + c) / 2;
		area = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

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
