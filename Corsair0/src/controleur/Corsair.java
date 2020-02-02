package controleur;

import java.util.ArrayList;

import modele.Modele;
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
	
	public static void main (String[] connexion)
	{
		uneConnexion = new Connexion ();
	}

	public static void instancierGeneral(User unUser) {
		uneGenerale = new Generale(unUser);
	}

	public static void rendreVisibleGeneral(boolean action) {
		uneGenerale.setVisible(action);
	}
	
	public static void insertClient(Client unClient)
	{
		
		//le controleur qui appelle le modele//
		Modele.insertClient(unClient);
	}
	
	public static ArrayList<controleur.Client> selectAllClients ()
	{
		//le controleur qui appelle le modele 
		return Modele.selectAllClients();
	}
	
	public static void deleteClient(String idclient)
	{
		Modele.delelteClient(idclient);
	}
	
	public static ArrayList<controleur.Client> findAllProduits(String mot)
    {
        return Modele.findAllClients(mot);
    }
			
	public static User SelectWhereUser(String login, String mdp)
	{
		return Modele.selectWhereUser(login, mdp);
	}

	public static void rendreVisibleConnexion(boolean action) {
		uneConnexion.setVisible(action);
	}

	public static void updateUser(User unUser) {
		Modele.updateUser(unUser);
	}

	public static void instancierGenerale() {
		//TODO Auto-generated method stub
	}

	public static Object[][] getDonnees(Object selectAllClients) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object findAllClients(String mot) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Client> selectAllVols() {
		// TODO Auto-generated method stub
		return null;
	}

}
