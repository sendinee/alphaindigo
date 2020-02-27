package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class PanelSupprimerLogement extends PanelCentral {
	
	private JComboBox idlogement = new JComboBox(); 
	private JButton btSupprimer = new JButton("Supprimer"); 
	private JLabel titre = new JLabel("Supression par référence : "); 
	
	public PanelSupprimerLogement() {
		super(Color.white);
		
		this.titre.setBounds(20, 50, 170, 30);
		this.add(this.titre); 
		
		this.idlogement.setBounds(210, 50, 100, 30);
		this.add(this.idlogement); 
		
		this.btSupprimer.setBounds(330, 50, 100, 30);
		this.add(this.btSupprimer); 
	}
}
