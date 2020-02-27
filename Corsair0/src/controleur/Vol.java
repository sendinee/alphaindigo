package controleur;

public class Vol {
	private String idvol, nom, datedepart, heuredepart, datearrivee, heurearrivee, idaeroport, idavion, idaeroport_arriver; 
	
	public Vol(String idvol,String nom, String datedepart, String heuredepart, String datearrivee, String heurearrivee, String idaeroport, String idavion, String idaeroport_arriver) {
		this.idvol = idvol;
		this.nom = nom;
		this.datedepart = datedepart;
		this.heuredepart = heuredepart;
		this.datearrivee = datearrivee;
		this.heurearrivee = heurearrivee;
		this.idaeroport = idaeroport;
		this.idavion = idavion;
		this.idaeroport_arriver = idaeroport_arriver;
	}
	public String getIdvol() {
		return idvol;
	}
	public void setIdvol(String idvol) {
		this.idvol = idvol;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDatedepart() {
		return datedepart;
	}
	public void setDatedepart(String datedepart) {
		this.datedepart = datedepart;
	}
	public String getHeuredepart() {
		return heuredepart;
	}
	public void setHeuredeaprt(String heuredepart) {
		this.heuredepart = heuredepart;
	}
	public String getDatearrivee() {
		return datearrivee;
	}
	public void setDatearrivee(String datearrivee) {
		this.datearrivee = datearrivee;
	}
	public String getHeurearrivee() {
		return heurearrivee;
	}
	public void setHeurearrivee(String heurearrivee) {
		this.heurearrivee = heurearrivee;
	}
	public String getIdaeroprt() {
		return idaeroport;
	}
	public void setIdaeroport(String idaeroport) {
		this.idaeroport = idaeroport;
	}
	public String getIdavion() {
		return idavion;
	}
	public void setIdavion(String idavion) {
		this.idavion = idavion;
	}
	public String getIdaeroport_arriver() {
		return idaeroport_arriver;
	}
	public void setIdaeroport_arriver(String idaeroport_arriver) {
		this.idaeroport_arriver = idaeroport_arriver;
	}
	
}