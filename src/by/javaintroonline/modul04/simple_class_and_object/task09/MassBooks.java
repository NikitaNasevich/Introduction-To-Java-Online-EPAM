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

public class MassBooks {

	private Book[] book;

	public MassBooks() {
		book = new Book[10];
	}

	public void listOfBooksByAuthor(String author) {
		System.out.println("List of books by " + author + ":");
		int check = 0;
		for (int i = 0; i < getNumberOfLastElement(book); i++) {
			if (book[i].getAuthor().equalsIgnoreCase(author)) {
				System.out.println(book[i].getName());
				check = 1;
			}
		}
		
		if (check == 0) {
			System.out.println("Книг авторства " + author + " не найдено");
		}
	}
	
	public void listOfBooksByPublishingHouse(String publishingHouse) {
		System.out.println("List of books published by " + publishingHouse + ":");
		int check = 0;
		for (int i = 0; i < getNumberOfLastElement(book); i++) {
			if (book[i].getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
				System.out.println(book[i].getName());
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("Книг издательства " + publishingHouse + " не найдено");
		}
	}
	
	public void listOfBooksAfterTheYear(int theYearOfPublishing) {
		System.out.println("List of books published after " + theYearOfPublishing + ":");
		int check = 0;
		for (int i = 0; i < getNumberOfLastElement(book); i++) {
			if (book[i].getTheYearOfPublishing() > theYearOfPublishing) {
				System.out.println(book[i].getName());
				check = 1;
			}
		}
		
		if (check == 0) {
			System.out.println("Книг изданых после  " + theYearOfPublishing + " года не найдено");
		}
	}

	public void add(Book book) {
		if (checkLength(this.book)) {
			this.book = increaseMass(this.book);
		}

		this.book[getNumberOfLastElement(this.book)] = book;
	}

	private boolean checkLength(Book[] book) {
		boolean check = false;

		if (book[book.length - 1] != null) {
			check = true;
		}
		return check;
	}

	private int getNumberOfLastElement(Book[] book) {
		int number = book.length - 1;

		for (int i = 0; i < book.length; i++) {
			if (book[i] == null) {
				number = i;
				break;
			}
		}
		return number;
	}

	private Book[] increaseMass(Book[] book) {
		Book[] newCust = new Book[book.length * 2];

		for (int i = 0; i < book.length; i++) {
			newCust[i] = book[i];
		}

		return newCust;
	}

	public void remove(Book book) {
		for (int i = 0; i < this.book.length; i++) {
			if (this.book[i] == book) {
				this.book[i] = null;
				break;
			} else {
				System.out.println("Данный объект в массиве не найден!");
			}
		}
	}
}
