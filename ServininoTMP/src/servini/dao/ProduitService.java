package servini.dao;

import java.util.List;

import servini.dao.entity.Produit;

public class ProduitService extends Service<Produit> {

	public void addProduit(Produit o) {
		super.addObjet(o);
	}

	public List<Produit> getAllProduit() {
		return super.getAllObjets("Produit");
	}

	public Produit getProduitById(int id) {
		return super.getById(Produit.class, id);
	}

	public void deleteProduit(Produit o) {
		super.deleteObjet(Produit.class, o.getIdProduit());
	}

	public void updateProduit(Produit obj) {
		super.updateObjet(obj);
	}
}
