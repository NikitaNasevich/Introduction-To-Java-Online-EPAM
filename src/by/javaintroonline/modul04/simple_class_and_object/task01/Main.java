package by.javaintroonline.modul04.simple_class_and_object.task01;

public class Main {

	public static void main(String[] args) {
		Test1 ts1 = new Test1();
		
		ts1.setGradePartOne(55);
		
		ts1.setGradePartTwo(15);
		
		ts1.printGradePartOne();
		ts1.printGradePartTwo();
		
		System.out.println(ts1.sumOfGrades());
		
		System.out.println(ts1.maxGrade());
	}

}
