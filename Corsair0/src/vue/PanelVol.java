package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Client;

import controleur.Corsair;
import controleur.Tableau;


public class PanelVol extends PanelCentral implements ActionListener {
	
	/*Ajouter*/
	
	private JTextField txtidvol = new JTextField();
	private JTextField txtnom = new JTextField();
	private JTextField txtdatedepart = new JTextField();
	private JTextField txtheuredepart = new JTextField();
	private JTextField txtdatearrivee = new JTextField();
	private JTextField txtheurearrivee = new JTextField();

	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelVol() {
		super(Color.cyan);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Id Vol : "));
		this.add(this.txtidvol);
		
		this.add(new JLabel("Nom : "));
		this.add(this.txtnom);
		
		this.add(new JLabel("Date Depart: "));
		this.add(this.txtdatedepart);
		
		this.add(new JLabel("Heure Depart : "));
		this.add(this.txtheuredepart);

		this.add(new JLabel("Date Arrivée : "));
		this.add(this.txtdatearrivee);
		
		this.add(new JLabel("Heure arrivée : "));
		this.add(this.txtheurearrivee);
		
		
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtidvol.setText("");
			this.txtnom.setText("");
			this.txtdatedepart.setText("");
			this.txtheuredepart.setText("");
			this.txtdatearrivee.setText("");
			this.txtheurearrivee.setText("");

		}
		
		{
			Vol unIdVol = new Vol (
					this.txtidvol.getText(), this.txtnom.getText(), this.txtdatedepart.getText(), 
					this.txtheuredepart.getText(), this.txtdatearrivee.getText(),this.txtheurearrivee.getText()
					
					);
			
			Corsair.insertVol(unVol);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtidvol.getText(), this.txtnom.getText(), this.txtdatedepart.getText(), 
					this.txtheuredepart.getText(), this.txtdatearrivee.getText(),this.txtheurearrivee.getText()
					};
			
			Generale.getUnLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtidvol.setText("");
			this.txtnom.setText("");
			this.txtdatedepart.setText("");
			this.txtheuredepart.setText("");
			this.txtdatearrivee.setText("");
			this.txtheurearrivee.setText("");
			this.setVisible(false);
		}
	}


	public void setVisible(boolean action) {
		// TODO Auto-generated method stub
		
	}
	
	/*Lister*/
	public class Lister extends PanelCentral {
	private JTable uneTable ;
	private Tableau unTableau ;
	
		public Lister() {
			super(Color.green);
		
			String entetes [] = {"idvol","nom","datedepart","heuredepart","datearrivee","heurearrivee"}; 
		
			//instancier le tableau
			this.unTableau = new Tableau(entetes, Corsair.getDonnees(Corsair.selectAllVols()));
				
			this.uneTable = new JTable(this.unTableau);
		
			//affichage de la Jtable dans une JscrollPane 
			JScrollPane uneScroll = new JScrollPane(this.uneTable); 
			uneScroll.setBounds(20, 20, 400, 300);
			this.add(uneScroll);
		
		}

		public Tableau getTableau()
		{
			return this.unTableau;
		}
	}

}
