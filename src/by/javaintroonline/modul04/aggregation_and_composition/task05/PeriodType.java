package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public enum PeriodType {
	SEVEN(7), FOURTEEN(14), TWENTYONE(21);

	private int periodType;

	PeriodType(int periodType) {
		this.periodType = periodType;
	}

	public int getPeriod() {
		return periodType;
	}

	public String toString() {
		return Integer.toString(periodType);
	}
}
