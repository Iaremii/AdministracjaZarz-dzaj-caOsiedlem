package systemDemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "zamowienie")
public class Zamowienie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idZamowienie")
	private int idZamowienie;
	

	@Pattern(regexp = "[12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])", message = "date format (yyyy-mm-dd)")
	@NotNull(message = "is required")
	@Column(name = "dataZlozenia")
	private String dataZlozenia;
	
	@NotNull(message = "is required")
	@Column(name = "dataRozpoczecia")
	private String dataRozpoczecia;
	
	@NotNull(message = "is required")
	@Column(name = "dataZakonczenia")
	private String dataZakonczenia;
	
	@NotNull(message = "is required")
	@Column(name = "stan")
	private String stan;
	
	@NotNull(message = "is required")
	@Column(name = "wymaganieDodatkowe")
	private String wymaganieDodatkowe;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="PracaDomowa_idPracaDomowa")
	private PracaDomowa pracaDomowa ;
		
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="Osoba_idOsoba")
	private Osoba osoba;
	
	
	public Zamowienie() {
		// TODO Auto-generated constructor stub
	}
	

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

	public PracaDomowa getPracaDomowa() {
		return pracaDomowa;
	}

	public void setPracaDomowa(PracaDomowa pracaDomowa) {
		this.pracaDomowa = pracaDomowa;
	}

	public int getIdZamowienie() {
		return idZamowienie;
	}

	public void setIdZamowienie(int idZamowienie) {
		this.idZamowienie = idZamowienie;
	}

	public String getDataZlozenia() {
		return dataZlozenia;
	}

	public void setDataZlozenia(String dataZlozenia) {
		this.dataZlozenia = dataZlozenia;
	}

	public String getDataRozpoczecia() {
		return dataRozpoczecia;
	}

	public void setDataRozpoczecia(String dataRozpoczecia) {
		this.dataRozpoczecia = dataRozpoczecia;
	}

	public String getDataZakonczenia() {
		return dataZakonczenia;
	}

	public void setDataZakonczenia(String dataZakonczenia) {
		this.dataZakonczenia = dataZakonczenia;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getWymaganieDodatkowe() {
		return wymaganieDodatkowe;
	}

	public void setWymaganieDodatkowe(String wymaganieDodatkowe) {
		this.wymaganieDodatkowe = wymaganieDodatkowe;
	}

	@Override
	public String toString() {
		return "Zamowienie [idZamowienie=" + idZamowienie + ", dataZlozenia=" + dataZlozenia + ", dataRozpoczecia="
				+ dataRozpoczecia + ", dataZakonczenia=" + dataZakonczenia + ", stan=" + stan + ", wymaganieDodatkowe="
				+ wymaganieDodatkowe + "]";
	}

	
	

}
