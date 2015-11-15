

import java.util.Date;
public class Clan {
	private int id;
	private String imeIPrezime;
	private Date datumRodjenja;
	private Grupa grupa;
	private String brojTelefona;

	public Clan(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	@Override
	public String toString() {
		return "Clan [id=" + id + ", imeIPrezime=" + imeIPrezime
				+ ", datumRodjenja=" + datumRodjenja + ", brojTelefona="
				+ brojTelefona + "]";
	}


}
