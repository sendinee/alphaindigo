package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Client;
import controleur.Location;
import controleur.Logement;
import controleur.User;
import controleur.Vol;

public class Modele 
{
	private static Bdd uneBdd = new Bdd("localhost", "corsair", "root", "");
	
	public static void insertClient (Client unClient)
	{
		String requete ="insert into client values ('"+unClient.getIdclient()+"','"+unClient.getNom()+"','"+unClient.getPrenom()+"','"
				+unClient.getAdresse()+"', '"+unClient.getEmail()+"','"+unClient.getNumero_passeport()+"','"+unClient.getTel()+"','"
				+unClient.getMdp()+"','"+unClient.getAge()+");";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	
	public static ArrayList<Client> selectAllClients ()
	{
		ArrayList<Client> lesClients = new ArrayList<>();
		String requete = "select * from client;";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desRes = unStat.executeQuery(requete);
			while(desRes.next())
			{
				Client unClient = new Client (desRes.getString("idclient"),desRes.getString("nom"), desRes.getString("prenom"),desRes.getString("adresse"),desRes.getString("email"),
						desRes.getString("numero_passeport"),desRes.getString("tel"),desRes.getString("mdp"),desRes.getString("age"));
				lesClients.add(unClient);
			}
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesClients;
	}
	
	public static void delelteClient(String idclient)
	{
		String requete = "delete from client where idclient = '"+ idclient + "';"; 
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	
	public static ArrayList<Client> findAllClients (String mot)
	{
		ArrayList<Client> lesClients = new ArrayList<>();
		String requete = "select * from client;";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desRes = unStat.executeQuery(requete);
			while(desRes.next())
			{
				Client unClient = new Client (desRes.getString("idclient"),desRes.getString("nom"), desRes.getString("prenom"),desRes.getString("adresse"),desRes.getString("email"),
						desRes.getString("numero_passeport"),desRes.getString("tel"),desRes.getString("mdp"),desRes.getString("age"));
				lesClients.add(unClient);
			}
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesClients;
	}
	
	/*Vol*/
	public static void insertVol (Vol unVol)
	{
			String requete = "insert into vol values ('"+unVol.getIdvol()+"','"+unVol.getNom()+"','"+unVol.getDatedepart()+"','"
				+ "','"+unVol.getHeuredepart()+"','"+unVol.getDatearrivee()+"','"+unVol.getHeurearrivee()+"','"+unVol.getDatearrivee()+"','"+unVol.getIdaeroprt()+"','"+unVol.getIdavion()+"','"+unVol.getIdaeroport_arriver()+"');";
	
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
	
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("execution : "+requete);
		}
	}
	
	public static void deleteVol(String idvol)
	{
		String requete = "delete from vol where idvol = '"+ idvol + "';"; 
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}  
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	

	public static ArrayList<Vol> selectAllVols()
	{
		ArrayList<Vol> lesVols = new ArrayList<>();
		String requete = "select * from vol;";
		try {
			uneBdd.seConnecter(); 
			Statement unStat= uneBdd.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(requete); 
			while(desRes.next()) {
				Vol unVol = new Vol (desRes.getString("idvol"), desRes.getString("nom"), desRes.getString("datedepart"), desRes.getString("heuredepart"), 
					desRes.getString("datearrivee"), desRes.getString("heurearrivee"), desRes.getString("idaeroport"), desRes.getString("idavion"), desRes.getString("idaeroport_arriver"));
				lesVols.add(unVol);
			}
			
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter(); 
		}
		
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesVols;
	} 
	
	public static ArrayList<Vol> findAllVols(String mot)
	{
		ArrayList<Vol> lesVols = new ArrayList<>();
		String requete = "select * from vol;";
		try {
			uneBdd.seConnecter(); 
			Statement unStat= uneBdd.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(requete); 
			while(desRes.next()) {
				Vol unVol = new Vol (desRes.getString("idvol"), desRes.getString("nom"), desRes.getString("datedepart"), desRes.getString("heuredepart"),
				 desRes.getString("datearrivee"), desRes.getString("heurearrivee"), desRes.getString("idaeroport"), desRes.getString("idavion"), desRes.getString("idaeroport_arriver"));
				lesVols.add(unVol);
			}
			
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter(); 
		}
		
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesVols;
	}
	
	/*Logement*/
	public static void insertLogement (Logement unLogement)
	{
		String requete ="insert into logement values ('"+unLogement.getIdservice()+"','"+unLogement.getAdresse()+"','"+unLogement.getDatedebut()+"','"
				+unLogement.getDatedebut()+"', '"+unLogement.getNettoyage()+"','"+unLogement.getProprietaire()+"','"+unLogement.getSurface()+"','"
				+unLogement.getPrix()+");";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	
	public static ArrayList<Logement> selectAllLogements ()
	{
		ArrayList<Logement> lesLogements = new ArrayList<>();
		String requete = "select * from logement;";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desRes = unStat.executeQuery(requete);
			while(desRes.next())
			{
				Logement unLogement = new Logement (desRes.getString("idservice"),desRes.getString("nom"), desRes.getString("adresse"), desRes.getString("datedebut"),desRes.getString("datefin"),desRes.getString("nettoyage"),
						desRes.getString("proprietaire"),desRes.getInt("surface"),desRes.getInt("prix"));
				lesLogements.add(unLogement);
			}
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesLogements;
	}
	
	public static void deleteLogement(String idservice)
	{
		String requete = "delete from logement where idcservice = '"+ idservice + "';"; 
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	
	
	/*Location*/
	public static void insertLocation (Location unLocation)
	{
			String requete = "insert into Location values ('"+unLocation.getImmatriculation()+"','"+unLocation.getN_parking()+"',"
				+ "'"+unLocation.getStatut()+"','"+unLocation.getDatedebut()+"','"+unLocation.getDatefin()+"','"+unLocation.getPrix()+"','"+unLocation.getIdservice()+"');";
	
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
	
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("execution : "+requete);
		}
	}
	
	public static void deleteLocation(String immatriculation)
	{
		String requete = "delete from Location where immatriculation = '"+ immatriculation + "';"; 
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}  
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
	}
	

	public static ArrayList<Location> selectAllLocations()
	{
		ArrayList<Location> lesLocations = new ArrayList<>();
		String requete = "select * from location;";
		try {
			uneBdd.seConnecter(); 
			Statement unStat= uneBdd.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(requete); 
			while(desRes.next()) {
				Location unLocation = new Location (desRes.getString("immatriculation"), desRes.getInt("n_parking"), desRes.getString("statut"), desRes.getString("datedebut"), 
					desRes.getString("datefin"), desRes.getInt("prix"), desRes.getString("idservice"));
				lesLocations.add(unLocation);
			}
			
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter(); 
		}
		
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesLocations;
	} 
	
	public static ArrayList<Location> findAllLocations(String mot)
	{
		ArrayList<Location> lesLocations = new ArrayList<>();
		String requete = "select * from Location;";
		try {
			uneBdd.seConnecter(); 
			Statement unStat= uneBdd.getMaConnexion().createStatement(); 
			ResultSet desRes = unStat.executeQuery(requete); 
			while(desRes.next()) {
				Location unLocation = new Location (desRes.getString("immatriculation"), desRes.getInt("n_parking"), desRes.getString("statut"), desRes.getString("datedebut"),
				 desRes.getString("datefin"), desRes.getInt("prix"), desRes.getString("idservice"));
				lesLocations.add(unLocation);
			}
			
			desRes.close();
			unStat.close();
			uneBdd.seDeConnecter(); 
		}
		
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete : " + requete);
		}
		return lesLocations;
	}
	
	public static User selectWhereUser(String login, String mdp)
	{
		User unUser = null; 
		
		String requete = "select * from user where login ='" +login+"' and mdp = '" + mdp + "';"; 
		
		try
		{
			uneBdd.seConnecter(); 
			Statement unStat = uneBdd.getMaConnexion().createStatement(); 
			ResultSet unRes = unStat.executeQuery(requete); 
			
			if(unRes.next())
			{
				unUser = new User(unRes.getInt("iduser"), unRes.getString("nom"), 
						 unRes.getString("prenom"),  unRes.getString("login"),  unRes.getString("mdp"), unRes.getString("avatar")); 
			}
			unRes.close();
			unStat.close(); 
			uneBdd.seDeConnecter();
			
		}
			catch(SQLException exp)
			{				System.out.println("Erreur requete :" +requete); 
			}
			
			return unUser; 
		
	}

	public static void updateUser(User unUser) {
		
		String requete = "update user set mdp = '"+ unUser.getMdp() + "' Where login = '" + unUser.getLogin()+"';"; 
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution : " + requete);
		}
		
	}

}
