package by.javaintroonline.modul04.simple_class_and_object.task08;

/*
 * Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале;
 */

public class Customer {
	private static int staticID;
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private String creditCardNumber;
	private String bankAccountNumber;

	public Customer() {
		staticID++;
		id = staticID;
	}

	public int getID() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		if (checkNumeric(creditCardNumber) && creditCardNumber.length() == 16) {
			this.creditCardNumber = creditCardNumber;
		} else {
			System.out.println("Некорректный номер кредитной карты!!");
		}
	}

	private boolean checkNumeric(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String toString() {
		return "Customer [id= " + id + ", surname= " + surname + ", name= " + name + ", patronymic= " + patronymic
				+ ", adress= " + adress + ", creditCardNumber= " + creditCardNumber + ", bankAccountNumber= "
				+ bankAccountNumber + "]";
	}

}
