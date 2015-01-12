package konzolniInterfaceZaIksOks;
import iksOksLogika.*;

public class IgrajIksOks {

	/**
	 * Funkcija ispisuje polje za igru tako da pokazuje trenutno stanje u igri
	 * @param t
	 */
	
	private static void ispisStanja(Tabela t){
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				System.out.print(t.getPolje(i, j).vratiVrijednostPolja() +"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
 
		Igrica nasaIgra = new Igrica();
		
		System.out.println("Dobrodošli u igricu Iks Oks!. igra se odvija"
				+ "\ntako što unosite koordinate polja (od 1 do 3), a zatim"
				+ "\nèekate potez protivnika. Sretno!");
		
		while(nasaIgra.daLiJeKraj()==false){
			System.out.println("Unesite koordinate polja (od 1 do 3):");
			int i = TextIO.getInt();
			int j = TextIO.getInt();
			
			try {
				nasaIgra.odigrajPotez(i-1, j-1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ispisStanja(nasaIgra.getPoljanaZaIgru());
			
		}
		
		if(nasaIgra.nekoJePobjedio() == true)
			System.out.println("Pobjednik je " +nasaIgra.vratiPobjednika());
		else
			System.out.println("Nerjeseno");
	}

}
