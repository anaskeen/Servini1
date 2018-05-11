package servini.dao;

import java.util.List;

import servini.dao.entity.Categorie;

public class CategorieService extends Service<Categorie> {

	public void addCategorie(Categorie o) {
		super.addObjet(o);
	}

	public List<Categorie> getAllCategorie() {
		return super.getAllObjets("Categorie");
	}

	public Categorie getCategorieById(int id) {
		return super.getById(Categorie.class, id);
	}

	public void deleteCategorie(Categorie o) {
		super.deleteObjet(Categorie.class, o.getIdCategorie());
	}

	public void updateCategorie(Categorie obj) {
		super.updateObjet(obj);
	}

}
