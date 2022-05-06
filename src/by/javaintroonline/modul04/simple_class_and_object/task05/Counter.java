package by.javaintroonline.modul04.simple_class_and_object.task05;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать 
 * или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и методы позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
	private int min;
	private int max;
	private int current;

	public Counter(int current, int min, int max) {
		if (current < min || max < current) {
			System.out.println("Значение счетчика не может выходить за пределы диапазона!!");
		} else {
			this.current = current;
			this.min = min;
			this.max = max;
		}
	}

	public Counter() {
		current = 0;
		min = 0;
		max = 2147438647;
	}

	public Counter(int min, int max) {
		current = min;
		this.min = min;
		this.max = max;
	}

	public int getCurrent() {
		return current;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void setCurrent(int current) {
		if (current < min || current > max) {
			System.out.println("Значение счетка не может выходить за пределы диапазона!!");
		} else {
			this.current = current;
		}
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void increase() {
		current++;
		if (current >= max) {
			current = max;
			System.out.println("Достигли верхнего диапазона!");
		}
	}

	public void decrease() {
		current--;
		if (current <= min) {
			current = min;
			System.out.println("Достигли нижнего диапазона!");
		}
	}

	public void printStatus() {
		System.out.println("MIN = " + min);
		System.out.println("MAX = " + max);
		System.out.println("CURRENT = " + current);

	}
}
