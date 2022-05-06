package by.javaintroonline.modul04.simple_class_and_object.task09;

import java.util.Calendar;

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

public class Book {
	private static int staticID;
	private String id;
	private String name = "unknown";
	private String author = "unknown";
	private String publishingHouse = "unknown";
	private int theYearOfPublishing;
	private int numberOfPages;
	private double price;
	private String bindingType = "unknown";

	public Book() {

		id = calculateID();
	}

	private String calculateID() {
		staticID++;

		String halfOfID = Integer.toString(staticID);

		int temp = halfOfID.length();

		String id = "0";

		for (int i = temp; i <= 8; i++) {
			id = id + "0";
		}

		id = id + halfOfID;

		return id;
	}

	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", theYearOfPublishing=" + theYearOfPublishing + ", numberOfPages=" + numberOfPages + ", price="
				+ price + ", bindingType=" + bindingType + "]";
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}

	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		if (author != null) {
			this.author = author;
		}

	}

	public String getAuthor() {
		return author;
	}

	public void setPublishingHouse(String publishingHouse) {
		if (publishingHouse != null) {
			this.publishingHouse = publishingHouse;
		}

	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setTheYearOfPublishing(int theYearOfPublishing) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		
		if (theYearOfPublishing > 0 && theYearOfPublishing < year) {

			this.theYearOfPublishing = theYearOfPublishing;
		}

		if (theYearOfPublishing > year) {
			System.out.println("Is this a book from the future?");
		}

	}

	public int getTheYearOfPublishing() {
		return theYearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		if (bindingType != null) {
			this.bindingType = bindingType;

		}

	}

}
