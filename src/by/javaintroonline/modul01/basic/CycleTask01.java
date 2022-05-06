package by.javaintroonline.modul01.basic;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class CycleTask01 {

	public static void main(String[] args) {

		int number;
		int sum;

		number = scannerInt("Введите целое положительное число");
		sum = 0;

		while (number <= 0) {
			System.out.println("Недопустимый формат!!!");
			number = scannerInt("Введите целое положительное число");
		}

		for (int i = 1; i <= number; i++) {
			sum = sum + i + number;
		}
		System.out.println(sum);

	}

	@SuppressWarnings("resource")
	private static int scannerInt(String s) {
		Scanner num = new Scanner(System.in);
		int number;
		System.out.println(s);
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Недопустимый формат!");
			System.out.println(">>");
		}
		number = num.nextInt();

		return number;
	}

}
