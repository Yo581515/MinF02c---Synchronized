package F02cPPAP;

public class TelleNedTraad extends Thread {

	private Teller teller;
	private int n;

	public TelleNedTraad(Teller teller, int n) {
		this.teller = teller;
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			teller.tellNed();// Kan gjøre synchronized her i stedet for i Teller
		}
	}
}