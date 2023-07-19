package exercices;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        /*1. Écrire un programme avec les variables suivantes : a, b
        2. Afficher la somme des carrés de ces deux nombres*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir a : ");
        double nombreA = scanner.nextInt();

        System.out.print("Saisir b : ");
        double nombreB = scanner.nextInt();

        double somme_carres;
        double somme_carres_bis;

        somme_carres = (nombreA * nombreA) + (nombreB * nombreB);

        somme_carres_bis = (Math.pow(nombreA,2)) + (Math.pow(nombreB,2));

        System.out.println("La somme des carrés de a et b est : " + somme_carres);
        System.out.println("La somme des carrés de a et b est : " + somme_carres_bis);



    }

}
