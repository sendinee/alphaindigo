package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controleur.Corsair;

public class PanelMenu extends JPanel implements ActionListener
{
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btLister= new JButton("Lister");
	private JButton btRechercher = new JButton("Rechercher");
	private JButton btSupprimer = new JButton("Supprimer");
	private JButton btQuitter = new JButton("Quitter");
	private JButton btProfil = new JButton("Mon Profil");
	
	public PanelMenu ()
	{
		this.setBackground(Color.PINK);
		this.setBounds(20, 20, 120, 340);
		this.setLayout(new GridLayout(6, 1));
		
		this.add (this.btProfil);
		this.add (this.btAjouter);
		this.add (this.btLister);
		this.add (this.btRechercher);
		this.add (this.btSupprimer);
		this.add (this.btQuitter);
		
		this.btProfil.addActionListener(this);
		this.btAjouter.addActionListener(this);
		this.btLister.addActionListener(this);
		this.btRechercher.addActionListener(this);
		this.btSupprimer.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==  this.btProfil)
		{
			Generale.setVisibleProfil(true);
			Generale.setVisibleAjouterClient(false);
			Generale.setVisibleAjouterLocation(false);
			Generale.setVisibleAjouterLogement(false);
			Generale.setVisibleAjouterUser(false);
			Generale.setVisibleAjouterVol(false);
			Generale.setVisibleListerClient(false);
			Generale.setVisibleListerLocation(false);
			Generale.setVisibleListerLogement(false);
			Generale.setVisibleListerUser(false);
			Generale.setVisibleListerVol(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimerClient(false);
			Generale.setVisibleSupprimerLocation(false);
			Generale.setVisibleSupprimerLogement(false);
			Generale.setVisibleSupprimerUser(false);
			Generale.setVisibleSupprimerVol(false);
		}
		
		else if (e.getSource() ==  this.btAjouter)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouterClient(true);
			Generale.setVisibleAjouterLocation(true);
			Generale.setVisibleAjouterLogement(true);
			Generale.setVisibleAjouterUser(true);
			Generale.setVisibleAjouterVol(true);
			Generale.setVisibleListerClient(false);
			Generale.setVisibleListerLocation(false);
			Generale.setVisibleListerLogement(false);
			Generale.setVisibleListerUser(false);
			Generale.setVisibleListerVol(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimerClient(false);
			Generale.setVisibleSupprimerLocation(false);
			Generale.setVisibleSupprimerLogement(false);
			Generale.setVisibleSupprimerUser(false);
			Generale.setVisibleSupprimerVol(false);
		}
		
		else if (e.getSource() == this.btLister)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouterClient(false);
			Generale.setVisibleAjouterLocation(false);
			Generale.setVisibleAjouterLogement(false);
			Generale.setVisibleAjouterUser(false);
			Generale.setVisibleAjouterVol(false);
			Generale.setVisibleListerClient(true);
			Generale.setVisibleListerLocation(true);
			Generale.setVisibleListerLogement(true);
			Generale.setVisibleListerUser(true);
			Generale.setVisibleListerVol(true);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimerClient(false);
			Generale.setVisibleSupprimerLocation(false);
			Generale.setVisibleSupprimerLogement(false);
			Generale.setVisibleSupprimerUser(false);
			Generale.setVisibleSupprimerVol(false);
		}
		
		else if (e.getSource() == this.btRechercher)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouterClient(false);
			Generale.setVisibleAjouterLocation(false);
			Generale.setVisibleAjouterLogement(false);
			Generale.setVisibleAjouterUser(false);
			Generale.setVisibleAjouterVol(false);
			Generale.setVisibleListerClient(false);
			Generale.setVisibleListerLocation(false);
			Generale.setVisibleListerLogement(false);
			Generale.setVisibleListerUser(false);
			Generale.setVisibleListerVol(false);
			Generale.setVisibleRechercher(true);
			Generale.setVisibleSupprimerClient(false);
			Generale.setVisibleSupprimerLocation(false);
			Generale.setVisibleSupprimerLogement(false);
			Generale.setVisibleSupprimerUser(false);
			Generale.setVisibleSupprimerVol(false);
			
		}else if (e.getSource() == this.btSupprimer)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouterClient(false);
			Generale.setVisibleAjouterLocation(false);
			Generale.setVisibleAjouterLogement(false);
			Generale.setVisibleAjouterUser(false);
			Generale.setVisibleAjouterVol(false);
			Generale.setVisibleListerClient(false);
			Generale.setVisibleListerLocation(false);
			Generale.setVisibleListerLogement(false);
			Generale.setVisibleListerUser(false);
			Generale.setVisibleListerVol(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimerClient(true);
			Generale.setVisibleSupprimerLocation(true);
			Generale.setVisibleSupprimerLogement(true);
			Generale.setVisibleSupprimerUser(true);
			Generale.setVisibleSupprimerVol(true);
		}
		
		else if (e.getSource() == this.btQuitter)
		{
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter l'application ?", "Quitter Application", JOptionPane.YES_NO_OPTION);
			if (retour == 0)
			{
				Corsair.fin(); //fin de générale
				Corsair.rendreVisibleConnexion(true);
			}
		}
	}	
}
