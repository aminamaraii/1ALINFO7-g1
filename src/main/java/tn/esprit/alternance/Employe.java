package tn.esprit.alternance;

import java.util.Objects;

public class Employe implements Comparable<Employe>{
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
	        int hash = 5;
	        hash = 53 * hash + this.cin;
	        hash = 53 * hash + this.matricule;
	        hash = 53 * hash + Objects.hashCode(this.nom);
	        hash = 53 * hash + Objects.hashCode(this.prenom);
	        return hash;
	    }

	   

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Employe other = (Employe) obj;
	        if (this.cin != other.cin) {
	            return false;
	        }
	        if (this.matricule != other.matricule) {
	            return false;
	        }
	        if (!Objects.equals(this.nom, other.nom)) {
	            return false;
	        }
	        if (!Objects.equals(this.prenom, other.prenom)) {
	            return false;
	        }
	        return true;
	    }

		@Override
	    public String toString() {
	        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
	    }

		public int compareTo(Employe o) {
			return this.cin-o.cin;
		}
	    
	

}
