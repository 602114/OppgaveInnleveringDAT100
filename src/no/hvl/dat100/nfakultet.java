package no.hvl.dat100;

import java.lang.NumberFormatException;
import static javax.swing.JOptionPane.*;

public class nfakultet {
	
	 /*
	 Lag et program som leser inn et heltall n > 0, 
	 beregner verdien n! (n fakultet) og skriver verdien til n! ut p� skjermen, 
	 der n! = 1*2*3* � *(n-1)*n
	 */
	
	public static void main (String[] args) {
		int n = 0;
		
		while (true) {
			// page 295
			try {
				String input = showInputDialog("Skriv et tall h�yere enn 0: ");
				n = Integer.parseInt(input);
				if (n > 0) { // Gj�r at negative tall ikke fungerer
					break; // G�r ut av l�kken n�r den blir sann(true)
				}
				
			} catch (NumberFormatException e) {
				//
			}
			
			showMessageDialog(null, "FEIL TALL!!!! *ERROR* *ERROR* PR�V IGJEN");
			
		}
		
		int resultat = fakultet(n); // Kaller p� metoden under for � f� resultatet
		showMessageDialog(null, "Resultatet av fakultetet er " + resultat);
	}	
	
	public static int fakultet (int tall) {
		int startTall = 1;
		
		for (int factor = 1; factor <= tall; factor++) {
			startTall *= factor; //starttall = starttall * factor
		}
		
		return startTall;
	}
}
