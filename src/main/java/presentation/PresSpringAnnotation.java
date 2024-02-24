package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public abstract class PresSpringAnnotation implements IMetier {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resultat = "+ metier.calcul());
    }

}
