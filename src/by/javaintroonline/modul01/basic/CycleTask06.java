package by.javaintroonline.modul01.basic;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class CycleTask06 {

	public static void main(String[] args) {

		for (int i = 32; i < 128; i++) {
			System.out.println(i + "  " + (char) i);
		}

	}

}
