package by.javaintroonline.modul04.aggregation_and_composition.task04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account implements Comparable<Account> {
	private String accountName;
	private double balance;
	private boolean positiveBalance;
	private boolean blocked;
	private Client owner;

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public Account() {

	}

	public Account(String accountName, double balance, boolean blocked, Client owner) {
		this.accountName = accountName;
		this.balance = balance;
		this.blocked = blocked;
		this.owner = owner;
		checkBalance(this.balance);
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		checkBalance(this.balance);
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public boolean getPositiveBalance() {
		return positiveBalance;
	}

	private void checkBalance(double balance) {
		if (balance >= 0) {
			positiveBalance = true;
		}
	}

	public String toString() {
		if (blocked) {
			return "Owner: " + owner.toString() + "; Account number: " + accountName + "; Balance: " + balance
					+ "; State of an account: bloced;";
		} else {
			return "Owner: " + owner.toString() + "; Account number: " + accountName + "; Balance: " + balance
					+ "; State of an account: unbloced;";
		}
	}

	@Override
	public int compareTo(Account o) {
		return this.accountName.compareTo(o.getAccountName());
	}
}
