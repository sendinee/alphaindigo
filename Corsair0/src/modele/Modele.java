package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Client;

import controleur.User;

public class Modele 
{
	private static Bdd uneBdd = new Bdd("localhost", "corsair", "root", "");
	
	public static void insertClient (Client unClient)
	{
		String requete ="insert into client values ('"+unClient.getIdclient()+"','"+unClient.getNom()+"','"+unClient.getPrenom()+"','"
				+unClient.getAdresse()+"', '"+unClient.getEmail()+"','"+unClient.getNumero_passeport()+"','"+unClient.getTel()+"','"
				+unClient.getMdp()+"','"+unClient.getAge()+"';";
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
			String requete = "insert into vol values ('"+unVol.getIdVol()+"','"+unVol.getNom()+"','"+unVol.getDateDepart()+"',"
				+ "'"+unVol.getHeureDepart()+"','"+unVol.getDateArrivee()+"','"+unVol.getHeureArrivee()+"','"+unVol.getDateArrivee()+"','"+unVol.getIdAeroport()+"','"+unVol.getIdAvion()+"');";
	
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
				Vol unVol = new Vol (desRes.getString("idvol"), desRes.getString("nom"), desRes.getInt("datedepart"), desRes.getFloat("heuredepart"), 
					desRes.getInt("datearrivee"), desRes.getInt("heurearrivee"), desRes.getInt("idaeroport"), desRes.getInt("idavion"));
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
				Vol unVol = new Vol (desRes.getString("idvol"), desRes.getString("nom"), desRes.getInt("datedepart"), desRes.getFloat("heuredepart"),
				 desRes.getInt("datearrivee"), desRes.getInt("heurearrivee"), desRes.getInt("idaeroport"), desRes.getInt("idavion"));
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
		String requete ="insert into logement values ('"+unLogement.getidservice()+"','"+unLogement.getadresse()+"','"+unLogement.getdatedebut()+"','"
				+unLogement.getdatefin()+"', '"+unLogement.getnettoyage()+"','"+unLogement.getproprietaire()+"','"+unLogement.getsurface()+"','"
				+unLogement.getprix()+"';";
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
				Logement unLogement = new Logement (desRes.getString("idservice"),desRes.getString("adresse"), desRes.getString("datedebut"),desRes.getString("datefin"),desRes.getString("nettoyage"),
						desRes.getString("proprietaire"),desRes.getString("surface"),desRes.getString("prix"));
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
			String requete = "insert into Location values ('"+unLocation.getImmatriculation()+"','"+unLocation.getAdresse()+"',"
				+ "'"+unLocation.getDatedebut)+"','"+unLocation.getDatefin()+"','"+unLocation.getNettoyage()+"','"+unLocation.getSurface()+"','"+unLocation.getPrix()+"','"+unLocation.getIdService()+"');";
	
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
				Location unLocation = new Location (desRes.getString("immatriculation"), desRes.getString("adresse"), desRes.getInt("datedebut"), desRes.getFloat("datefin"), 
					desRes.getInt("nettoyage"), desRes.getInt("prix"), desRes.getInt("idservice"));
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
				Location unLocation = new Location (desRes.getString("immatriculation"), desRes.getString("adresse"), desRes.getInt("datedebut"), desRes.getFloat("datefin"),
				 desRes.getInt("nettoyage"), desRes.getInt("prix"), desRes.getInt("idservice")));
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
			{
				System.out.println("Erreur requete :" +requete); 
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
















