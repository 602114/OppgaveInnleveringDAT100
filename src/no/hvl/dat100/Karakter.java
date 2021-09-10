package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {

		int poeng = 0;
		
		for (int elever=1; elever<=10; elever++) { // Teller antall forsøk som antall elever
				String skrivPoeng = showInputDialog("Poeng: ");
				poeng = Integer.parseInt(skrivPoeng);
			
			if (poeng > 100 || poeng < 0) { // Dette er for å fange opp om tallet er ugyldig
				showMessageDialog (null, "Ugyldig karakter, skriv inn på nytt");
				elever--; // Trenger denne for at det ugyldige forsøket ikke skal telle som en elev
				continue; // Gå videre til neste loop, i dette tilfellet til for-loopen
			}
			
			showMessageDialog (null, "Karakteren for elev nr. " + elever + " er: " + karakter(poeng)); // Denne setningen kjøres etter man har skrevet inn en valid poengsum
		}	
	}
	
	// Dette er metoden som finner den riktige karakteren for poengsummen
	public static String karakter(int poeng) {
		if (poeng <= 100 && poeng >= 90) {
			return "A";		
		} else if (poeng <= 89 && poeng >= 80) {
			return "B";
		} else if (poeng <= 79 && poeng >= 60) {
			return "C";	
		} else if (poeng <= 59 && poeng >= 50) {
			return "D";	
		} else if (poeng <= 49 && poeng >= 40) {
			return "E";	
		} else if (poeng <= 39 && poeng >= 0) {
			return "F";	
		} 
		
		return ""; // Grei å ha i tilfelle
	}
	
}
