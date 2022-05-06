package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public enum CityType {
	MINSK("Minsk"), LVIV("Lviv"), SHARM_EI_SHEIKH("Sharm EI-Sheikh"), ANKARA("Ankara"), LOGOISK("Logoisk"),
	MEDITERRANEAN_SEA("Mediterranean Sea");

	private String cityType;

	CityType(String cityType) {
		this.cityType = cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public String getCityType() {
		return cityType;
	}

	public String toString() {
		return cityType;
	}
}
