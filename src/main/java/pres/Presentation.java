package pres;

import Metier.MetierImpl;
import dao.DaoImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args) {
        /*
        l'injection des dépendances :
            a. Par instanciation statique
         */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat = "+metier.calcul());
        System.out.println("-------------------------------------------");
        DaoImpl2 dao2 = new DaoImpl2();
        metier.setDao(dao2);
        System.out.println("Résultat = "+metier.calcul());

    }
}
