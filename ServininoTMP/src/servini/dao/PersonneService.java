package servini.dao;

import java.util.List;

import servini.dao.entity.Personne;

public class PersonneService extends Service<Personne> {

	public void addPersonne(Personne o) {
		super.addObjet(o);
	}

	public List<Personne> getAllPersonne() {
		return super.getAllObjets("Personne");
	}

	public Personne getPersonneById(int id) {
		return super.getById(Personne.class, id);
	}

	public void deletePersonne(Personne o) {
		super.deleteObjet(Personne.class, o.getIdPersonne());
	}

	public void updatePersonne(Personne obj) {
		super.updateObjet(obj);
	}
}
