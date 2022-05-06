package by.javaintroonline.modul04.aggregation_and_composition.task03;

import java.util.*;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */


public class District {
	private City districtCity;
	private String name;
	private Map<String, Double> list = new HashMap<String, Double>();
	private double area;

	private District() {
	}

	public District(City districtCity) {
		this.districtCity = districtCity;
		setName(districtCity);
	}

	public void addCity(City city) {
		list.put(city.getName(), city.getArea());
		area += city.getArea();
	}

	private void setName(City city) {
		name = city.getName() + " district";
	}

	public City getDistrictCity() {
		return districtCity;
	}

	public void setDistrictCity(City districtCity) {
		this.districtCity = districtCity;
		setName(districtCity);
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

}
