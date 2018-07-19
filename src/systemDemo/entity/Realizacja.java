package systemDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="realizacja")
public class Realizacja {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRealizacja")
	private int idRealizacja;
	
	@Column(name = "opis")
	private String opis;
	
	@Column(name = "ocena")
	private String ocena;

	public int getIdRealizacja() {
		return idRealizacja;
	}

	public void setIdRealizacja(int idRealizacja) {
		this.idRealizacja = idRealizacja;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getOcena() {
		return ocena;
	}

	public void setOcena(String ocena) {
		this.ocena = ocena;
	}
	
	
}
