package by.javaintroonline.modul04.aggregation_and_composition.task05;

import java.util.ArrayList;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Seeker {

	public static ArrayList<Tour> search(ArrayList<Tour> tours, Enum num) {
		System.out.println("Looking for: " + num.toString());
		ArrayList<Tour> result = new ArrayList<Tour>();
		for (Tour tour : tours) {

			switch (num.getClass().getSimpleName()) {
			case "CityType":
				if (tour.getCity().toString().equals(num.toString())) {
					result.add(tour);
				}
				break;
			case "FoodType":
				if (tour.getFood().toString().equals(num.toString())) {
					result.add(tour);
				}
				break;
			case "HolidayType":
				if (tour.getHoliday().toString().equals(num.toString())) {
					result.add(tour);
				}
				break;
			case "PeriodType":
				if (tour.getPeriod().toString().equals(num.toString())) {
					result.add(tour);
				}
				break;
			case "TransportType":
				if (tour.getTransport().toString().equals(num.toString())) {
					result.add(tour);
				}
				break;
			}

		}
		return result;
	}
}
