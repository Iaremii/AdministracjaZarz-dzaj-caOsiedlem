package systemDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import systemDemo.dao.ZamowienieDAO;
import systemDemo.entity.Osoba;
import systemDemo.entity.PracaDomowa;
import systemDemo.entity.Zamowienie;

@Service

public class ZamowienieServiceImpl implements ZamowienieService {

	@Autowired 
	private ZamowienieDAO zamowienieDAO;
	
	@Override
	@Transactional
	public List<Zamowienie> getListaZamowien() {

		return zamowienieDAO.getListaZamowien();
	}

	@Override
	@Transactional
	public void saveZamowienie(Zamowienie noweZamowienie) {
		zamowienieDAO.saveZamowienie(noweZamowienie);
		
	}
	
	@Override
	@Transactional
	public List<PracaDomowa> getListaPrac(){
		
		return zamowienieDAO.getListaPrac();
	}
	
	@Override
	@Transactional
	public List<Osoba> getListaMieszkancow(){
		return zamowienieDAO.getListaMieszkancow();
	}
	
	@Override
	@Transactional
	public PracaDomowa getPracaDomowa(int theId) {
		return zamowienieDAO.getPracaDomowa(theId);
	}

	@Override
	@Transactional
	public void deleteZamowienie(int id) {
		zamowienieDAO.deleteZamowienie(id);
	}

	@Override
	@Transactional
	public void saveUser(Osoba osoba) {
		zamowienieDAO.saveUser(osoba);
		
	}
	
	@Override
	@Transactional
	public List<Zamowienie> showZamowieniaKlienta(int id) {
		
		return zamowienieDAO.showZamowieniaKlienta(id);
	}
}
