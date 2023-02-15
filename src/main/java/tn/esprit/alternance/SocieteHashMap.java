package tn.esprit.alternance;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SocieteHashMap implements InterfaceSociete {

    Map<Employe, Departement> mapEmpDept = new HashMap();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        mapEmpDept.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        mapEmpDept.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        /*mapEmpDept.entrySet().forEach((e) -> {
            Employe emp = e.getKey();
            Departement dep = e.getValue();
            System.out.println(emp + " " + dep);
        });
        ;*/
        /*Set<Employe> keys = mapEmpDept.keySet();
        
        keys.forEach((emp) -> {
            System.out.println("employe "+emp.getNom()+ "travaille dans le dept"+ mapEmpDept.get(emp).getNomDept());
        });*/
        Set<Map.Entry<Employe,Departement>> couples = mapEmpDept.entrySet();
        for (Map.Entry<Employe,Departement> couple : couples){
           System.out.println("employe "+couple.getKey().getNom()+ " travaille dans le dept "+ couple.getValue().getNomDept()); 
        }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(mapEmpDept.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(mapEmpDept.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(mapEmpDept.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return mapEmpDept.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return mapEmpDept.containsValue(e);
    }

}
