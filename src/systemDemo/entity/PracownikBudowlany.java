package systemDemo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PracownikBudowlany  extends Fachowiec implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String doswiadczenie;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoswiadczenie() {
		return doswiadczenie;
	}

	public void setDoswiadczenie(String doswiadczenie) {
		this.doswiadczenie = doswiadczenie;
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
