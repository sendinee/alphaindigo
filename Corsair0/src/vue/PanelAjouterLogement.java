

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controleur.Logement;
import controleur.Corsair;

public class PanelAjouterLogement extends PanelCentral implements ActionListener {
	
	/*Client*/
	private JTextField txtIdservice = new JTextField();
	private JTextField txtAdresse = new JTextField();
	private JTextField txtDatedebut = new JTextField();
	private JTextField txtDatefin = new JTextField();
	private JTextField txtNettoyage = new JTextField();
	private JTextField txtProprietaire = new JTextField();
	private JTextField txtSurface = new JTextField();
	private JTextField txtPrix = new JTextField();

	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelAjouterLogement() {
		super(Color.cyan);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Id service : "));
		this.add(this.txtIdservice);
		
		this.add(new JLabel("Adresse : "));
		this.add(this.txtAdresse);
		
		this.add(new JLabel("Date de début: "));
		this.add(this.txtDatedebut);
		
		this.add(new JLabel("date de fin : "));
		this.add(this.txtDatefin);

		this.add(new JLabel("Nettoyage : "));
		this.add(this.txtNettoyage);
		
		this.add(new JLabel("Proprietaire : "));
		this.add(this.txtProprietaire);
		
		this.add(new JLabel("Surface : "));
		this.add(this.txtSurface);
		
		this.add(new JLabel("Prix : "));
		this.add(this.txtPrix);
		
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtIdservice.setText("");
			this.txtAdresse.setText("");
			this.txtDatedebut.setText("");
			this.txtDatefin.setText("");
			this.txtNettoyage.setText("");
			this.txtProprietaire.setText("");
			this.txtSurface.setText("");
			this.txtPrix.setText("");
		}
		
		{
			Logement unLogement = new Logement (
					this.txtIdservice.getText(), this.txtAdresse.getText(), this.txtDatedebut.getText(), 
					this.txtDatefin.getText(), this.txtNettoyage.getText(),this.txtProprietaire.getText(),
					this.txtSurface.getText(), this.txtPrix.getText(),
					);
			
			Corsair.insertLogement(unLogement);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtIdservice.getText(), this.txtAdresse.getText(), this.txtDatedebut.getText(), 
					this.txtDatefin.getText(), this.txtNettoyage.getText(),this.txtProprietaire.getText(),
					this.txtSurface.getText(), this.txtPrix.getText()};
			
			Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtIdClient.setText("");
			this.txtNom.setText("");
			this.txtPrenom.setText("");
			this.txtAdresse.setText("");
			this.txtEmail.setText("");
			this.txtNumero_passeport.setText("");
			this.txtTel.setText("");
			this.txtMdp.setText("");
			this.txtAge.setText("");
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
				this.txtIdClient.setText("");
				this.txtNom.setText("");
				this.txtPrenom.setText("");
				this.txtAdresse.setText("");
				this.txtEmail.setText("");
				this.txtNumero_passeport.setText("");
				this.txtTel.setText("");
				this.txtMdp.setText("");
				this.txtAge.setText("");
			}
			
			{
				Client unClient = new Client (
						this.txtIdClient.getText(), this.txtNom.getText(), this.txtPrenom.getText(), 
						this.txtAdresse.getText(), this.txtEmail.getText(),this.txtNumero_passeport.getText(),
						this.txtTel.getText(), this.txtMdp.getText(), this.txtAge.getText()
						);
				
				Corsair.insertClient(unClient);
				JOptionPane.showMessageDialog(this,"Insertion réussie");
				//mise à jouer de la JTable via le Tableau
				
				Object [] ligne = {this.txtIdClient.getText(), this.txtNom.getText(), this.txtPrenom.getText(), 
						this.txtAdresse.getText(), this.txtEmail.getText(),this.txtNumero_passeport.getText(),
						this.txtTel.getText(), this.txtMdp.getText(), this.txtAge.getText()};
				
				Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
				
				/********************************************************************/
				this.txtIdClient.setText("");
				this.txtNom.setText("");
				this.txtPrenom.setText("");
				this.txtAdresse.setText("");
				this.txtEmail.setText("");
				this.txtNumero_passeport.setText("");
				this.txtTel.setText("");
				this.txtMdp.setText("");
				this.txtAge.setText("");
				this.setVisible(false);
			}
			{
				JOptionPane.showMessageDialog(this, "Attention aux mot de passe !");
				
			}
			
		}
	}
}