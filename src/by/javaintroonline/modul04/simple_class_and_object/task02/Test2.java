package by.javaintroonline.modul04.simple_class_and_object.task02;

/*
 * Создйте класс Test2 c двумя переменными. Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
	private int firstGrade;
	private int secondGrade;
	
	public Test2(int firstGrade, int secondGrade) {
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}
	
	public Test2() {
		this.firstGrade = 0;
		this.secondGrade = 0;
	}
	
	public void setFirstGrade(int firstGrade) {
		this.firstGrade = firstGrade;
	}
	
	public void setSecondGrade(int secondGrade) {
		this.secondGrade = secondGrade;
	}
	
	public int getFirstGrade() {
		return this.firstGrade;
	}
	
	public int getSecondGrade() {
		return this.secondGrade;
	}
}
