package no.itfakultetet.java;

import java.io.FileWriter;

public class Kontakt {

	private String fornavn;
	private String etternavn;
	private String epost;
	private String telefon;

	public Kontakt() {
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getEpost() {
		return epost;
	}

	public void setEpost(String epost) {
		this.epost = epost;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public void lagre() {
		String kontaktRad = "\"\""+getFornavn() +"\",\"" + getEtternavn() + "\",\"" + getEpost() + "\",\"" + getTelefon() + "\"\r\n";

		try {
			FileWriter fil = new FileWriter("kontakter.csv", true);
			fil.append(kontaktRad);
			fil.append("\n");
			fil.close();
			System.out.println("Kontakt: " + getFornavn() + " " + getEtternavn() + " er lagret.");
		} catch (Exception e) {
			System.out.println("Kunne ikke opprette eller skrive til filen fordi: "+ e);
		e.printStackTrace();
		}
	}

}
