package view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controler.Magasin;
import controler.Vol;
import controler.Tableau;

public class PanelListerVol extends PanelCentral {
	
	private JTable uneTable;
	private Tableau unTableau; 
	
	public PanelLister() 
	{
		super(Color.white);
		String entetes [] = {"Id","Nom","Date depart","Heure depart","Date arrivee","Heure arrivee",1,2,3};
		
		//instancier le tableau 
		this.unTableau = new Tableau(entetes, Magasin.getDonnees(Magasin.selectAllVols()));
		
		this.uneTable = new JTable(Magasin.getDonnees(Magasin.selectAllVols()),entetes); // ????
		
		//affichage de la Jtable dans une JscrollPane pour SCROLLER
		JScrollPane uneScroll = new JScrollPane(this.uneTable);
		uneScroll.setBounds(20,20,400,500);
		this.add(uneScroll);
		
	}
	
	public Tableau getTableau() 
	{
		return this.unTableau;
	}
	
	//construction de la matrice des données 
	
}