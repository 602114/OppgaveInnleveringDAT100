package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		// Oppgave B4 - Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.
		int inntekt; // Inntekt pleier som regel å være heltall
		double trinnskatt;
		double sats = 0;
		
		String inntektTxt = showInputDialog("Legg til din inntekt: ");
		inntekt = Integer.parseInt(inntektTxt);
		
		
		if (inntekt > 164100 && inntekt <= 230950) {
			sats = 0.93/100;	// Tar og deler satsen på 100 her for å sørge for at matten er riktig
		} else if (inntekt > 230950 && inntekt <= 580650) {
			sats = 2.41/100;
		} else if (inntekt > 580650 && inntekt <= 934050) {
			sats = 11.52/100;
		} else if (inntekt > 934050) {
			sats = 14.52/100;
		}
		
		trinnskatt = inntekt * sats;  // Dette regner ut trinnskatten basert på den tilhørende satsen for inntekten
		String sum = "Din trinnskatt er: " + trinnskatt;
		showMessageDialog(null, sum);
	}

}
