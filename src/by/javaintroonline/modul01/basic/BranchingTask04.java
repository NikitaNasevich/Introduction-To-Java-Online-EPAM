package by.javaintroonline.modul01.basic;

/*
 * Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class BranchingTask04 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 15;
		b = 7;
		x = 24;
		y = 6;
		z = 14;

		System.out.println("A =" + a + " B =" + b + ";");
		System.out.println("x =" + x + ", y =" + y + ", z =" + z + ";");

		if (a > x && b > y || b > x && a > y || a > y && b > z || a > z && b > y || a > x && b > z || a > z && b > y) {
			System.out.println("Кирпич пройдет!");
		} else {
			System.out.println("Кирпич не пройдет!");
		}

	}

}
