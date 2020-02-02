package vue;

import java.awt.Component;

import javax.swing.JFrame;

import controleur.User;

public class Generale extends JFrame 
{
	private static PanelMenu unPanelMenu = new PanelMenu();
	private static PanelClient unPanelClient = new PanelClient(); 
	private static PanelLogement unPanelLogement= new PanelLogement(); 
	private static PanelLocation unPanelLocation = new PanelLocation(); 
	private static PanelVol unPanelVol = new PanelVol();
	
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
		this.add(unPanelClient);
		this.add(unPanelLogement);
		this.add(unPanelLocation);
		this.add(unPanelVol);
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
	public static void setVisibleClient(boolean action)
	{
		Generale.unPanelClient.setVisible(action);
	}
	public static void setVisibleLogement(boolean action)
	{
		Generale.unPanelLogement.setVisible(action);
	}
	public static void setVisibleLocation(boolean action)
	{
		if(action == true)
		{
			//actualiser le CBX
			unPanelLocation.actualise(); 
			
			
		}
		Generale.unPanelLocation.setVisible(action);
	}
	public static void setVisibleVol(boolean action)
	{
		Generale.unPanelVol.setVisible(action);
	}
	public static PanelClient getUnPanelClient() {
		return unPanelClient;
	}
	public static void setUnPanelClient(PanelClient unPanelClient) {
		Generale.unPanelClient = unPanelClient;
	}
	public static PanelClient getUnLister() {
		// TODO Auto-generated method stub
		return null;
	}
}
