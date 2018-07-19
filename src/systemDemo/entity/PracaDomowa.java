package systemDemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pracadomowa")
public class PracaDomowa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPracaDomowa")
	private int idPracaDomowa;

	@Column(name = "nazwa")
	private String nazwa;

	@Column(name = "opis")
	private String opis;

	@Column(name = "jednostka")
	private String jednostka;

	@Column(name = "kosztJednostkowy")
	private String kosztJednostkowy;

	@OneToMany(mappedBy = "pracaDomowa", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Zamowienie> zamowienia;

	public void add(Zamowienie tempZamowienie) {
		if (zamowienia == null) {
			zamowienia = new ArrayList<>();
		}
		zamowienia.add(tempZamowienie);

		tempZamowienie.setPracaDomowa(this);

	}

	public int getIdPracaDomowa() {
		return idPracaDomowa;
	}

	public void setIdPracaDomowa(int idPracaDomowa) {
		this.idPracaDomowa = idPracaDomowa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getJednostka() {
		return jednostka;
	}

	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}

	public String getKosztJednostkowy() {
		return kosztJednostkowy;
	}

	public void setKosztJednostkowy(String kosztJednostkowy) {
		this.kosztJednostkowy = kosztJednostkowy;
	}

	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

	@Override
	public String toString() {
		return "PracaDomowa [idPracaDomowa=" + idPracaDomowa + ", nazwa=" + nazwa + ", opis=" + opis + ", jednostka="
				+ jednostka + ", kosztJednostkowy=" + kosztJednostkowy + ", zamowienia=" + zamowienia + "]";
	}
	
	

}
