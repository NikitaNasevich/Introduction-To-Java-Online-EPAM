package by.javaintroonline.modul04.aggregation_and_composition.task04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {
		Client vasiliy = new Client("Vasiliy");
		vasiliy.addAccount("BYN000024", 2503.5, false);
		vasiliy.addAccount("BYN000025", 0.01, false);
		vasiliy.addAccount("BYN000004", -3.5, false);

		Client ighor = new Client("Igor");
		ighor.addAccount("USD2565489", -100.65, false);
		ighor.addAccount("USD2566888", 1000.05, true);
		ighor.addAccount("USD0000001", 1900.05, false);

		Bank prior = new Bank();
		prior.addClient(vasiliy);
		prior.addClient(ighor);

		prior.blockAccount(ighor, "USD2566888");
		prior.unBlockAccount(ighor, "USD2566888");
		prior.unBlockAccount(vasiliy, "BYN000025");

		prior.findAccount("USD2566888");

		prior.sortByClients();

		prior.sortByAccountOneClient(ighor);

		prior.sortByAccountAll();

		double sumFromValisiy = prior.getSumFromAllAccounts(vasiliy);
		double sumNegativeIghor = prior.getSumFromNegativeAccounts(ighor);
		double aumPositiveVasiliy = prior.getSumFromPositiveAccounts(vasiliy);

	}

}
