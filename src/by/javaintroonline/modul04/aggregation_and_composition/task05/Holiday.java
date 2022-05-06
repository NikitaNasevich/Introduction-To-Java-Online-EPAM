package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Holiday {
	private HolidayType holiday;

	public Holiday(HolidayType holiday) {
		this.holiday = holiday;
	}

	public void setHoliday(HolidayType holiday) {
		this.holiday = holiday;
	}

	public HolidayType getHoliday() {
		return holiday;
	}

	public String toString() {
		return holiday.toString();
	}
}
