package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class City {
	private CityType city;

	public City(CityType city) {
		this.city = city;
	}

	public void setCity(CityType city) {
		this.city = city;
	}

	public CityType getCity() {
		return city;
	}

	public String toString() {
		return city.toString();
	}
}
