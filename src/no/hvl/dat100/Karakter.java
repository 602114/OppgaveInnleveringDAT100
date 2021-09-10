package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {

		int poeng = 0;
		String karakter;
		
		for (int elever=1; elever<=10; elever++) {
			String skrivPoeng = showInputDialog("Poeng: ");
			poeng = Integer.parseInt(skrivPoeng);
		
		
			if (poeng <= 100 && poeng >= 90) {
				karakter = "A";
				System.out.println(karakter);
			
			} else if (poeng <= 89 && poeng >= 80){
				karakter = "B";
				System.out.println(karakter);
			
			} else if (poeng <= 79 && poeng >= 60){
				karakter = "C";
				System.out.println(karakter);
			
			} else if (poeng <= 59 && poeng >= 50){
				karakter = "D";
				System.out.println(karakter);
			
			} else if (poeng <= 49 && poeng >= 40){
				karakter = "E";
				System.out.println(karakter);
				showMessageDialog(null, karakter);
			
			} else if (poeng <= 39 && poeng >= 0){
				karakter = "F";
				System.out.println(karakter);
			
			} else if (poeng > 100 || poeng < 0){
				String ugyldig = "Ugyldig karakter, skriv inn på nytt";
				showMessageDialog (null, ugyldig);
				elever--;
			}
		}
		
		
	}
}
