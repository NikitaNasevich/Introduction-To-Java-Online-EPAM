package by.javaintroonline.modul04.aggregation_and_composition.task02;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */


public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarModel("Lada Granta");
		car.setGasolineResidue(50);
		car.printCarModel();
		
		car.move(true);
		
		car.refuel(55);
		
		car.move(false);
		
		car.replaceWheel(3);
		
		
	}

}
