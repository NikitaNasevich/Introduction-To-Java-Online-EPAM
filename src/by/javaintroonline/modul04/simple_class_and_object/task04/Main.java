package by.javaintroonline.modul04.simple_class_and_object.task04;

import java.util.Scanner;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов 
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
 * должны быть упорядочены по времени отправления.
 */
public class Main {

	public static void main(String[] args) {

		Train[] tr = new Train[5];

		tr[0] = new Train("Minsk", 5569, "12.40");
		tr[1] = new Train("Logoisk", 1001, "13.00");
		tr[2] = new Train("Minsk", 6489, "10.59");
		tr[3] = new Train("Grodno", 7842, "7.00");
		tr[4] = new Train("Kiev", 698742, "01.47");

		trainSchedule(tr);

		trainNumberSort(tr);
		System.out.println("Отсортированное расписание поездов по номеру поезда");

		trainSchedule(tr);

		int trainNumber = scannerInt("Введите номер интересующщего вас поезда: ");
		infoTrainNumber(trainNumber, tr);

		trainDestinationSort(tr);
		System.out.println("Отсортированное расписание поездов по пункту назначения:");

		trainSchedule(tr);

	}

	public static void infoTrainNumber(int number, Train[] tr) {
		boolean notFound = true;
		for (int i = 0; i < tr.length; i++) {
			if (number == tr[i].getTrainNumber()) {
				System.out.print("Пункт назначения: " + tr[i].getDestination() + " | ");
				System.out.print("Время отправления: " + tr[i].getDepartureTime() + " | ");
				System.out.println();
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("Поезда с номером " + number + " не найдено!");
		}
		System.out.println();
	}

	public static void trainSchedule(Train[] tr) {
		for (int i = 0; i < tr.length; i++) {
			System.out.print(i + 1 + ". Пункт назначения " + tr[i].getDestination() + " ");
			System.out.print("| Номер поезда " + tr[i].getTrainNumber() + " ");
			System.out.print("| Время отправления " + tr[i].getDepartureTime() + " |");
			System.out.println();
		}
		System.out.println();
	}

	public static void trainNumberSort(Train[] tr) {
		for (int i = 0; i < tr.length - 1; i++) {
			if (tr[i].getTrainNumber() > tr[i + 1].getTrainNumber()) {
				Train temp = tr[i];
				tr[i] = tr[i + 1];
				tr[i + 1] = temp;

				if (i == 0) {
					i--;
				} else {
					i -= 2;
				}
			}
		}
	}

	public static void trainDestinationSort(Train[] tr) {
		for (int i = 0; i < tr.length - 1; i++) {
			int check = tr[i].getDestination().compareTo(tr[i + 1].getDestination());
			if (check > 0) {
				Train temp = tr[i];
				tr[i] = tr[i + 1];
				tr[i + 1] = temp;

				if (i == 0) {
					i--;
				} else {
					i -= 2;
				}
			} else if (check == 0) {
				check = tr[i].getDepartureTime().compareTo(tr[i + 1].getDepartureTime());
				if (check > 0) {
					Train temp = tr[i];
					tr[i] = tr[i + 1];
					tr[i + 1] = temp;

					if (i == 0) {
						i--;
					} else {
						i -= 2;
					}
				}
			}
		}
	}

	@SuppressWarnings("resource")
	public static int scannerInt(String message) {
		Scanner num = new Scanner(System.in);
		System.out.println(message);
		int number;
		while (!num.hasNextInt()) {
			num.next();
			System.out.println("Недопустимый формат!!!");
			System.out.println(message);
		}
		number = num.nextInt();

		return number;
	}

}
