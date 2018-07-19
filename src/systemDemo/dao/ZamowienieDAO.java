package systemDemo.dao;

import java.util.List;

import systemDemo.entity.Osoba;
import systemDemo.entity.PracaDomowa;
import systemDemo.entity.Zamowienie;

public interface ZamowienieDAO {

	public List<Zamowienie> getListaZamowien();

	public void saveZamowienie(Zamowienie noweZamowienie);
	
	public List<PracaDomowa> getListaPrac();
	
	public List<Osoba> getListaMieszkancow();

	public PracaDomowa getPracaDomowa(int theId);

	public void deleteZamowienie(int id);
	
	public void saveUser(Osoba osoba);
	
	public List<Zamowienie> showZamowieniaKlienta(int id);
}
