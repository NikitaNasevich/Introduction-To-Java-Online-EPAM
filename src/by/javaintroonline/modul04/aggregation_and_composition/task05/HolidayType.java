package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public enum HolidayType {
	REST("Rest"), EXCURSION("Excursion"), TREATMENT("Teatment"), SHOPPING("Shopping"), CRUISE("Cruise");

	private String holidayType;

	HolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public String getHolydayType() {
		return holidayType;
	}

	public String toString() {
		return holidayType;
	}

}
