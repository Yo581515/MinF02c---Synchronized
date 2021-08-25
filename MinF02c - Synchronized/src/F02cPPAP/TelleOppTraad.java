package F02cPPAP;

public class TelleOppTraad extends Thread {

	private Teller teller;
	private int n;

	public TelleOppTraad(Teller teller, int n) {
		this.teller = teller;
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			teller.tellOpp();// Kan gjøre synchronized her i stedet for i Teller
		}
	}
}