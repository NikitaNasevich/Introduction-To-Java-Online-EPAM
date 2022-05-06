package by.javaintroonline.modul01.basic;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 * и если да то будет ли он прямоугольным.
 */

public class BranchingTask01 {
	public static void main(String[] args) {

		int degree1;
		int degree2;
		int degree3;

		degree1 = 48;
		degree2 = 30;
		degree3 = 180 - degree1 - degree2;

		if (degree3 <= 0) {
			System.out.println("Треугольника с углами " + degree1 + " и " + degree2 + " - не существует!");
		}
		if (degree3 == 90) {
			System.out.println("Треугольник с углами " + degree1 + " и " + degree2 + " - прямоугольный!");
		} else {
			System.out.println("Треугольник с углами " + degree1 + " и " + degree2 + " - существует, непрямоугольный!");
		}

	}

}
