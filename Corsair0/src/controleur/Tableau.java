package controleur;

import javax.swing.table.AbstractTableModel;

public class Tableau extends AbstractTableModel
{

	//un tableau est défini par une entete et une matrice de données
	private String entetes [];
	private Object donnees [][];
	
	public Tableau (String [] entetes, Object [][] donnees)
	{
		super();
		this.entetes = entetes;
		this.donnees = donnees;
	}
	
	@Override
	public int getColumnCount() {
		//retourner le nombre de colonnes
		return this.entetes.length;
	}

	@Override
	public int getRowCount() {
		//retourne le nombre de lignes
		return this.donnees.length;
	}

	@Override
	public Object getValueAt(int indiceLigne, int indiceColonne) {
		//retourne un element (valeur) qui se trouve sur le croissement de ligne/ colonne
		return this.donnees[indiceLigne][indiceColonne];
	}
	
	public void ajouterLigne(Object [] ligne)
	{
		//on ajoute une ligne à notre tableau donnees
		Object [][] matrice = new Object[this.donnees.length + 1] [this.entetes.length];
		for (int i=0 ; i<this.donnees.length ; i++)
		{
				matrice [i] = this.donnees[i];
		}
		matrice[this.donnees.length] = ligne;
		this.donnees = matrice ;
		//confirmer la mise à jour
		this.fireTableDataChanged();
	}
	
	public void supprimerLigne(int indiceLigne)
	{		
		Object [][] matrice = new Object[this.donnees.length - 1] [this.entetes.length];
		for (int i=0 ; i<this.donnees.length ; i++)
		{
			if (i != indiceLigne)
			{
				matrice [i] = this.donnees[i];
			}
		}
		this.donnees = matrice ;
		//confirmer la mise à jour
		this.fireTableDataChanged();
	}
}
