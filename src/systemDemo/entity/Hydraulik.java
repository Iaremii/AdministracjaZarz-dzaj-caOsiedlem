package systemDemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hydraulik extends Fachowiec implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHydraulik")
	private int id;
	
	@Column(name = "uprawnieniaGazownicze")
	private boolean uprawnieniaGazownicze;

	@Override
	public void obliczStawkeZaMiesiac() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obliczLiczbeZrealizowanychZamowien() {
		// TODO Auto-generated method stub
		
	}
}
