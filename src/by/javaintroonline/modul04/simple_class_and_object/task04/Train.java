package by.javaintroonline.modul04.simple_class_and_object.task04;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов 
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
 * должны быть упорядочены по времени отправления.
 */

public class Train {
	private String destination;
	private int trainNumber;
	private String departureTime;

	public Train(String destination, int trainNumber, String departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public String getDestination() {
		return this.destination;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

}
