package by.javaintroonline.modul04.simple_class_and_object.task06;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

public class Main {

	public static void main(String[] args) {

		Time tm = new Time();

		System.out.println("Устанавливем 23ч");
		tm.setHours(23);
		tm.printTime();

		System.out.println("Устанавливаем 26ч");
		tm.setHours(26);
		tm.printTime();

		System.out.println("Устанавливаем 10мин");
		tm.setMinutes(10);
		tm.printTime();

		System.out.println("Устанавливаем -10мин");
		tm.setMinutes(-10);
		tm.printTime();

		System.out.println("Устанавливаем 48сек");
		tm.setSeconds(48);
		tm.printTime();

		System.out.println("Добавляем 59ч");
		tm.plusHours(59);
		tm.printTime();

		System.out.println("Добавляем 5461мин");
		tm.plusMinutes(5461);
		tm.printTime();

		System.out.println("Убавляем 59мин");
		tm.plusMinutes(-59);
		tm.printTime();

		System.out.println("Убавляем 63сек");
		tm.plusSeconds(-63);
		tm.printTime();
	}

}
