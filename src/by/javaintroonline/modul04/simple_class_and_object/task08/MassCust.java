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

public class MassCust {
	private Customer[] cust;

	public MassCust() {
		cust = new Customer[10];
	}

	public void add(Customer cust) {
		if (checkLength(this.cust)) {
			this.cust = increaseMass(this.cust);
		}

		this.cust[getNumberOfLastElement(this.cust)] = cust;
	}

	private boolean checkLength(Customer[] cust) {
		boolean check = false;

		if (cust[cust.length - 1] != null) {
			check = true;
		}
		return check;
	}

	private int getNumberOfLastElement(Customer[] cust) {
		int number = cust.length - 1;

		for (int i = 0; i < cust.length; i++) {
			if (cust[i] == null) {
				number = i;
				break;
			}
		}
		return number;
	}

	private Customer[] increaseMass(Customer[] cust) {
		Customer[] newCust = new Customer[cust.length * 2];

		for (int i = 0; i < cust.length; i++) {
			newCust[i] = cust[i];
		}

		return newCust;
	}

	public void remove(Customer cust) {
		for (int i = 0; i < this.cust.length; i++) {
			if (this.cust[i] == cust) {
				this.cust[i] = null;
				break;
			} else {
				System.out.println("Данный объект в массиве не найден!");
			}
		}
	}

	private void sortByName() {

		for (int i = 0; i < this.cust.length - 1; i++) {
			int check = 0;

			if (this.cust[i + 1] != null) {
				check = this.cust[i].getSurname().compareTo(this.cust[i + 1].getSurname());
			} else {
				break;
			}

			if (check > 0) {
				Customer temp = this.cust[i];

				this.cust[i] = cust[i + 1];

				cust[i + 1] = temp;

				if (i == 0) {
					i--;
				} else {
					i -= 2;
				}
			}
		}
	}

	public void printListByName() {
		sortByName();

		for (int i = 0; i < this.cust.length; i++) {
			if (this.cust[i] != null) {
				System.out.println("ФИО: " + cust[i].getSurname() + " " + cust[i].getName() + " "
						+ cust[i].getPatronymic() + " | ID: " + cust[i].getID() + " | " + " | Адресс: "
						+ cust[i].getAdress() + " | Номер кредитной карты: " + cust[i].getCreditCardNumber()
						+ " | Номер банковского счета: " + cust[i].getBankAccountNumber() + ";");
			} else {
				break;
			}
		}
	}

	public void printIntervalCreditCard(String start, String finish) {

		for (int i = 0; i < this.cust.length; i++) {
			if (this.cust[i] != null) {
				int checkStart = cust[i].getCreditCardNumber().compareTo(start);
				int checkFinish = cust[i].getCreditCardNumber().compareTo(finish);

				if (checkStart >= 0 && checkFinish < 0) {
					System.out.println("ФИО: " + cust[i].getSurname() + " " + cust[i].getName() + " "
							+ cust[i].getPatronymic() + " | ID: " + cust[i].getID() + " | " + " | Адресс: "
							+ cust[i].getAdress() + " | Номер кредитной карты: " + cust[i].getCreditCardNumber()
							+ " | Номер банковского счета: " + cust[i].getBankAccountNumber() + ";");
				}
			} else {
				break;
			}
		}
	}

}
