package systemDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="licencja")
public class Licencja {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLicencja")
	private int idLicencja;
	
	@Column(name = "dataUzyskania")
	private int dataUzyskania;

	public int getIdLicencja() {
		return idLicencja;
	}

	public void setIdLicencja(int idLicencja) {
		this.idLicencja = idLicencja;
	}

	public int getDataUzyskania() {
		return dataUzyskania;
	}

	public void setDataUzyskania(int dataUzyskania) {
		this.dataUzyskania = dataUzyskania;
	}
	
	
	
}
