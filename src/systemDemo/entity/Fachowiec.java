package systemDemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@MappedSuperclass
public abstract class Fachowiec {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFachowiec")
	private int idFachowiec;
	
	@Column(name = "dataZatrudnienia")
	private Date dataZatrudnienia;
	
	@Column(name = "stawka")
	private double stawka;
	
	private static double minStawka = 30;

	public Date getDataZatrudnienia() {
		return dataZatrudnienia;
	}

	public void setDataZatrudnienia(Date dataZatrudnienia) {
		this.dataZatrudnienia = dataZatrudnienia;
	}

	public double getStawka() {
		return stawka;
	}

	public void setStawka(double stawka) {
		this.stawka = stawka;
	}

	public static double getMinStawka() {
		return minStawka;
	}

	public static void setMinStawka(double minStawka) {
		Fachowiec.minStawka = minStawka;
	}
	
	public abstract void obliczStawkeZaMiesiac();
	public abstract void obliczLiczbeZrealizowanychZamowien();
	

}
