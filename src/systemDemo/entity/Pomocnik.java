package systemDemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pomocnik extends Fachowiec implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPomocnik")
	private int id;
	
	@Column(name = "ulubioneZwierzeta")
	private String ulubionyGarunekZwierzet ;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUlubionyGarunekZwierzet() {
		return ulubionyGarunekZwierzet;
	}

	public void setUlubionyGarunekZwierzet(String ulubionyGarunekZwierzet) {
		this.ulubionyGarunekZwierzet = ulubionyGarunekZwierzet;
	}

	@Override
	public void obliczStawkeZaMiesiac() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obliczLiczbeZrealizowanychZamowien() {
		// TODO Auto-generated method stub
		
	}

}
