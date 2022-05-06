package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Tour {
	private Period period;
	private Food food;
	private Transport transport;
	private Holiday holiday;
	private City city;

	public Tour(City city, Holiday holiday, Period period, Transport transport, Food food) {
		this.city = city;
		this.holiday = holiday;
		this.period = period;
		this.transport = transport;
		this.food = food;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Holiday getHoliday() {
		return holiday;
	}

	public void setHoliday(Holiday holiday) {
		this.holiday = holiday;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Tour to - " + city + ", type of tour - " + holiday + ", period - " + period + ", transport - "
				+ transport + ", food - " + food + ".";
	}

}
