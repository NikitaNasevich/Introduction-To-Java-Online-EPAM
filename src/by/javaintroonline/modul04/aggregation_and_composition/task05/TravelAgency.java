package by.javaintroonline.modul04.aggregation_and_composition.task05;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelAgency {
	private ArrayList<Tour> tours;
	private String name;

	public TravelAgency(String name, ArrayList<Tour> tours) {
		this.name = name;
		this.tours = tours;
	}

	public ArrayList<Tour> getTours() {
		return tours;
	}

	public void setTours(ArrayList<Tour> tours) {
		this.tours = tours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Travel agency " + name + ".";
	}

	public void search(Enum e) {
		ArrayList<Tour> foundTours = Seeker.search(tours, e);
		for (Tour tour : foundTours) {
			System.out.println(tour.toString());
		}
	}

	public void addTour(Tour tour) {
		tours.add(tour);
	}

	public void printAlltours() {
		for (Tour tour : tours) {
			System.out.println(tour.toString());
		}
	}

	public void sortByCity() {
		Collections.sort(tours, Compare.cityComparator);
	}

	public void sortByFood() {
		Collections.sort(tours, Compare.foodComparator);
	}

	public void sortByHoliday() {
		Collections.sort(tours, Compare.holidayComparator);
	}

	public void sortByPeriod() {
		Collections.sort(tours, Compare.periodComparator);
	}

	public void sortBytransport() {
		Collections.sort(tours, Compare.transportComparator);
	}

}
