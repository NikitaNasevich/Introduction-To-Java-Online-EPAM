package by.javaintroonline.modul04.simple_class_and_object.task03;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
 *  имеющих оценки, равные только 9 или 10.
 */

public class Student {
	private String lastnameNFN;
	private String groupNumber;
	private int[] academicPerformance;

	public Student(String lastnameNFN, String groupNumber, int[] academicPerformance) {
		this.lastnameNFN = lastnameNFN;
		this.groupNumber = groupNumber;
		this.academicPerformance = academicPerformance;
	}

	private boolean checkExcellentStudent(int[] academicPerformance) {
		boolean check = true;

		for (int i = 0; i < academicPerformance.length; i++) {
			if (academicPerformance[i] < 9 || academicPerformance[i] > 10) {
				check = false;
				break;
			}
		}

		return check;
	}

	public void printExcellentStudent() {
		if (checkExcellentStudent(academicPerformance)) {
			System.out.println(lastnameNFN + " " + groupNumber);
		}
	}
}
