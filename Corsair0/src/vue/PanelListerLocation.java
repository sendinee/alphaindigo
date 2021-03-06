package view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controler.Magasin;
import controler.Location;
import controler.Tableau;

public class PanelListerLocation extends PanelCentral {
	
	private JTable uneTable;
	private Tableau unTableau; 
	
	public PanelLister() 
	{
		super(Color.white);
		String entetes [] = {"Immatriculation","Numero Parking","Statut","Date debut","Date fin","Prix",1};
		
		//instancier le tableau 
		this.unTableau = new Tableau(entetes, Magasin.getDonnees(Magasin.selectAllLocations()));
		
		this.uneTable = new JTable(Magasin.getDonnees(Magasin.selectAllLocations()),entetes); // ????
		
		//affichage de la Jtable dans une JscrollPane pour SCROLLER
		JScrollPane uneScroll = new JScrollPane(this.uneTable);
		uneScroll.setBounds(20,20,400,500);
		this.add(uneScroll);
		
	}
	
	public Tableau getTableau() 
	{
		return this.unTableau;
	}
	
	//construction de la matrice des donn�es 
	
}

