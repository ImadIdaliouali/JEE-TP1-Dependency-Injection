package org.example.Presentation;

import org.example.Metier.MetierImpl;
import org.example.dao.DaoImpl;

public class PresentationStaticVersion {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
