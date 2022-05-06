package by.javaintroonline.modul01.basic;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(sinx + cosy)/(cosx - siny) * tgxy 
*/

public class LinearTask03 {
	public static void main(String[] args) {

		double x;
		double y;
		double tg;
		double z;

		x = 14.5;
		y = 82.1;
		tg = x * y;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(tg);

		System.out.println("z = " + z);

	}

}
