package by.javaintroonline.modul04.simple_class_and_object.task05;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать 
 * или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса.
 */

public class Main {

	public static void main(String[] args) {
		
		Counter ct = new Counter(0, 0, 101);
		
		do {
			ct.increase();
			
		} while (ct.getCurrent() < ct.getMax());
		
		ct.printStatus();
		
		ct.setCurrent(55);
		ct.setMax(200);
		ct.setMin(14);
		ct.printStatus();
		
		do {
			ct.decrease();
			
		} while (ct.getCurrent() > ct.getMin());
		
		ct.printStatus();
		
		ct = new Counter();
		
		System.out.println("Новый счетчик с параметрами по умолчанию:");
		ct.printStatus();
		
		ct = new Counter(13, 20);
		System.out.println("Новый счетчик с параметрами:");
		ct.printStatus();
		
		
	}
	
	

}
