package by.javaintroonline.modul04.simple_class_and_object.task10;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * 
 * Найти и вывести:
 * 
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

	private String destination = "not set";
	private String flightNumber = "not set";
	private String aircraftType = "not set";
	private String destinationTime = "not set";
	private String dayOfTheWeek = "not set";

	public Airline() {

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		if (destination != null) {
			this.destination = destination;
		}
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		if (flightNumber != null) {
			this.flightNumber = flightNumber;
		}
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		if (aircraftType != null) {
			this.aircraftType = aircraftType;
		}
	}

	public String getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(int hours, int minutes) {

		if (hours >= 0 && hours < 24 && minutes >= 00 && minutes < 60) {
			if (minutes < 10) {
				destinationTime = Integer.toString(hours) + ":" + "0" + Integer.toString(minutes);
			} else {
				destinationTime = Integer.toString(hours) + ":" + Integer.toString(minutes);
			}
		} else {
			System.out.println("Time is incorrect! Please check the correctness of the data!");
		}
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String dayOfTheWeek) {
		if (dayOfTheWeek == "Monday" || dayOfTheWeek == "Tuesday" || dayOfTheWeek == "Wednesday"
				|| dayOfTheWeek == "Thursday" || dayOfTheWeek == "Friday" || dayOfTheWeek == "Saturday"
				|| dayOfTheWeek == "Sunday") {
			this.dayOfTheWeek = dayOfTheWeek;
		} else {
			System.out.println("The day of the week has not been set! Please check the correctness of the data!");
		}

	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", destinationTime=" + destinationTime + ", dayOfTheWeek=" + dayOfTheWeek + "]";
	}

}
