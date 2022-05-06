package by.javaintroonline.modul01.basic;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа. 
*/

public class LinearTask04 {
	public static void main(String[] args) {

		double r = 654.987;
		int c;
		double c1;
		double b;
		double b1;
		double d;

		System.out.println("Число R =" + r);

		c = (int) r;

		c1 = (double) c / 1000;

		b = r - (double) c;

		b1 = b * 1000;

		d = Math.ceil(b1) + c1;

		System.out.println("Результат =" + d);
	}
}