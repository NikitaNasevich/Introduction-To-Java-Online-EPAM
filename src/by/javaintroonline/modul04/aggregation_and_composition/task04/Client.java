package by.javaintroonline.modul04.aggregation_and_composition.task04;

import java.util.ArrayList;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Client implements Comparable<Client> {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	private String name;

	public Client(String name) {
		this.name = name;
	}

	public void addAccount(String accountName, double balance, boolean blocked) {
		accounts.add(new Account(accountName, balance, blocked, this));

	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Client o) {

		return this.name.compareTo(o.getName());
	}
}