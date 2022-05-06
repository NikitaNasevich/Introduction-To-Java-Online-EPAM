package by.javaintroonline.modul01.basic;

/*
 * Даны три точки A(x1, y1), B(x2, y2), C(x3, y3). Определить будут ли они расположены на одной прямой.
 */
public class BranchingTask03 {

	public static void main(String[] args) {

		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 7;
		y1 = 8;
		x2 = -1;
		y2 = 6;
		x3 = 5;
		y3 = -5;

		System.out.println("A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ");");

		// уравнение прямой через 2 точки (x - x1)/(x2 - x1) = (y - y1)/(y2 - y1).

		if (((x3 - x1) / (x2 - x1) == ((y3 - y1) / (y2 - y1)))) {
			System.out.println("Точки лежат на одной прямой;");
		} else {
			System.out.println("Точки не лежат на одной прямой;");
		}

	}

}
