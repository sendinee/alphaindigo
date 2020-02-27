package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class PanelSupprimerVol extends PanelCentral {
	
	private JComboBox idvol = new JComboBox(); 
	private JButton btSupprimer = new JButton("Supprimer"); 
	private JLabel titre = new JLabel("Supression par référence : "); 
	
	public PanelSupprimerVol() {
		super(Color.white);
		
		this.titre.setBounds(20, 50, 170, 30);
		this.add(this.titre); 
		
		this.idvol.setBounds(210, 50, 100, 30);
		this.add(this.idvol); 
		
		this.btSupprimer.setBounds(330, 50, 100, 30);
		this.add(this.btSupprimer); 
	}
}
