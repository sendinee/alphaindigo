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
	private JButton btClient = new JButton("Client");
	private JButton btLogement= new JButton("Logement");
	private JButton btLocation = new JButton("Location");
	private JButton btVol = new JButton("Vol");
	private JButton btQuitter = new JButton("Quitter");
	private JButton btProfil = new JButton("Mon Profil");
	
	public PanelMenu ()
	{
		this.setBackground(Color.PINK);
		this.setBounds(20, 20, 120, 340);
		this.setLayout(new GridLayout(6, 1));
		
		this.add (this.btProfil);
		this.add (this.btClient);
		this.add (this.btLogement);
		this.add (this.btLocation);
		this.add (this.btVol);
		this.add (this.btQuitter);
		
		this.btProfil.addActionListener(this);
		this.btClient.addActionListener(this);
		this.btLogement.addActionListener(this);
		this.btLocation.addActionListener(this);
		this.btVol.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==  this.btProfil)
		{
			Generale.setVisibleProfil(true);
			Generale.setVisibleClient(false);
			Generale.setVisibleLogement(false);
			Generale.setVisibleLocation(false);
			Generale.setVisibleVol(false);
		}
		
		else if (e.getSource() ==  this.btClient)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleClient(true);
			Generale.setVisibleLogement(false);
			Generale.setVisibleLocation(false);
			Generale.setVisibleVol(false);
		}
		
		else if (e.getSource() == this.btLogement)
		{
			Generale.setVisibleClient(false);
			Generale.setVisibleLogement(true);
			Generale.setVisibleLocation(false);
			Generale.setVisibleVol(false);
		}
		
		else if (e.getSource() == this.btVol)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleClient(false);
			Generale.setVisibleLogement(false);
			Generale.setVisibleLocation(false);
			Generale.setVisibleVol(true);
		}else if (e.getSource() == this.btLocation)
		{
			Generale.setVisibleProfil(false);
			Generale.setVisibleClient(false);
			Generale.setVisibleLogement(false);
			Generale.setVisibleLocation(true);
			Generale.setVisibleVol(false);
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
