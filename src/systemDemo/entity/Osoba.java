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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@Entity
@Table(name = "osoba")
public class Osoba {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOsoba")
	private int idOsoba;
	
	@NotNull(message = "is required")
	@Column(name = "imie")
	private String imie;
	
	@NotNull(message = "is required")
	@Column(name = "nazwisko")
	private String nazwisko;
	
	@Pattern(regexp = "(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{3}", message = "phone format (xxx-xxx-xxx)")
	@NotNull(message = "is required")
	@Column(name = "telefon")
	private String telefon;
	
	@NotNull(message = "is required")
	@Column(name = "ulica")
	private String ulica;
	
	@NotNull(message = "is required")
	@Min(value = 1,message = "between 1-20")
	@Max(value = 15,message = "between 1-20")
	@Column(name = "nrDomu")
	private String nrDomu;
	
	@NotNull(message = "is required")
	@Column(name = "nrMieszkania")
	private String nrMieszkania;
	
	@OneToMany(mappedBy = "osoba", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Zamowienie> zamowienia;
	
	public Osoba() {
		// TODO Auto-generated constructor stub
	}
	

	public int getIdOsoba() {
		return idOsoba;
	}


	public void setIdOsoba(int idOsoba) {
		this.idOsoba = idOsoba;
	}


	public String getImie() {
		return imie;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getUlica() {
		return ulica;
	}


	public void setUlica(String ulica) {
		this.ulica = ulica;
	}


	public String getNrDomu() {
		return nrDomu;
	}


	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}


	public String getNrMieszkania() {
		return nrMieszkania;
	}


	public void setNrMieszkania(String nrMieszkania) {
		this.nrMieszkania = nrMieszkania;
	}


	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}


	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}


	public void add(Zamowienie tempZamowienie) {
		if (zamowienia == null) {
			zamowienia = new ArrayList<>();
		}
		zamowienia.add(tempZamowienie);

		tempZamowienie.setOsoba(this);

	}


	@Override
	public String toString() {
		return "Osoba [idOsoba=" + idOsoba + ", imie=" + imie + ", nazwisko=" + nazwisko + ", telefon=" + telefon
				+ ", ulica=" + ulica + ", nrDomu=" + nrDomu + ", nrMieszkania=" + nrMieszkania + ", zamowienia="
				+ zamowienia + "]";
	}

	
	
	
	
	
}
