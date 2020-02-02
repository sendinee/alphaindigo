package controleur;

public class Logement {
	private String idservice,adresse,datedebut, datefin, nettoyage, proprietaire; 
	private int surface, prix;
	
	public Logement(String idservice, String adresse, String datedebut, String datefin, String nettoyage, String propritaire, String proprietaire, int prix, int surface) {
		this.idservice = idservice;
		this.adresse = adresse;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.nettoyage = nettoyage;
		this.proprietaire = proprietaire;
		this.surface = surface;
		this.prix = prix;
	}
	public String getIdservice() {
		return idservice;
	}
	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
	public String getNettoyage() {
		return nettoyage;
	}
	public void setNettoyage(String nettoyage) {
		this.nettoyage = nettoyage;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}

}
