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

public class Main {

	public static void main(String[] args) {
		Customer cs = new Customer();

		Customer cs1 = new Customer();
		
		Customer cs2 = new Customer();

		cs.setCreditCardNumber("1000200030003001");
		cs1.setCreditCardNumber("1000200030004000");
		cs2.setCreditCardNumber("1000200030001000");

		cs.setAdress("Минск");
		cs1.setAdress("Логойск");
		cs2.setAdress("Витебск");

		cs.setSurname("Вернастый");
		cs1.setSurname("Абрамович");
		cs2.setSurname("Иванов");
		
		cs.setName("Зася");
		cs1.setName("Не Вася");
		cs2.setName("Иван");
		
		cs.setPatronymic("Александрович");
		cs1.setPatronymic("Эдуардович");
		cs2.setPatronymic("Иванов");

		cs.setBankAccountNumber("021568446BYN1");
		cs1.setBankAccountNumber("054864864684USD");

		System.out.println(cs.toString());
		System.out.println(cs1.toString());
		System.out.println(cs2.toString());
		
		MassCust mass = new MassCust();

		mass.add(cs);
		mass.add(cs1);
		mass.add(cs2);

		mass.printListByName();
		mass.printIntervalCreditCard("1000200030001001", "1000200030005000");

	}

}
