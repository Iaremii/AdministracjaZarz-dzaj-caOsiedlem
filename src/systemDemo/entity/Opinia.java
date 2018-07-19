package systemDemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="opinia")
public class Opinia {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOpinia")
	private int idOpinia;
	
	@Column(name = "dataWystawienia")
	private Date dataWystawienia;

	public int getIdOpinia() {
		return idOpinia;
	}

	public void setIdOpinia(int idOpinia) {
		this.idOpinia = idOpinia;
	}

	public Date getDataWystawienia() {
		return dataWystawienia;
	}

	public void setDataWystawienia(Date dataWystawienia) {
		this.dataWystawienia = dataWystawienia;
	}
	
	
}
