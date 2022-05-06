package by.javaintroonline.modul04.aggregation_and_composition.task03;

import java.util.HashMap;
import java.util.Map;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */


public class Region {
	private City regionCity;
	private String name;
	private Map<String, Double> list = new HashMap<String, Double>();
	private double area;

	public Region(City regionCity) {
		this.regionCity = regionCity;
		setName(regionCity);
	}

	private Region() {

	}

	private void setName(City city) {
		name = city.getName() + " region";
	}

	public void addDistrict(District district) {
		list.put(district.getName(), district.getArea());
		area += district.getArea();
	}

	public City getRegionCity() {
		return regionCity;
	}

	public void setRegionCity(City regionCity) {
		this.regionCity = regionCity;
		setName(regionCity);
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}
}
