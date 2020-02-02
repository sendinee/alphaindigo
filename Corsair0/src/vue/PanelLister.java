package vue;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Corsair;
import controleur.Tableau;

public class PanelLister extends PanelCentral
{

	private JTable uneTable ;
	private Tableau unTableau ;
	
	public PanelLister() {
		super(Color.green);
		
		String Client [] = {"idclient","nom","prenom","adresse","email","numero_passeport","tel","mdp","age"}; 
		String User [] = {"iduser", "nom", "prenom", "login", "mdp", "avatar"};
		String Location [] = {"immatriculation", "n_parking", "statut", "datedebut", "datefin", "prix", "idservice"};
		String Logement [] = {"idservice", "adresse", "datedebut", "datefin", "nettoyage", "proprietaire", "surface", "prix"};
		String Vol [] = {"idvol", "nom", "datedepart","heuredepart","datearrivee", "heurearrivee", "idaeroport", "idavion", "idaeroport_arriver"};
		
		//instancier le tableau
		this.unTableau = new Tableau(Client, Corsair.getDonnees(Corsair.selectAllClients()));
		this.unTableau = new Tableau(User, Corsair.getDonnees(Corsair.selectAllUsers()));
		this.unTableau = new Tableau(Location, Corsair.getDonnees(Corsair.selectAllLocations()));
		this.unTableau = new Tableau(Logement, Corsair.getDonnees(Corsair.selectAllLogements()));
		this.unTableau = new Tableau(Vol, Corsair.getDonnees(Corsair.selectAllVols()));
		
				
		this.uneTable = new JTable(this.unTableau);
		
		//affichage de la Jtable dans une JscrollPane 
		JScrollPane uneScroll = new JScrollPane(this.uneTable); 
		uneScroll.setBounds(20, 20, 400, 300);
		this.add(uneScroll);
		
	}

	public Tableau getTableau()
	{
		return this.unTableau;
	}
	
}