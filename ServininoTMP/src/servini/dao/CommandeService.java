package servini.dao;

import java.util.List;

import servini.dao.entity.Commande;

public class CommandeService extends Service<Commande> {
	public void addCommande(Commande o) {
		super.addObjet(o);
	}

	public List<Commande> getAllCommande() {
		return super.getAllObjets("Commande");
	}

	public Commande getCommandeById(int id) {
		return super.getById(Commande.class, id);
	}

	public void deleteCommande(Commande o) {
		super.deleteObjet(Commande.class, o.getIdCommande());
	}

	public void updateCommande(Commande obj) {
		super.updateObjet(obj);
	}

}
