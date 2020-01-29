package controleur;

import java.util.ArrayList;

import com.mysql.cj.xdevapi.Client;

import vue.Connexion;
import vue.Generale;

public class Corsair {
	
	private static Generale uneGenerale = null;
	private static Connexion uneConnexion = null; 

	public static void fin()
	{
		if(uneGenerale!=null) {
			uneGenerale.dispose ();
		}
	}
	
	public static void main (String[] args)
	{
		uneConnexion = new Connexion ();
	}

	public static void instancierGeneral(User unUser) {
		uneGenerale = new Generale(unUser);
	}

	public static void rendreVisibleGeneral(boolean action) {
		uneGenerale.setVisible(action);
	}
/*
	public static void insertProduit (Produit unProduit)
	{
		//le controleur qui appelle le modele//
		Modele.insertProduit(unProduit);
	}
	
	public static ArrayList<Produit> selectAllProduits ()
	{
		//le controleur qui appelle le modele
		return Modele.selectAllProduits();
	}

	public static void deleteProduit(String ref)
	{
		Modele.delelteProduit(ref);
	}

	public static ArrayList<Produit> findAllProduits(String mot)
	{
		return Modele.findAllProduits(mot);
	}

	//construction de la matrice des données

	public static Object [][] getDonnees (ArrayList<Produit> lesProduits)
	{
		//declaration de la matrice des données 
		Object [][] matrice = new Object[lesProduits.size()][4];
	
		int i = 0;
		for (Produit unProduit : lesProduits)
		{
			matrice [i][0] = unProduit.getRef();
			matrice [i][1] = unProduit.getDes();
			matrice [i][2] = unProduit.getQte() + "";
			matrice [i][3] = unProduit.getPrix() + "";
			i++;
		} */
	
		public static User SelectWhereUser(String login, String mdp)
		{
			return Modele.selectWhereUser(login, mdp);
		}

		

		public static void rendreVisibleConnexion(boolean action) {
			uneConnexion.setVisible(action);
		}

		public static void updateUser(User unUser) {
			Modele.upadateUser(unUser);
		}

		public static void instancierGenerale() {
			//TODO Auto-generated method stub
		}

		public static void insertClient(Client unClient) {
			// TODO Auto-generated method stub
			
		}
}






























