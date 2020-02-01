package vue;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Corsair;
import controleur.Tableau;

public class Lister extends PanelCentral
{

	private JTable uneTable ;
	private Tableau unTableau ;
	
	public Lister() {
		super(Color.green);
		
		String entetes [] = {"idclient","nom","prenom","adresse","email","numero_passeport","tel","mdp","age"}; 
		
		//instancier le tableau
		this.unTableau = new Tableau(entetes, Corsair.getDonnees(Corsair.selectAllClients()));
				
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