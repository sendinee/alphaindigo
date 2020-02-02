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


public class PanelLocation extends PanelCentral implements ActionListener {
	
	/*Ajouter*/
	private JTextField txtimmatriculation = new JTextField();
	private JTextField txtadresse = new JTextField();
	private JTextField txtdatedebut = new JTextField();
	private JTextField txtdatefin = new JTextField();
	private JTextField txtprix = new JTextField();
	private JTextField txtidservice = new JTextField();
	
	private JButton btEnregistrer = new JButton("Enregistrer");
	private JButton btAnnuler = new JButton("Annuler");
	
	public PanelLocation() {
		super(Color.red);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Immatriculation : "));
		this.add(this.txtimmatriculation);
		
		this.add(new JLabel("Adresse : "));
		this.add(this.txtadresse);
		
		this.add(new JLabel("Date Debut: "));
		this.add(this.txtdatedebut);
		
		this.add(new JLabel("Date de Fin : "));
		this.add(this.txtdatefin);

		this.add(new JLabel("Prix : "));
		this.add(this.txtprix);
		
		this.add(new JLabel("IdService : "));
		this.add(this.txtidservice);

		
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtimmatriculation.setText("");
			this.txtadresse.setText("");
			this.txtdatedebut.setText("");
			this.txtdatefin.setText("");
			this.txtprix.setText("");
			this.txtidservice.setText("");
		}
		
		{
			Location unLocation = new Location (
					this.txtimmatriculation.getText(), this.txtadresse.getText(), this.txtdatedebut.getText(), 
					this.txtdatefin.getText(),  this.txtprix.getText(),this.txtidservice.getText()
					);
			
			Corsair.insertLocation(unLocation);
			JOptionPane.showMessageDialog(this,"Insertion réussie");
			//mise à jouer de la JTable via le Tableau
			
			Object [] ligne = {this.txtimmatriculation.getText(), this.txtadresse.getText(), this.txtdatedebut.getText(), 
					this.txtdatefin.getText(),  this.txtprix.getText(),this.txtidservice.getText()};
			
			Generale.getUnLister().getTableau().ajouterLigne(ligne);
			
			/********************************************************************/
			this.txtimmatriculation.setText("");
			this.txtadresse.setText("");
			this.txtdatedebut.setText("");
			this.txtdatefin.setText("");
			this.txtprix.setText("");
			this.txtidservice.setText("");
			this.setVisible(false);
		}
	}

	
	/*Lister*/
	private JTable uneTable ;
	private Tableau unTableau ;
	
	public void Lister() extends PanelCentral {
		super(Color.green);
		
		String entetes [] = {"idservice","adresse","datedebut","datefin","nettoyage","proprietaire","surface","prix"}; 
		
		//instancier le tableau
		this.unTableau = new Tableau(entetes, Corsair.getDonnees(Corsair.selectAllLocations()));
				
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

	public void setVisible(boolean action) {
		// TODO Auto-generated method stub
		
	}

	public void actualise() {
		// TODO Auto-generated method stub
		
	}

}







