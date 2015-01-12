package iksOksLogika;

public class Tabela {
	private Polje[][] matrica;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Tabela() {
		matrica = new Polje[3][3];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = new Polje();
			}
		}
	}
	
	/**
	 * Getter za visinu matrice
	 * @return 3
	 */
	
	public int getVisinaMatrice() {
		return 3;
	}
	
	/**
	 * Getter za širinu matrice
	 * @return 3
	 */
	
	public int getSirinaMatrice() {
		return 3;
	}
	
	/**
	 * Setter za polje
	 * @param aktivniIgrac
	 * @param i
	 * @param j
	 * @throws Exception
	 */
	
	public void setPolje(int aktivniIgrac, int i, int j) throws Exception {
		if (provjeriPolje(i, j)) {
			matrica[i][j].postaviPolje(aktivniIgrac);
		} else {
			throw new ArrayIndexOutOfBoundsException("Nisu dobri indeksi matrice (setPolje)!");
		}
	}
	
	/**
	 * Getter za polje
	 * @param i
	 * @param j
	 * @return matrica
	 */
	
	public Polje getPolje(int i, int j) {
		if (provjeriPolje(i, j)) {
			return matrica[i][j];
		}
		throw new ArrayIndexOutOfBoundsException("Nisu dobri indeksi matrice (getPolje)!");
	}
	
	/**
	 * Metoda provjerava da li su unesene validne koordinate
	 * @param i
	 * @param j
	 * @return
	 */
	
	public boolean provjeriPolje(int i, int j) {
		return !((i < 0) || (i >= matrica.length) || (j < 0) || (j >= matrica[i].length));
	}
}
