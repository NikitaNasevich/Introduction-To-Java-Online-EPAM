package by.javaintroonline.modul04.aggregation_and_composition.task03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */


public class City {
	private String name;
	private double area;

	public City(String name, double area) {
		this.name = name;
		this.area = area;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", area=" + area + "]";
	}

	public double getArea() {
		return area;
	}
}
