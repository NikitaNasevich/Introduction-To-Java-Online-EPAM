package by.javaintroonline.modul04.aggregation_and_composition.task02;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */


import java.util.ArrayList;

public class Engine {
	private boolean isEngineRunning;

	public Engine() {

	}
	
	public Engine(boolean isEngineRunning) {
		this.isEngineRunning = isEngineRunning;
	}

	public void engineStart() {
		isEngineRunning = true;
	}

	public void engineStop() {
		isEngineRunning = false;
	}

	public boolean engineCondition() {
		return isEngineRunning;
	}

	public void moveForward(ArrayList<Wheel> wheels) {
		if (isEngineRunning) {
			for (Wheel wheel : wheels) {
				wheel.rotateForward();
			}
		} else {
			System.out.println("At first need to start engine!");
		}
	}

	public void moveBack(ArrayList<Wheel> wheels) {
		if (isEngineRunning) {
			for (Wheel wheel : wheels) {
				wheel.rotateBack();
			}
		} else {
			System.out.println("At first need to start engine!");
		}
	}
	
}
