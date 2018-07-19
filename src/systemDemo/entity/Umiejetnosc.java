package systemDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="umiejetnosc")
public class Umiejetnosc {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUmiejetnosc")
	private int idUmiejetnosc;
	
	@Column(name = "uwagiDodatkowe")
	private int uwagiDodatkowe;

	public int getIdUmiejetnosc() {
		return idUmiejetnosc;
	}

	public void setIdUmiejetnosc(int idUmiejetnosc) {
		this.idUmiejetnosc = idUmiejetnosc;
	}

	public int getUwagiDodatkowe() {
		return uwagiDodatkowe;
	}

	public void setUwagiDodatkowe(int uwagiDodatkowe) {
		this.uwagiDodatkowe = uwagiDodatkowe;
	}
	
	


}
