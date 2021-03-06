package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

import controleur.Corsair;
import controleur.User;

public class PanelProfil extends PanelCentral implements ActionListener 
{

	private JTextArea txtProfil = new JTextArea();
	private JPasswordField txtMdp = new JPasswordField();
	private JButton btChanger = new JButton("Changer de Mot de passe !");
	
	private User unUser;
	
	public PanelProfil(User unUser) {
		super(Color.gray);
		this.unUser = unUser;
		
		this.txtProfil.setBounds(100, 100, 200, 100); 
		this.txtProfil.setText("Nom User :" + unUser.getNom()
								+"\n Pr�nom user :" + unUser.getPrenom()
								+"\n Login de connexion : " + unUser.getLogin());
		this.add(this.txtProfil);
		this.txtMdp.setBounds(100, 240, 100, 40);
		this.add(this.txtMdp);
		this.btChanger.setBounds(200, 300, 160, 30);
		this.add(this.btChanger);
		
		this.btChanger.addActionListener(this);
		
		//ajout de l'image
		ImageIcon uneImage = new ImageIcon("src/images/"+this.unUser.getAvatar());
		JLabel monAvatar = new JLabel(uneImage);
		monAvatar.setBounds(100, 20, 100, 80);
		this.add(monAvatar);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btChanger)
		{
			this.unUser.setMdp(new String(this.txtMdp.getPassword()) );
			Corsair.updateUser(unUser);
			JOptionPane.showMessageDialog(this, "Modification effectu�e !");
		}
	}

	public void setVisible(boolean action) {
		// TODO Auto-generated method stub
		
	}

}
