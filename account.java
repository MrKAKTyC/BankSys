public class account {
	private int Balance;
	private client clnt;
	private boolean bloked;

	account(client cl, int gold) {
		Balance = gold;
		bloked = false;
		clnt = cl;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBloked(boolean bloked) {
		this.bloked = bloked;
	}

	public boolean isBloked() {
		return bloked;
	}

	private boolean OK() {
		return !bloked;
	}

	public void incBalance(int plus) {
		if (OK())
			Balance += plus;
		else
			System.err.println("Incrementation problem");
	}

	public void decBalance(int minus) {
		if (OK() && Balance > minus)
			Balance = Balance - minus;
		else
			System.err.println("Decrementation problem");

	}

	public void transfer(account acc, int gold) {
		if (OK() & acc.OK() & Balance > gold) {
			decBalance(gold);
			acc.incBalance(gold);
		} else
			System.err.println("transfer problem");

	}

	public void AccountInfo() {
		System.out.println("Owner " + clnt.getFirstName() + " " + clnt.getLastName()
				+ "\nBalance - " + Balance + "\nIs blocked? - " + bloked);
	}

}