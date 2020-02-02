package controleur;

public class Location {
private String immatriculation, statut, datedebut, datefin, idservice;
private int n_parking, prix;
	
	public Location (String immatriculation, int prix, String datedebut, String datefin, String idservice, int n_parking, String statut) {
		this.immatriculation = immatriculation;
		
		this.statut = statut;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.idservice = idservice;
		this.n_parking = n_parking;
		this.prix = prix;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getIdservice() {
		return idservice;
	}
	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getN_parking() {
		return n_parking;
	}
	public void setn_parking(int n_parking) {
		this.n_parking = n_parking;
	}

}
