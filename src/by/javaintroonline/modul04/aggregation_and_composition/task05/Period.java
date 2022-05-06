package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Period {
	private PeriodType period;

	public Period(PeriodType period) {
		this.period = period;
	}

	public PeriodType getPeriod() {
		return period;
	}

	public void setPeriod(PeriodType period) {
		this.period = period;
	}

	public String toString() {
		return period.toString();
	}

}
