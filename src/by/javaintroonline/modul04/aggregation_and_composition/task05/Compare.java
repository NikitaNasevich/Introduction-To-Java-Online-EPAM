package by.javaintroonline.modul04.aggregation_and_composition.task05;

import java.util.Comparator;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Compare {
	public static Comparator<Tour> cityComparator = new Comparator<Tour>() {
		public int compare(Tour tour1, Tour tour2) {
			return tour1.getCity().toString().compareTo(tour2.getCity().toString());
		}
	};

	public static Comparator<Tour> foodComparator = new Comparator<Tour>() {
		public int compare(Tour tour1, Tour tour2) {
			return tour1.getFood().toString().compareTo(tour2.getFood().toString());
		}
	};

	public static Comparator<Tour> holidayComparator = new Comparator<Tour>() {
		public int compare(Tour tour1, Tour tour2) {
			return tour1.getHoliday().toString().compareTo(tour2.getHoliday().toString());
		}
	};

	public static Comparator<Tour> periodComparator = new Comparator<Tour>() {
		public int compare(Tour tour1, Tour tour2) {
			return tour1.getPeriod().toString().compareTo(tour2.getPeriod().toString());
		}
	};

	public static Comparator<Tour> transportComparator = new Comparator<Tour>() {
		public int compare(Tour tour1, Tour tour2) {
			return tour1.getTransport().toString().compareTo(tour2.getTransport().toString());
		}
	};
}
