package by.javaintroonline.modul04.aggregation_and_composition.task02;

import java.util.ArrayList;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */


public class Car {
	private String carModel;
	private double gasolineResidue;
	private ArrayList<Wheel> wheels;
	private Engine engine;

	public Car(String carModel) {
		this.carModel = carModel;
		initCar();
	}

	public Car() {
		initCar();
	}

	private void initCar() {
		engine = new Engine();
		wheels = new ArrayList<>(4);
		wheels.add(new Wheel(1));
		wheels.add(new Wheel(2));
		wheels.add(new Wheel(3));
		wheels.add(new Wheel(4));
	}

	public void setGasolineResidue(double gasolineResidue) {
		if (this.gasolineResidue + gasolineResidue <= 60.0) {
			this.gasolineResidue += gasolineResidue;
		} else {
			System.out.println("too much gasoline!");
		}
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public double getGasolineResidue() {
		return gasolineResidue;
	}
	
	public void refuel(double gasoline) {
		
		if (gasolineResidue + gasoline <= 60.0) {
			gasolineResidue += gasoline;
			System.out.println("Refuel = " + gasoline + " L, gasoline residue = " + gasolineResidue);
			
		} else {
			
			System.out.println("too much gasoline!");
		}
		
	}

	public void move(boolean direction) {
		if (direction) {
			
			engine.engineStart();
			int way = 0;
			System.out.println("MOVE FORWARD!");
			
			while (gasolineResidue > 0) {
				engine.moveForward(wheels);
				way += 100;
				gasolineResidue -= 10;
				
				if(gasolineResidue < 0) {
					gasolineResidue = 0;
				}
				
				System.out.println("drove ahead " + way + " kilometers gasoline residue " + gasolineResidue + ".");
			}
			
			System.out.println("Ran out of gas!");
			gasolineResidue = 0;
			
		} else {
			
			engine.engineStart();
			int way = 0;
			System.out.println("MOVE BACK!");
			
			while (gasolineResidue > 0) {
				engine.moveBack(wheels);
				way += 100;
				gasolineResidue -= 10;
				
				if(gasolineResidue < 0) {
					gasolineResidue = 0;
				}
				
				System.out.println("drove back " + way + " kilometers gasoline residue " + gasolineResidue + ".");
			}
			
			System.out.println("Ran out of gas!");
			gasolineResidue = 0;
			
		}
	}

	public void replaceWheel(int place) {
		if (place > 0 && place < 5) {
			wheels.get(place - 1).replaceWheel();
		} else {
			System.out.println("Wrong wheel!");
		}

	}
	
	public void printCarModel() {
		System.out.println(getCarModel());
	}

}
