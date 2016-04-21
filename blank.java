
public class blank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		client c1 = new client("Maks", "Nechaiew", "1");
		client c2 = new client("Vova", "Trikoz", "2");
		
		account a1 = new account(c1);
		a1.incBalance(150);
		account a2	 = new account(c1);
		a1.AccountInfo();
		a2.AccountInfo();
		a1.transfer(a2, 75);
		a1.AccountInfo();
		a2.AccountInfo();
	}

}
