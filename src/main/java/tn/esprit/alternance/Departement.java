package tn.esprit.alternance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author amina.marai
 */
public class Departement {
    
    private int idDept;
    private String nomDept;

    public Departement() {
    }

    public Departement(int idDept, String nomDept) {
        this.idDept = idDept;
        this.nomDept = nomDept;
    }

    public int getIdDept() {
        return idDept;
    }

    public void setIdDept(int idDept) {
        this.idDept = idDept;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    @Override
    public String toString() {
        return "Departement{" + "idDept=" + idDept + ", nomDept=" + nomDept + '}';
    }

   
    
}
