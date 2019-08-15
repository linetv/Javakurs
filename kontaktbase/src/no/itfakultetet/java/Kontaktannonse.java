package no.itfakultetet.java;

import java.util.Scanner;

public class Kontaktannonse {

	public Kontaktannonse() {
	}

	public static void main(String[] args) {

		Kontakt nykontakt = new Kontakt();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Legg til ny kontakt");
			System.out.println("2. Vis alle kontakter");
			System.out.println("3. Finn en kontakt");
			System.out.println("q. Avslutt");

			String valg = sc.nextLine();
			
			if (valg.equals("q")) {
				System.out.println("Farvel...");
				break;
			}else if (valg.equals("1")) {
				
			System.out.println("Kontaktens fornavn:");
			nykontakt.setFornavn(sc.nextLine());
				
			System.out.println("Kontaktens etternavn:");
			nykontakt.setEtternavn(sc.nextLine());
			
			System.out.println("Kontaktens epost:");
			nykontakt.setEpost(sc.nextLine());
			
			System.out.println("Kontaktens Telefon:");
			nykontakt.setTelefon(sc.nextLine());
			
			nykontakt.lagre();
			
				
			}else if (valg.equals("2")) {	
			
			}else if (valg.equals("3")) {	
				
			}else {
				System.out.println("Du må taste inn 1, 2, 3 eller q.");
				
			}
			
		}

		sc.close();
	}

}
