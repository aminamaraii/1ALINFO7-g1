package tn.esprit.alternance;

public class Employe {
	 private int cin;
	    private int matricule;
	    private String nom , prenom;

	    public Employe() {
	    }

	    public Employe(int cin, int matricule, String nom, String prenom) {
	        this.cin = cin;
	        this.matricule = matricule;
	        this.nom = nom;
	        this.prenom = prenom;
	    }

	    public int getCin() {
	        return cin;
	    }

	    public void setCin(int cin) {
	        this.cin = cin;
	    }

	    public int getMatricule() {
	        return matricule;
	    }

	    public void setMatricule(int matricule) {
	        this.matricule = matricule;
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

	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + cin;
			result = prime * result + matricule;
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employe other = (Employe) obj;
			if (cin != other.cin)
				return false;
			if (matricule != other.matricule)
				return false;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (prenom == null) {
				if (other.prenom != null)
					return false;
			} else if (!prenom.equals(other.prenom))
				return false;
			return true;
		}

		@Override
	    public String toString() {
	        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
	    }
	    
	

}
