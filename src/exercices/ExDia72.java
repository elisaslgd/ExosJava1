package exercices;

import java.util.Scanner;

public class ExDia72 {

  /*  1. Créer une variable jour de type entier
2. Affecter une valeur à la variable jour
3. Afficher le jour de la semaine en lettre en fonction du nombre
    passé
4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message
    d'erreur */

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Saisir un jour de la semaine  : ");
        int jour = scanner.nextInt();

        switch(jour){
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Non valide");
        }




    }
}
