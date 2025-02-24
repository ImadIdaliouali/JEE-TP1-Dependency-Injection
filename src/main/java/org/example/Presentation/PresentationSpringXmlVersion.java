package org.example.Presentation;

import org.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXmlVersion {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
