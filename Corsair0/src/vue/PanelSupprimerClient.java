package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controleur.Client;
import controleur.Corsair;
import controleur.Vol;

public class PanelSupprimer extends PanelCentral implements ActionListener 
{
	private JComboBox cbxClient = new JComboBox(); 
	private JComboBox cbxVol = new JComboBox();
	private JComboBox cbxLogement = new JComboBox();
	private JComboBox cbxLocation = new JComboBox();
	private JComboBox cbxUser = new JComboBox();
	private JButton btOk = new JButton("Supprimer"); 
	private JLabel lbtitre = new JLabel("Supression par référence : ");
	
	private Object unClient; 
	private Object unVol;
	private Object unLogement;
	private Object unLocation;
	private Object unUser;
			
	public PanelSupprimer() {
		super(Color.red);
		
		this.lbtitre.setBounds(20, 50, 170, 30);
		this.add(this.lbtitre); 
		
		this.cbxClient.setBounds(210, 50, 100, 30);
		this.add(this.cbxClient); 
		
		this.cbxVol.setBounds(210, 50, 100, 30);
		this.add(this.cbxVol);
		
		this.cbxLogement.setBounds(210, 50, 100, 30);
		this.add(this.cbxLogement);
		
		this.cbxLocation.setBounds(210, 50, 100, 30);
		this.add(this.cbxLocation);
		
		this.cbxUser.setBounds(210, 50, 100, 30);
		this.add(this.cbxUser);
		
		this.btOk.setBounds(330, 50, 100, 30);
		this.add(this.btOk); 
		
		//On appelle la méthode pour remplir le select
		this.remplirCbx(); 
		
		//rendre le bouton cliquable 
		this.btOk.addActionListener(this);
		
	}
	
	private void add(Object cbxVol) {
		ArrayList<Vol> lesVols = Corsair.selectAllVols(); 
		
		for(Vol unVol :lesVols)
		{
			this.cbxVol.addItem(unVol.getIdvol() + " | " + unVol.getNom());
		}
		
	}

	public void remplirCbx()
	{
		ArrayList<Client> lesClients = Corsair.selectAllClients(); 
		
		for(Client unClient :lesClients)
		{
			this.cbxClient.addItem(unClient.getIdclient() + " | " + unClient.getNom());
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == this.btOk)
		{
			String chaine = this.cbxClient.getSelectedItem().toString(); 
			String client = chaine.split(" | ")[0]; 
			int retour = JOptionPane.showConfirmDialog(this, "Voulez vous supprimer ?"); 
			
			if(retour == 0)
			{
				Corsair.deleteClient(unClient);
				JOptionPane.showMessageDialog(this, "Suppresion réussie"); 
				this.cbxClient.removeItem(chaine);
			}
		}
		
		if(e.getSource() == this.btOk)
		{
			String chaine = this.cbxVol.getSelectedItem().toString(); 
			String vol = chaine.split(" | ")[0]; 
			int retour = JOptionPane.showConfirmDialog(this, "Voulez vous supprimer ?"); 
			
			if(retour == 0)
			{
				Corsair.deleteVol(unVol);
				JOptionPane.showMessageDialog(this, "Suppresion réussie"); 
				this.cbxVol.removeItem(chaine);
			}
		}
		
		if(e.getSource() == this.btOk)
		{
			String chaine = this.cbxLogement.getSelectedItem().toString(); 
			String logement = chaine.split(" | ")[0]; 
			int retour = JOptionPane.showConfirmDialog(this, "Voulez vous supprimer ?"); 
			
			if(retour == 0)
			{
				Corsair.deleteLogement(unLogement);
				JOptionPane.showMessageDialog(this, "Suppresion réussie"); 
				this.cbxLogement.removeItem(chaine);
			}
		}
		
		if(e.getSource() == this.btOk)
		{
			String chaine = this.cbxLocation.getSelectedItem().toString(); 
			String location = chaine.split(" | ")[0]; 
			int retour = JOptionPane.showConfirmDialog(this, "Voulez vous supprimer ?"); 
			
			if(retour == 0)
			{
				Corsair.deleteLocation(unLocation);
				JOptionPane.showMessageDialog(this, "Suppresion réussie"); 
				this.cbxLocation.removeItem(chaine);
			}
		}
		
		if(e.getSource() == this.btOk)
		{
			String chaine = this.cbxUser.getSelectedItem().toString(); 
			String user = chaine.split(" | ")[0]; 
			int retour = JOptionPane.showConfirmDialog(this, "Voulez vous supprimer ?"); 
			
			if(retour == 0)
			{
				Corsair.deleteUser(unUser);
				JOptionPane.showMessageDialog(this, "Suppresion réussie"); 
				this.cbxUser.removeItem(chaine);
			}
		}
		
	}
	
	public void actualise()
	{
		this.cbxClient.removeAllItems(); 
		this.remplirCbx(); 
		
		this.cbxVol.removeAllItems(); 
		this.remplirCbx();
		
		this.cbxLogement.removeAllItems(); 
		this.remplirCbx();
		
		this.cbxLocation.removeAllItems(); 
		this.remplirCbx();
		
		this.cbxUser.removeAllItems(); 
		this.remplirCbx();
	}

}
