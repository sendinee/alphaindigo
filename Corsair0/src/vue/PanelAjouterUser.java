

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

public class PanelAjouterUser extends PanelCentral implements ActionListener {
	
	/*Client*/
	private JTextField txtIduser = new JTextField();
	private JTextField txtLogin = new JTextField();
	private JTextField txtMdp = new JTextField();

	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelAjouterUser() {
		super(Color.cyan);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Id User : "));
		this.add(this.txtIduser);
		
		this.add(new JLabel("Adresse : "));
		this.add(this.txtLogin);
		
		this.add(new JLabel("Mot de passe: "));
		this.add(this.txtMdp);
		
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtIduser.setText("");
			this.txtLogin.setText("");
			this.txtMdp.setText("");

		}
		
		{
			User unUser = new User (
					this.txtIduser.getText(), this.txtLogin.getText(), this.txtMdp.getText() 
);
			
			Corsair.insertUser(unUser);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtIduser.getText(), this.txtLogin.getText(), this.txtMdp.getText() 
};
			
			Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtIduser.setText("");
			this.txtLogin.setText("");
			this.txtMdp.setText("");

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
				this.txtIduser.setText("");
				this.txtLogin.setText("");
				this.txtMdp.setText("");

			}
			
			{
				User unUser = new User (
						this.txtIduser.getText(), this.txtLogin.getText(), this.txtMdp.getText() 
);
				
				Corsair.insertUser(unUser);
				JOptionPane.showMessageDialog(this,"Insertion réussie");
				//mise à jouer de la JTable via le Tableau
				
				Object [] ligne = {this.txtIduser.getText(), this.txtLogin.getText(), this.txtMdp.getText() 
};
				
				Generale.getUnPanelLister().getTableau().ajouterLigne(ligne);
				
				/********************************************************************/
				this.txtIduser.setText("");
				this.txtLogin.setText("");
				this.txtMdp.setText("");

				this.setVisible(false);
			}
			{
				JOptionPane.showMessageDialog(this, "Attention aux mot de passe !");
				
			}
			
		}
	}
