package controleur;

public class Client {
		private String idclient, nom, prenom, email; 
		private int numero_passeport, tel, mdp, age; 
		
		public Client(String idclient,String nom, String prenom, String email, int numero_passeport, int tel, int mdp, int age) {
			this.idclient = idclient;
			this.nom = nom;
			this.prenom = prenom;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getNumero_passeport() {
			return numero_passeport;
		}
		public void setNumero_passeport(int numero_passeport) {
			this.numero_passeport = numero_passeport;
		}
		public int getTel() {
			return tel;
		}
		public void setTel(int tel) {
			this.tel = tel;
		}
		public int getMdp() {
			return mdp;
		}
		public void setMdp(int mdp) {
			this.mdp = mdp;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		

}
