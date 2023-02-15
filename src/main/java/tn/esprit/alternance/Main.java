package tn.esprit.alternance;
public class Main {

    public static void main(String[] args) {

        Departement dept1 = new Departement(1, "departement 1");
        Departement dept2 = new Departement(2, "departement 2");
        Departement dept3 = new Departement(3, "departement 3");
        Departement dept4 = new Departement(4, "departement 4");

      
//>>>>>>> main
//=======
        System.out.println(dept1);
        System.out.println(dept2);
        System.out.println(dept3);
        System.out.println(dept4);
        // <<<<<<< HEAD

        System.out.println("*****************");

        Employe emp1 = new Employe(999, 000, "houwayda", "gouia");
        Employe emp2 = new Employe(888, 111, "nour", "bachchouch");
        Employe emp3 = new Employe(777, 222, "yasmine", "marzouk");
        Employe emp4 = new Employe(666, 333, "amina", "marai");
        Employe emp5 = new Employe(555, 444, "abdelhak", "amami");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        // =======

        // >>>>>>> main

        System.out.println("----------------- SocieteHashMap --------------------");
        SocieteHashMap shm = new SocieteHashMap();
        shm.ajouterEmployeDepartement(emp1, dept1);
        shm.ajouterEmployeDepartement(emp2, dept2);
        shm.ajouterEmployeDepartement(emp3, dept3);
        shm.ajouterEmployeDepartement(emp4, dept4);
        shm.afficherLesEmployesLeursDepartements();
        System.out.println("----------------- Liste departements --------------------");
        shm.afficherLesDepartements();
        System.out.println("---------------- Liste employes --------------------");
        shm.afficherLesEmployes();
        System.out.println("---------------- Afficher Departement d'un employe --------------------");
        shm.afficherDepartement(emp4);
        System.out.println("---------------- Rechercher Deparetment --------------------");
        System.out.println(shm.rechercherDepartement(dept4));
        System.out.println("---------------- Rechercher Departement d'un employe --------------------");
        System.out.println(shm.rechercherEmploye(emp5));
//>>>>>>> 31fc184e41e89d001f627c3a3b9a592ac8a880f1
    }

}
