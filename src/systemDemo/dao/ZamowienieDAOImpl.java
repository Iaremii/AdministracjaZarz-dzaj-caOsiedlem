package systemDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import systemDemo.entity.Osoba;
import systemDemo.entity.PracaDomowa;
import systemDemo.entity.Zamowienie;

@Repository

public class ZamowienieDAOImpl implements ZamowienieDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Zamowienie> getListaZamowien() {
		return sessionFactory.getCurrentSession().createQuery("from Zamowienie").list();
	}

	@Override
	public void saveZamowienie(Zamowienie noweZamowienie) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(noweZamowienie);

	}

	@Override
	public List<PracaDomowa> getListaPrac() {
		return sessionFactory.getCurrentSession().createQuery("from PracaDomowa").list();
	}

	public List<Osoba> getListaMieszkancow() {

		Session session = sessionFactory.getCurrentSession();
		List<Osoba> listaKlientow = session.createQuery("from Osoba").list();
		return listaKlientow;
	}

	@Override
	public PracaDomowa getPracaDomowa(int theId) {
		Session session = sessionFactory.getCurrentSession();
		PracaDomowa praca = session.get(PracaDomowa.class, theId);

		return praca;
	}

	@Override
	public void deleteZamowienie(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("delete from Zamowienie where id=:zamowienieId");
		theQuery.setParameter("zamowienieId", id);
		theQuery.executeUpdate();

	}

	@Override
	public void saveUser(Osoba osoba) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(osoba);

	}

	@Override
	public List <Zamowienie> showZamowieniaKlienta(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery(" from Zamowienie where Osoba_idOsoba=:osobaId ");
		theQuery.setParameter("osobaId", id);
		List<Zamowienie> zamowienie = theQuery.list();
		System.out.println(zamowienie);
		return zamowienie;
	}

}
