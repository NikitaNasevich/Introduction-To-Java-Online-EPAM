package by.javaintroonline.modul01.basic;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
* Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
*	ННч ММмин SSc.
*/

public class LinearTask05 {
	public static void main(String[] args) {

		int t;
		int hh;
		int mm;
		int ss;

		t = 36954;

		hh = t / 3600;

		mm = (t - 3600 * hh) / 60;

		ss = (t - 3600 * hh - 60 * mm);

		System.out.println("Число T =" + t);
		System.out.println(hh + "ч " + mm + "мин " + ss + "с");

	}

}
