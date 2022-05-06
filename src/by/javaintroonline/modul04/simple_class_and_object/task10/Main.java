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

public class Main {

	public static void main(String[] args) {
		Airline ar1 = new Airline();
		Airline ar2 = new Airline();
		Airline ar3 = new Airline();
		Airline ar4 = new Airline();
		Airline ar5 = new Airline();

		ar1.setDestination("Minsk");
		ar1.setFlightNumber("BRU8196");
		ar1.setAircraftType("Airbus A330");
		ar1.setDestinationTime(13, 0);
		ar1.setDayOfTheWeek("Saturday");

		ar2.setDestination("Istanbul");
		ar2.setFlightNumber("TK284");
		ar2.setAircraftType("SuperJet-100");
		ar2.setDestinationTime(13, 03);
		ar2.setDayOfTheWeek("Monday");

		ar3.setDestination("Moscow");
		ar3.setFlightNumber("B2951");
		ar3.setAircraftType("SuperJet-100");
		ar3.setDestinationTime(19, 40);
		ar3.setDayOfTheWeek("Wednesday");

		ar4.setDestination("Dubai");
		ar4.setFlightNumber("FZ1716");
		ar4.setAircraftType("Boeing-747");
		ar4.setDestinationTime(01, 10);
		ar4.setDayOfTheWeek("Friday");

		ar5.setDestination("Nur-Sultan");
		ar5.setFlightNumber("B2775");
		ar5.setAircraftType("SuperJet-100");
		ar5.setDestinationTime(20, 15);
		ar5.setDayOfTheWeek("Monday");
		
		MassAir air = new MassAir();
		
		air.add(ar1);
		air.add(ar2);
		air.add(ar3);
		air.add(ar4);
		air.add(ar5);
		
		air.listOfFlightsToDestination("Dubai");
		air.listOfFlightsOnDayOfTheWeek("Monday");
		air.listOfFlightsOnDayOfTheWeekAfterTime("Monday", "14:00");
	}

}
