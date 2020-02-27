import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controleur.Client;
import controleur.Corsair;
import controleur.Location;
import vue.Generale;

public class PanelAjouterLocation extends PanelCentral implements ActionListener {
	
	/*Client*/
	private JTextField txtImmatriculation = new JTextField();
	private JTextField txtN_parking = new JTextField();
	private JTextField txtStatut = new JTextField();
	private JTextField txtDatedebut = new JTextField();
	private JTextField txtDatefin = new JTextField();
	private JTextField txtPrix = new JTextField();

	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelAjouterLocation() {
		super(Color.cyan);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Immatriculation : "));
		this.add(this.txtImmatriculation);
		
		this.add(new JLabel("Numero de parking : "));
		this.add(this.txtN_parking);
		
		this.add(new JLabel("Statut: "));
		this.add(this.txtStatut);
		
		this.add(new JLabel("Date de debut : "));
		this.add(this.txtDatedebut);

		this.add(new JLabel("Date de fin : "));
		this.add(this.txtDatefin);

		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtImmatriculation.setText("");
			this.txtN_parking.setText("");
			this.txtStatut.setText("");
			this.txtDatedebut.setText("");
			this.txtDatefin.setText("");
			this.txtPrix.setText("");

		}
		
		{
			Location unLocation = new Location (
					this.txtImmatriculation.getText(), this.txtN_parking.getText(), this.txtStatut.getText(), 
					this.txtDatedebut.getText(), this.txtDatefin.getText(),this.txtPrix.getText());

			
			Corsair.insertClient(unClient);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtImmatriculation.getText(), this.txtN_parking.getText(), this.txtStatut.getText(), 
					this.txtDatedebut.getText(), this.txtDatefin.getText(),this.txtPrix.getText()
};
			
			Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtImmatriculation.setText("");
			this.txtN_parking.setText("");
			this.txtStatut.setText("");
			this.txtDatedebut.setText("");
			this.txtDatefin.setText("");
			this.txtPrix.setText("");
			this.setVisible(false);
		}
		{
			JOptionPane.showMessageDialog(this, "Attention aux mot de passe !");
			
		}
		
	}
}	