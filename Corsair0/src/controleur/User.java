package controleur;

public class User {

	private int iduser; 
	private String nom, prenom, login, mdp, avatar;
	private Object user;
	
	public User(int iduser, String nom, String prenom, String login, String mdp, String avatar) {
		super();
		this.iduser = iduser;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.avatar = avatar;
	} 
	
	public User(String nom, String prenom, String login, String mdp, String avatar) {
		super();
		this.iduser = 0 ;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.avatar = avatar;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAvatar() {
		return avatar;
	}
	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	} 
	
	
	
}
