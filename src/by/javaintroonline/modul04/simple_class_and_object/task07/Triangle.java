package by.javaintroonline.modul04.simple_class_and_object.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {

	private double apexAX, apexAY, apexBX, apexBY, apexCX, apexCY;
	private double sideA, sideB, sideC;

	public Triangle(double apexAX, double apexAY, double apexBX, double apexBY, double apexCX, double apexCY) {

		if (isItTriangleOrLine(apexAX, apexAY, apexBX, apexBY, apexCX, apexCY)) {

			this.apexAX = apexAX;
			this.apexAY = apexAY;
			this.apexBX = apexBX;
			this.apexBY = apexBY;
			this.apexCX = apexCX;
			this.apexCY = apexCY;

			sideA = calcSide(apexAX, apexAY, apexBX, apexBY);
			sideB = calcSide(apexBX, apexBY, apexCX, apexCY);
			sideC = calcSide(apexCX, apexCY, apexAX, apexAY);

		} else {
			System.out.println("Данный треугольник не существует в данной плоскости!!!");
			System.exit(-1);
		}

	}

	private double calcSide(double x1, double y1, double x2, double y2) {
		double side;

		side = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		return side;
	}

	private boolean isItTriangleOrLine(double x1, double y1, double x2, double y2, double x3, double y3) {
		boolean result = false;

		if ((x3 - x1) / (x2 - x1) != (y3 - y2) / (y2 - y1)) {
			result = true;
		}

		return result;
	}

	public double triangleArea() {
		double area = 0;
		double pper;

		pper = trianglePerimetr() / 2;

		area = Math.sqrt(pper * (pper - sideA) * (pper - sideB) * (pper - sideC));

		return area;
	}

	public double trianglePerimetr() {
		double perimetr;

		perimetr = sideA + sideB + sideC;

		return perimetr;
	}

	public double pointMediansX() {
		double pointX;

		pointX = (apexAX + apexBX + apexCX) / 3;

		return pointX;
	}

	public double pointMediansY() {
		double pointY;

		pointY = (apexAY + apexBY + apexCY) / 3;

		return pointY;
	}

}
