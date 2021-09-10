package no.hvl.dat100;

import java.lang.NumberFormatException;
import static javax.swing.JOptionPane.*;

public class nfakultet {
	
	 /*
	 Lag et program som leser inn et heltall n > 0, 
	 beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, 
	 der n! = 1*2*3* … *(n-1)*n
	 */
	
	public static void main (String[] args) {
		int n = 0;
		
		while (true) {
			// page 295
			try {
				String input = showInputDialog("Skriv et tall høyere enn 0: ");
				n = Integer.parseInt(input);
				if (n > 0) { // Gjør at negative tall ikke fungerer
					break; // Går ut av løkken når den blir sann(true)
				}
				
			} catch (NumberFormatException e) {
				//
			}
			
			showMessageDialog(null, "FEIL TALL!!!! *ERROR* *ERROR* PRØV IGJEN");
			
		}
		
		int resultat = fakultet(n); // Kaller på metoden under for å få resultatet
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
