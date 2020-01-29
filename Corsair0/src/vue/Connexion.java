package vue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Corsair;
import controleur.User;

public class Connexion extends JFrame implements ActionListener, KeyListener
{
	private JTextField txtLogin = new JTextField();
	private JPasswordField txtMdp = new JPasswordField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btSeConnecter = new JButton("Se Connecter");

	private JPanel unPanel = new JPanel();

	public Connexion()
	{
		this.setTitle("Connexion à l'application Cosair!");
		this.setResizable(false);
		this.setBounds(150, 150, 600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		this.unPanel.setLayout(new GridLayout(3,2));
		this.unPanel.setVisible(true);
		this.unPanel.setBounds(250, 50, 300, 150);

		this.unPanel.add(new JLabel("Login : "));
		this.unPanel.add(this.txtLogin);
		this.unPanel.add(new JLabel("Mot de passe :"));
		this.unPanel.add(this.txtMdp);
		this.unPanel.add(this.btAnnuler);
		this.unPanel.add(this.btSeConnecter);

		this.add(this.unPanel);
		//insertion d'une image 
		ImageIcon uneImage = new ImageIcon("src/images/..."); 
        JLabel monLogo = new JLabel(uneImage); //JLabel display an image or a text on the interface or both
        monLogo.setBounds(20,50,200,200);
        this.add(monLogo);

		this.setVisible(true);
		//lancement de l'appli Generale
		Corsair.instancierGenerale();
		Corsair.rendreVisibleGeneral(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btAnnuler) //get source
		{
			this.txtLogin.setText("");
			this.txtMdp.setText("");
		}
		else if (e.getSource() == this.btSeConnecter)
		{
			this.traitement();
		}
	}
	public void traitement() {
			String login = this.txtLogin.getText();
			String mdp = new String(this.txtMdp.getPassword());

			//instancier un user
			User unUser = Corsair.SelectWhereUser(login, mdp);
			if(unUser == null)
			{
				JOptionPane.showMessageDialog(this, "Veuillez vérifier vos identifiants");
			}
			else{
				JOptionPane.showMessageDialog(this, "Bienvenue"+ unUser.getNom() + "" + unUser.getPrenom());
				this.setVisible(false);
				//lancement de l'appli generale
				Corsair.instancierGeneral(unUser);
				Corsair.rendreVisibleGeneral(true);
			}
		
	}


	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			this.traitement();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void setVisible(boolean action) {
		// TODO Auto-generated method stub
		
	}
}





















