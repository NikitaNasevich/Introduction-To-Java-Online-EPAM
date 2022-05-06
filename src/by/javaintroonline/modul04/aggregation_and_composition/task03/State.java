package by.javaintroonline.modul04.aggregation_and_composition.task03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class State {
	private String capitalCity;
	private String name;
	private Map<String, Double> list = new HashMap<String, Double>();
	private double area;

	public State(String name, String capitalCity) {
		this.name = name;
		this.capitalCity = capitalCity;
	}

	public String getCapitalCity() {
		return "The capital city of " + name + ": " + capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addRegion(Region region) {
		list.put(region.getName(), region.getArea());
		area += region.getArea();
	}

	public double getArea() {
		return area;
	}

	public int getNumberOfRegions() {
		return list.size();
	}

	public String listOfRegions() {
		String listOF = "";
		Set<String> names = list.keySet();
		for (String name : names) {
			listOF += name + "; ";
		}

		return listOF;
	}
}
