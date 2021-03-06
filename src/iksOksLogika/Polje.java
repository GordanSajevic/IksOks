package iksOksLogika;

public class Polje {
	public static final int PRVI_IGRAC = -1;
	public static final int DRUGI_IGRAC = 1;
	public static final int PRAZNO_POLJE = 0;

	private int vrijednost;

	public static char prvi_igrac = 'X';
	public static char drugi_igrac = 'O';
	public static char prazno_polje = ' ';
	
	// Ovo nam je za GUI kada budemo iscrtavali stanje tabele
	public static String prvi;
	public static String drugi;
	public static String prazno;
	
	/**
	 * Konstruktor bez parametaras
	 */
	
	public Polje() {
		super();
		vrijednost = PRAZNO_POLJE;
	}
	
	/**
	 * Metoda koja postavlja vrijednosti na polja u matrici
	 * @param vrijednost
	 * @throws Exception
	 */
	
	public void postaviPolje(int vrijednost) throws Exception {
		if (this.vrijednost == PRAZNO_POLJE) {
			if ((vrijednost != PRVI_IGRAC) && (vrijednost != DRUGI_IGRAC)) {
				throw new IllegalArgumentException("Nije unesen odgovarajuci znak.");
			}
			this.vrijednost = vrijednost;
		} else {
			throw new Exception("Polje je vec popunjeno!");
		}
	}
	
	/**
	 * Metoda koja funkcioniše kao getter za vrijednost polja
	 * @return int
	 */
	
	public char vratiVrijednostPolja() {
		if (vrijednost == PRAZNO_POLJE)
			return prazno_polje;
		if (vrijednost == PRVI_IGRAC)
			return prvi_igrac;
		return drugi_igrac;
	}
	
	/**
	 * metoda koja postavlja znakove koji se kasnije unose u matricu
	 * @param p
	 * @param d
	 * @param prazno
	 */
	
	public static void postaviZnakove(char p, char d, char prazno) {
		prvi_igrac = p;
		drugi_igrac = d;
		prazno_polje = prazno;
	}
}
