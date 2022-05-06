package by.javaintroonline.modul04.simple_class_and_object.task03;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
 *  имеющих оценки, равные только 9 или 10.
 */

public class Main {

	public static void main(String[] args) {

		Student[] st = new Student[10];

		st[0] = new Student("Студентов А.В.", "401-a", new int[] { 8, 9, 5, 6, 10 });
		st[1] = new Student("Преподавателев Я.Я.", "301-б", new int[] { 9, 9, 10, 9, 10 });
		st[2] = new Student("Отличников Н.Я.", "110-a", new int[] { 10, 10, 10, 10, 10 });
		st[3] = new Student("Прогульщик О.Н.", "408-в", new int[] { 1, 2, 4, 4, 5 });
		st[4] = new Student("Старостов Н.А.", "202-a", new int[] { 9, 9, 9, 9, 10 });
		st[5] = new Student("Второгодникова Ю.Г.", "501-a", new int[] { 5, 4, 5, 6, 4 });
		st[6] = new Student("Аудиториева Г.В.", "101-a", new int[] { 6, 9, 5, 7, 10 });
		st[7] = new Student("Аспирантович В.Ы.", "501-a", new int[] { 8, 9, 8, 6, 10 });
		st[8] = new Student("Деканов П.П.", "001-0", new int[] { 10, 10, 10, 10, 10 });
		st[9] = new Student("Ректор А.А.", "001-0", new int[] { 11, 11, 11, 11, 11 });

		System.out.println("Список отличников: ");
		for (int i = 0; i < st.length; i++) {
			st[i].printExcellentStudent();
		}
		System.out.println("Конец списка!");
	}

}
