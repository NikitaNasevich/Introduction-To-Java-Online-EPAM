package by.javaintroonline.modul01.basic;

/*Для заданной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
принадлежит закрашенной области, и false — в противном случае
*/

public class LinearTask06 {
	public static void main(String[] args) {

		double x;
		double y;

		x = 2.7;
		y = -0.4;

		// уравнения прямых из заданной области x=-2, x=2, x=-4, x=4, y=4, y=0, y=-3.

		if ((x >= -2 && x <= 2 && y <= 4 && y >= 0) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
