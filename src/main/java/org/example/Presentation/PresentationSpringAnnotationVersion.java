package org.example.Presentation;

import org.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example")
public class PresentationSpringAnnotationVersion {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PresentationSpringAnnotationVersion.class);
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result = " + metier.calcul());
    }
}
