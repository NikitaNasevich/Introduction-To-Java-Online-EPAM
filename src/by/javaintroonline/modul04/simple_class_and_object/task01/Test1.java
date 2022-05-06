package by.javaintroonline.modul04.simple_class_and_object.task01;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение 
 * из этих двух переменных.
 */

public class Test1 {

	private int gradePartOne;
	private int gradePartTwo;

	public void printGradePartOne() {
		System.out.println(gradePartOne);
	}

	public void printGradePartTwo() {
		System.out.println(gradePartTwo);
	}

	public void setGradePartOne(int gradePartOne) {
		this.gradePartOne = gradePartOne;
	}

	public void setGradePartTwo(int gradePartTwo) {
		this.gradePartTwo = gradePartTwo;
	}

	public int sumOfGrades() {
		return gradePartOne + gradePartTwo;
	}

	public int maxGrade() {

		if (gradePartOne >= gradePartTwo) {
			return gradePartOne;
		} else {
			return gradePartTwo;
		}
	}

}
