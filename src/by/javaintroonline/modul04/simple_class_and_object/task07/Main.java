package by.javaintroonline.modul04.simple_class_and_object.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle(1, 2.5, 3, -88, 9, 1);

		System.out.println("Площадь треугольника = " + tr.triangleArea());

		System.out.println("Периметр треугольника = " + tr.trianglePerimetr());

		System.out.print("Точка пересечения медиан : ");
		System.out.print("[" + tr.pointMediansX() + ", " + tr.pointMediansY() + "]");
	}

}
