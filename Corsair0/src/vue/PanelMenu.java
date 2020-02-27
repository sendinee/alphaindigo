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
			Generale.setVisibleAjouter(false);
			Generale.setVisibleLister(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimer(false);
		}
		
		else if (e.getSource() ==  this.btAjouter)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouter(true);
			Generale.setVisibleLister(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimer(false);
		}
		
		else if (e.getSource() == this.btLister)
		{
			Generale.setVisibleAjouter(false);
			Generale.setVisibleLister(true);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimer(false);
		}
		
		else if (e.getSource() == this.btSupprimer)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouter(false);
			Generale.setVisibleLister(false);
			Generale.setVisibleRechercher(false);
			Generale.setVisibleSupprimer(true);
		}else if (e.getSource() == this.btRechercher)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleAjouter(false);
			Generale.setVisibleLister(false);
			Generale.setVisibleRechercher(true);
			Generale.setVisibleSupprimer(false);
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
