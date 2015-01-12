package iksOksLogika;

public class Igrica {
	private static Tabela poljanaZaIgru;
	private static int aktivniIgrac;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Igrica () {
		poljanaZaIgru = new Tabela();
		aktivniIgrac = Polje.PRVI_IGRAC;
	}
	
	public static int getIgrac()
	{
		return aktivniIgrac;
	}
	
	/**
	 * Getter za matricu
	 * @return poljanaZaIgru
	 */
	
	public Tabela getPoljanaZaIgru(){
		return poljanaZaIgru;
	}
	
	/**
	 * Metoda provjerava da li je unos validan
	 * @param i
	 * @param j
	 * @return boolean
	 */
	
	public static boolean provjeriDaLiJeDozvoljenPotez(int i, int j) {
		if (poljanaZaIgru.provjeriPolje(i, j))
			return poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja() == Polje.prazno_polje;
		return false;
	}
	
	/**
	 * Metoda postavlja vrijednost na izabrano polje
	 * @param i
	 * @param j
	 * @throws Exception
	 */
	
	public static void odigrajPotez(int i, int j) throws Exception {
		if (provjeriDaLiJeDozvoljenPotez(i, j)) {
			poljanaZaIgru.setPolje(aktivniIgrac, i, j);
			if (aktivniIgrac == Polje.PRVI_IGRAC) {
				aktivniIgrac = Polje.DRUGI_IGRAC;
			} else {
				aktivniIgrac = Polje.PRVI_IGRAC;
			}
		} else {
			throw new Exception("Ne valjaju indeksi u odigrajPotez!");
		}
	}
	
	/**
	 * Metoda provjerava da li je kraj igre
	 * @return boolean
	 */
	
	public boolean daLiJeKraj() {
		boolean imaPraznih = false;
		for (int i = 0; i < poljanaZaIgru.getVisinaMatrice(); i++) {
			for (int j = 0; j < poljanaZaIgru.getSirinaMatrice(); j++) {
				imaPraznih |= (poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja() == Polje.prazno_polje);
			}
		}
		if (!imaPraznih)
			return true;
		return nekoJePobjedio();
	}

	/**
	 * Metoda ispituje koji je ishod igrice, tj. da li je jedan od igraèa
	 * pobijedio ili je rezultat neriješen.
	 * @return
	 */
	
	public boolean nekoJePobjedio() {
		boolean pobjeda = false;
		for (int i = 0; i < 3; i++) {
			pobjeda |= (poljanaZaIgru.getPolje(i, 0).vratiVrijednostPolja() == poljanaZaIgru
					.getPolje(i, 1).vratiVrijednostPolja())
					&& (poljanaZaIgru.getPolje(i, 0).vratiVrijednostPolja() == poljanaZaIgru
							.getPolje(i, 2).vratiVrijednostPolja())
					&& (poljanaZaIgru.getPolje(i, 0).vratiVrijednostPolja() != Polje.prazno_polje);
			if (pobjeda)
				return pobjeda;
			pobjeda |= (poljanaZaIgru.getPolje(0, i).vratiVrijednostPolja() == poljanaZaIgru
					.getPolje(1, i).vratiVrijednostPolja())
					&& (poljanaZaIgru.getPolje(0, i).vratiVrijednostPolja() == poljanaZaIgru
							.getPolje(2, i).vratiVrijednostPolja())
					&& (poljanaZaIgru.getPolje(0, i).vratiVrijednostPolja() != Polje.prazno_polje);
			if (pobjeda)
				return pobjeda;
		}
		if ((poljanaZaIgru.getPolje(0, 0).vratiVrijednostPolja() == poljanaZaIgru
				.getPolje(1, 1).vratiVrijednostPolja())
				&& (poljanaZaIgru.getPolje(0, 0).vratiVrijednostPolja() == poljanaZaIgru
						.getPolje(2, 2).vratiVrijednostPolja())
				&& (poljanaZaIgru.getPolje(0, 0).vratiVrijednostPolja() != Polje.prazno_polje))
			return true;
		if ((poljanaZaIgru.getPolje(0, 2).vratiVrijednostPolja() == poljanaZaIgru
				.getPolje(1, 1).vratiVrijednostPolja())
				&& (poljanaZaIgru.getPolje(2, 0).vratiVrijednostPolja() == poljanaZaIgru
						.getPolje(1, 1).vratiVrijednostPolja())
				&& (poljanaZaIgru.getPolje(2, 0).vratiVrijednostPolja() != Polje.prazno_polje))
			return true;
		return pobjeda;
	}
	
	/**
	 * Metoda vraæa ime pobjednika, X ili O
	 * @return pobjednik
	 */
	
	public char vratiPobjednika() {
		if (!nekoJePobjedio()) {
			return Polje.prazno_polje;
		}
		if (aktivniIgrac == Polje.PRVI_IGRAC)
			return Polje.drugi_igrac;
		return Polje.prvi_igrac;
	}
}
