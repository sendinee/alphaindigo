package vue;

import java.awt.Component;

import javax.swing.JFrame;

import controleur.User;

public class Generale extends JFrame 
{
	private static PanelMenu unPanelMenu = new PanelMenu();
	private static PanelAjouter unPanelAjouter = new PanelAjouter(); 
	private static PanelLister unPanelLister= new PanelLister(); 
	private static PanelRechercher unPanelRechercher = new PanelRechercher(); 
	private static PanelSupprimer unPanelSupprimer = new PanelSupprimer();
	
	private static PanelProfil unPanelProfil; 
	
	public Generale (User unUser)
	{
		unPanelProfil = new PanelProfil(unUser);
		
		this.setTitle("Gestion de Stock");
		this.setBounds(200, 200, 700, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.add(unPanelMenu);
		this.add(unPanelAjouter);
		this.add(unPanelLister);
		this.add(unPanelRechercher);
		this.add(unPanelSupprimer);
		this.add(unPanelProfil);
		
		this.setVisible(true);
	}
	private void add(PanelProfil unPanelProfil) {
		// TODO Auto-generated method stub
		
	}
	public static void setVisibleProfil(boolean action)
	{
		Generale.unPanelProfil.setVisible(action);
	}
	public static void setVisibleAjouter(boolean action)
	{
		Generale.unPanelAjouter.setVisible(action);
	}
	public static void setVisibleLister(boolean action)
	{
		Generale.unPanelLister.setVisible(action);
	}
	public static void setVisibleRechercher(boolean action)
	{
		if(action == true)
		{
			//actualiser le CBX
			unPanelRechercher.actualise(); 
			
			
		}
		Generale.unPanelRechercher.setVisible(action);
	}
	public static PanelLister getUnPanelLister() {
		return unPanelLister;
	}
	public static void setUnPanelLister(PanelLister unPanelLister) {
		Generale.unPanelLister = unPanelLister;
	}
	public static void setVisibleSupprimer(boolean action)
	{
		Generale.unPanelSupprimer.setVisible(action);
	}
	public static PanelAjouter getUnPanelAjouter() {
		return unPanelAjouter;
	}
	public static void setUnPanelAjouter(PanelAjouter unPanelAjouter) {
		Generale.unPanelAjouter = unPanelAjouter;
	}
	public static PanelAjouter getUnLister() {
		return null;
	}
}
