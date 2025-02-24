package org.example.Presentation;

import org.example.Metier.IMetier;
import org.example.dao.IDao;
import java.io.File;
import java.util.Scanner;

public class PesentationDynamicVersion {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));

            String daoClassName = scanner.nextLine();
            Class daoClass = Class.forName(daoClassName);
            IDao dao = (IDao) daoClass.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class metierClass = Class.forName(metierClassName);
            IMetier metier = (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);

            System.out.println(metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
