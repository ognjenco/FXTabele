

import java.util.ArrayList;
import java.util.List;

public class Grupa {
	private String naziv;
	private List<Clan> clanovi;
	private Trener trener;

	public Grupa(){
		clanovi = new ArrayList<Clan>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Clan> getClanovi() {
		return clanovi;
	}

	public void setClanovi(List<Clan> clanovi) {
		this.clanovi = clanovi;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}



	@Override
	public String toString() {
		return "Grupa [naziv=" + naziv + ", trener=" + trener + "]";
	}


}
