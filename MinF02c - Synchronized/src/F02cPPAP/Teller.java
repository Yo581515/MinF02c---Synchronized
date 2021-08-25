package F02cPPAP;

public class Teller {

	private int verdi = 0;

	public synchronized void tellOpp() {
		// Kritisk seksjon
		// Kan ha synchronized(this) på kodeblokk i stedet for på hele metoden
		verdi++; // verdi = verdi + 1
	}

	public synchronized void tellNed() {
		// Kritisk seksjon
		// Kan ha synchronized(this) på kodeblokk i stedet for på hele metoden
		verdi--; // verdi = verdi - 1
	}

	public int getVerdi() {
		return verdi;
	}
}