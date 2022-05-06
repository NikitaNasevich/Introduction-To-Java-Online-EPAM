package by.javaintroonline.modul04.aggregation_and_composition.task04;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Bank {
	private ArrayList<Client> clients = new ArrayList<Client>();

	public void addClient(Client client) {
		clients.add(client);
	}

	public void blockAccount(Client client, String accountName) {

		for (Client checkClient : clients) {

			if (checkClient.equals(client)) {

				for (Account account : checkClient.getAccounts()) {

					if (account.getAccountName().equals(accountName) && !account.isBlocked()) {
						account.setBlocked(true);
						break;
					} else if (account.getAccountName().equals(accountName) && account.isBlocked()) {
						System.out.println("Account " + accountName + " already blocked");
						break;
					} else {
					}
				}

				break;
			} else {

			}
		}

	}

	public void unBlockAccount(Client client, String accountName) {

		for (Client checkClient : clients) {

			if (checkClient.equals(client)) {

				for (Account account : checkClient.getAccounts()) {

					if (account.getAccountName().equals(accountName) && account.isBlocked()) {
						account.setBlocked(false);
						break;
					} else if (account.getAccountName().equals(accountName) && !account.isBlocked()) {
						System.out.println("Account " + accountName + " already unblocked");
						break;
					} else {
					}
				}
				break;
			} else {

			}
		}

	}

	public void findAccount(String accountName) {
		for (Client client : clients) {
			for (Account account : client.getAccounts()) {
				if (account.getAccountName().equals(accountName)) {
					System.out.println("Account " + accountName + ":");
					System.out.println(account.toString());
				}
			}
		}
	}

	public void sortByClients() {
		Collections.sort(clients);
	}

	public void sortByAccountOneClient(Client client) {
		for (Client cl : clients) {
			if (cl.equals(client)) {
				Collections.sort(cl.getAccounts());
			}
		}

	}

	public void sortByAccountAll() {
		for (Client cl : clients) {
			Collections.sort(cl.getAccounts());
		}
	}

	public double getSumFromAllAccounts(Client client) {
		double sum = 0;
		for (Client cl : clients) {
			if (cl.equals(client)) {
				for (Account ac : cl.getAccounts()) {
					sum += ac.getBalance();
				}
			}
		}

		return sum;
	}

	public double getSumFromPositiveAccounts(Client client) {
		double sum = 0;
		for (Client cl : clients) {
			if (cl.equals(client)) {
				for (Account ac : cl.getAccounts()) {
					if (ac.getPositiveBalance())
						sum += ac.getBalance();
				}
			}
		}

		return sum;
	}

	public double getSumFromNegativeAccounts(Client client) {
		double sum = 0;
		for (Client cl : clients) {
			if (cl.equals(client)) {
				for (Account ac : cl.getAccounts()) {
					if (!ac.getPositiveBalance())
						sum += ac.getBalance();
				}
			}
		}

		return sum;
	}

	public void printAll() {
		for (Client client : clients) {

			for (Account account : client.getAccounts()) {
				System.out.println(account.toString());
			}
		}
	}

}
