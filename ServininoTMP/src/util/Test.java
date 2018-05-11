package util;

import java.util.ArrayList;
import java.util.Date;

import servini.dao.CategorieService;
import servini.dao.CommercantService;
import servini.dao.ProduitService;
import servini.dao.Service;
import servini.dao.StockService;
import servini.dao.entity.Categorie;
import servini.dao.entity.Commercant;
import servini.dao.entity.Produit;
import servini.dao.entity.Stock;

public class Test {

	public static void main(String[] args) {
		
		CategorieService cs = new CategorieService();
		Categorie c = new Categorie("nomCategorie2", "description2");
		cs.addCategorie(c);
		
		CommercantService cc = new CommercantService();
		Commercant cm = new Commercant("nom2", "prenom2", "email2", "adresse2", 1021, "login2", "password2");
		cc.addObjet(cm);
		
		ProduitService ps = new ProduitService();
		Produit p = new Produit("nomProduit2", "marque2", 11, 11, cm, c);
		
		Date d = new Date();
		d.getTime();
		
		Stock s = new Stock(3, d); 
		
		p.addStock(s);
		
		ps.addProduit(p);
				
		StockService SS = new StockService();
		SS.addStock(s);
		
	}

}
