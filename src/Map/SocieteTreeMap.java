/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author amina.marai
 */
public class SocieteTreeMap implements InterfaceSociete{
    
    Map<Employe,Departement> map = new TreeMap<>(new ComparatorEmployeByName());

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
         Set<Map.Entry<Employe,Departement>> couples = map.entrySet();
        for (Map.Entry<Employe,Departement> couple : couples){
           System.out.println("employe "+couple.getKey().getNom()+ " travaille dans le dept "+ couple.getValue().getNomDept()); 
           
       }; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(map.keySet()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(map.values()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(map.values().equals(e)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return map.containsValue(e);//To change body of generated methods, choose Tools | Templates.
    }
    
}
