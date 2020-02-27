package controleur;

public class Client {
		private String idclient, nom, prenom, adresse, email, numero_passeport, tel, mdp, age; 
		
		public Client(String idclient,String nom, String prenom, String adresse, String email, String numero_passeport, String tel, String mdp, String age) {
			this.idclient = idclient;
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.email = email;
			this.numero_passeport = numero_passeport;
			this.tel = tel;
			this.mdp = mdp;
			this.age = age;
		}
		public String getIdclient() {
			return idclient;
		}
		public void setIdclient(String idclient) {
			this.idclient = idclient;
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
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNumero_passeport() {
			return numero_passeport;
		}
		public void setNumero_passeport(String numero_passeport) {
			this.numero_passeport = numero_passeport;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getMdp() {
			return mdp;
		}
		public void setMdp(String mdp) {
			this.mdp = mdp;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
}
