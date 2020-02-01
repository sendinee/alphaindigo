package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.Corsair;

public class Recherche extends PanelCentral implements ActionListener 
{

	private JTextField txtMot = new JTextField();
	private JButton btOk = new JButton("rechercher"); 
	private JLabel lbTitre = new JLabel("Recherche par mor clé sur la désignation"); 
	
	private JTable uneTable; 
	private String entetes[] = {"idclient","nom","prenom","adresse","email","numero_passeport","tel","mdp","age"}; 
	
	public Recherche() {
		
		super(Color.yellow);
		
		this.lbTitre.setBounds(20, 40, 350, 30); 
		this.add(this.lbTitre); 
		
		this.txtMot.setBounds(100, 90, 150, 30);
		this.add(this.txtMot); 
		
		this.btOk.setBounds(270, 90, 150, 30); 
		this.add(this.btOk); 
		
		this.btOk.addActionListener(this);
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == this.btOk)
		{
			String mot = this.txtMot.getText(); 
			this.uneTable = new JTable(Corsair.getDonnees(Corsair.findAllClients(mot)), entetes); 
			
			JScrollPane uneScroll = new JScrollPane(this.uneTable); 
			uneScroll.setBounds(20, 140, 400, 150); 
			this.add(uneScroll); 
		}
		
	}
	

}

