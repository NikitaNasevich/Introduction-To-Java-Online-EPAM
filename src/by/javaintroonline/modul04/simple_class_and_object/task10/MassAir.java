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

public class MassAir {
	private Airline[] airline;

	public MassAir() {
		airline = new Airline[10];
	}

	public void listOfFlightsToDestination(String destination) {

		System.out.println("List of flights to " + destination + ":");

		int check = 0;

		for (int i = 0; i < getNumberOfLastElement(airline); i++) {

			if (airline[i].getDestination().equalsIgnoreCase(destination)) {
				System.out.println("Flight number: " + airline[i].getFlightNumber() + "; Destination: "
						+ airline[i].getDestination() + "; Aircraft type: " + airline[i].getAircraftType()
						+ "; Destination time: " + airline[i].getDestinationTime() + "; Day of the week: "
						+ airline[i].getDayOfTheWeek() + ";");
				check = 1;
			}
		}

		if (check == 0) {
			System.out.println("No flights found to " + destination);
		}
		System.out.println();
	}

	public void listOfFlightsOnDayOfTheWeek(String dayOfTheWeek) {

		System.out.println("List of flights on " + dayOfTheWeek + ":");

		int check = 0;

		for (int i = 0; i < getNumberOfLastElement(airline); i++) {

			if (airline[i].getDayOfTheWeek().equalsIgnoreCase(dayOfTheWeek)) {
				System.out.println("Flight number: " + airline[i].getFlightNumber() + "; Destination: "
						+ airline[i].getDestination() + "; Aircraft type: " + airline[i].getAircraftType()
						+ "; Destination time: " + airline[i].getDestinationTime() + "; Day of the week: "
						+ airline[i].getDayOfTheWeek() + ";");
				check = 1;
			}
		}

		if (check == 0) {
			System.out.println("No flights found on " + dayOfTheWeek);
		}
		System.out.println();
	}

	public void listOfFlightsOnDayOfTheWeekAfterTime(String dayOfTheWeek, String time) {

		System.out.println("List of flights on " + dayOfTheWeek + " after " + time + ":");

		int check = 0;

		for (int i = 0; i < getNumberOfLastElement(airline); i++) {

			if (airline[i].getDayOfTheWeek().equalsIgnoreCase(dayOfTheWeek)
					&& airline[i].getDestinationTime().compareTo(time) >= 0) {
				System.out.println("Flight number: " + airline[i].getFlightNumber() + "; Destination: "
						+ airline[i].getDestination() + "; Aircraft type: " + airline[i].getAircraftType()
						+ "; Destination time: " + airline[i].getDestinationTime() + "; Day of the week: "
						+ airline[i].getDayOfTheWeek() + ";");
				check = 1;
			}
		}

		if (check == 0) {
			System.out.println("No flights found on " + dayOfTheWeek);
		}
		System.out.println();
	}

	public void add(Airline airline) {

		if (checkLength(this.airline)) {
			this.airline = increaseMass(this.airline);
		}

		this.airline[getNumberOfLastElement(this.airline)] = airline;
	}

	private boolean checkLength(Airline[] airline) {
		boolean check = false;

		if (airline[airline.length - 1] != null) {
			check = true;
		}
		return check;
	}

	private int getNumberOfLastElement(Airline[] airline) {
		int number = airline.length - 1;

		for (int i = 0; i < airline.length; i++) {
			if (airline[i] == null) {
				number = i;
				break;
			}
		}
		return number;
	}

	private Airline[] increaseMass(Airline[] airline) {
		Airline[] newCust = new Airline[airline.length * 2];

		for (int i = 0; i < airline.length; i++) {
			newCust[i] = airline[i];
		}

		return newCust;
	}

	public void remove(Airline airline) {
		for (int i = 0; i < this.airline.length; i++) {
			if (this.airline[i] == airline) {
				this.airline[i] = null;
				break;
			} else {
				System.out.println("Данный объект в массиве не найден!");
			}
		}
	}
}
