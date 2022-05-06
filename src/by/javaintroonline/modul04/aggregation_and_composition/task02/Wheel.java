package by.javaintroonline.modul04.aggregation_and_composition.task02;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Wheel {
	private String place;

	public Wheel(int place) {
		this.place = initPlace(place);
	}

	public Wheel() {
	}

	private String initPlace(int place) {

		String result = "Something went wrong!";

		switch (place) {
		case 1:
			result = "in Front on the right";
			break;
		case 2:
			result = "in front on the left";
			break;
		case 3:
			result = "behind on the right";
			break;
		case 4:
			result = "behind on the left";
			break;
		}

		return result;

	}

	public void setWheel(int place) {
		this.place = initPlace(place);
	}

	public String getWheel() {
		return place;
	}
	
	public void rotateForward() {
		System.out.println("Wheel " + place + " spins forward!");
	}
	
	public void rotateBack() {
		System.out.println("Wheel " + place + " spins backwards!");
	}
	
	public void replaceWheel() {
		System.out.println("Wheel " + place + " replaced!");
	}
	
	public String toString() {
		return "Wheel " + place;
	}
}
