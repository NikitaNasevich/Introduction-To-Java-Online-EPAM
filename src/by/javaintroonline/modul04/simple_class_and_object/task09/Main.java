package by.javaintroonline.modul04.simple_class_and_object.task09;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * 
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {

	public static void main(String[] args) {

		Book bk1 = new Book();
		Book bk2 = new Book();
		Book bk3 = new Book();
		Book bk4 = new Book();
		Book bk5 = new Book();

		bk1.setAuthor("Якубович");
		bk1.setName("Поле чудес1");
		bk1.setTheYearOfPublishing(2000);
		bk1.setPublishingHouse("Первый канал");
		bk1.setBindingType("Твердый");
		bk1.setPrice(20.5);
		bk1.setNumberOfPages(168);

		bk2.setAuthor("Фредрик Бакман");
		bk2.setName("Вторая жизнь Уве");
		bk2.setTheYearOfPublishing(2021);
		bk2.setPublishingHouse("Синдбад");
		bk2.setBindingType("Твердый");
		bk2.setPrice(26.9);
		bk2.setNumberOfPages(378);

		bk3.setAuthor("Оскар Уайльд");
		bk3.setName("Портрет Дориана Грея");
		bk3.setTheYearOfPublishing(2019);
		bk3.setPublishingHouse("АСТ");
		bk3.setBindingType("Мягкий");
		bk3.setPrice(10.7);
		bk3.setNumberOfPages(320);

		bk4.setAuthor("Джордж Оруэлл");
		bk4.setName("1984");
		bk4.setTheYearOfPublishing(2015);
		bk4.setPublishingHouse("АСТ");
		bk4.setBindingType("Мягкий");
		bk4.setPrice(11.98);
		bk4.setNumberOfPages(320);

		bk5.setAuthor("Адитья Бхаргава");
		bk5.setName("Грокаем алгоритмы. Иллюстрированное пособие для программистов и любопытствующих");
		bk5.setTheYearOfPublishing(2019);
		bk5.setPublishingHouse("Питер");
		bk5.setBindingType("Мягкий");
		bk5.setPrice(30.63);
		bk5.setNumberOfPages(288);

		MassBooks mb = new MassBooks();

		mb.add(bk1);
		mb.add(bk2);
		mb.add(bk3);
		mb.add(bk4);
		mb.add(bk5);

		mb.listOfBooksByAuthor("джордж оруэлл");
		mb.listOfBooksByPublishingHouse("АСТ");
		mb.listOfBooksAfterTheYear(2021);
		
	}

}
