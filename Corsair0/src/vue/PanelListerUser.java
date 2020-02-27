package view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controler.Magasin;
import controler.User;
import controler.Tableau;

public class PanelListerUser extends PanelCentral {
	
	private JTable uneTable;
	private Tableau unTableau; 
	
	public PanelLister() 
	{
		super(Color.white);
		String entetes [] = {1,"Login","Mot de passe"};
		
		//instancier le tableau 
		this.unTableau = new Tableau(entetes, Magasin.getDonnees(Magasin.selectAllUsers()));
		
		this.uneTable = new JTable(Magasin.getDonnees(Magasin.selectAllUsers()),entetes); // ????
		
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
