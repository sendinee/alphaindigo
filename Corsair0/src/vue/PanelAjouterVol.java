

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controleur.Vol	;
import controleur.Corsair;

public class PanelAjouterVol extends PanelCentral implements ActionListener {
	
	/*Client*/
	private JTextField txtIdvol = new JTextField();
	private JTextField txtNom = new JTextField();
	private JTextField txtDatedepart = new JTextField();
	private JTextField txtHeuredepart = new JTextField();
	private JTextField txtDatearrivee = new JTextField();
	private JTextField txtHeurearrivee = new JTextField();


	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelAjouterLogement() {
		super(Color.cyan);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Id Vol : "));
		this.add(this.txtIdvol);
		
		this.add(new JLabel("Nom : "));
		this.add(this.txtNom);
		
		this.add(new JLabel("Date de départ: "));
		this.add(this.txtDatedepart);
		
		this.add(new JLabel("heure de départ : "));
		this.add(this.txtHeuredepart);

		this.add(new JLabel("Datearrivee : "));
		this.add(this.txtDatearrivee);
		
		this.add(new JLabel("Heure arrivee : "));
		this.add(this.txtHeurearrivee);
		
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtIdvol.setText("");
			this.txtNom.setText("");
			this.txtDatedepart.setText("");
			this.txtHeuredepart.setText("");
			this.txtDatearrivee.setText("");
			this.txtHeurearrivee.setText("");

		}
		
		{
			Vol unVol = new Vol (
					this.txtIdvol.getText(), this.txtNom.getText(), this.txtDatedepart.getText(), 
					this.txtHeuredepart.getText(), this.txtDatearrivee.getText(),this.txtHeurearrivee.getText())
					;
			
			Corsair.insertVol(unVol);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtIdvol.getText(), this.txtNom.getText(), this.txtDatedepart.getText(), 
					this.txtHeuredepart.getText(), this.txtDatearrivee.getText(),this.txtHeurearrivee.getText()
					};
			
			Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtIdvol.setText("");
			this.txtNom.setText("");
			this.txtDatedepart.setText("");
			this.txtHeuredepart.setText("");
			this.txtDatearrivee.setText("");
			this.txtHeurearrivee.setText("");
			this.setVisible(false);
		}
		{
			JOptionPane.showMessageDialog(this, "Attention aux mot de passe !");
			
		}
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == this.btAnnuler)
			{
				this.txtIdvol.setText("");
				this.txtNom.setText("");
				this.txtDatedepart.setText("");
				this.txtHeuredepart.setText("");
				this.txtDatearrivee.setText("");
				this.txtHeurearrivee .setText("");

			}
			
			{
				Vol unVol = new Vol (
						this.txtIdvol.getText(), this.txtNom.getText(), this.txtDatedepart.getText(), 
						this.txtHeuredepart.getText(), this.txtDatearrivee.getText(),this.txtHeurearrivee.getText()
						);
				
				Corsair.insertVol(unVol);
				JOptionPane.showMessageDialog(this,"Insertion réussie");
				//mise à jouer de la JTable via le Tableau
				
				Object [] ligne = {this.txtIdvol.getText(), this.txtNom.getText(), this.txtDatedepart.getText(), 
						this.txtHeuredepart.getText(), this.txtDatearrivee.getText(),this.txtHeurearrivee.getText()
						};
				
				Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
				
				/********************************************************************/
				this.txtIdvol.setText("");
				this.txtNom.setText("");
				this.txtDatedepart.setText("");
				this.txtHeuredepart.setText("");
				this.txtDatearrivee.setText("");
				this.txtHeurearrivee .setText("");
				this.setVisible(false);
			}
			{
				JOptionPane.showMessageDialog(this, "Attention aux mot de passe !");
				
			}
			
		}
	}
