

import java.util.ArrayList;
import java.util.List;

public class Trener {

	private int id;
	private String imeIPrezime;
	private List<Grupa> grupe ;
	private String brojTelefona;

	public Trener(){
		grupe=new ArrayList<Grupa>();
	}
	public Trener(List<Grupa> grupe){
		for(Grupa grupa : grupe)
			this.dodajGrupu(grupa);
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

	public List<Grupa> getGrupe() {
		return grupe;
	}

	private void setGrupe(List<Grupa> grupe) {
		this.grupe = grupe;
	}

	public void dodajGrupu(Grupa nova){
		getGrupe().add(nova);
		nova.setTrener(this);
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	@Override
	public String toString() {
		return "Trener [id=" + id + ", imeIPrezime=" + imeIPrezime
				+ ", brojTelefona=" + brojTelefona + "]";
	}


}
