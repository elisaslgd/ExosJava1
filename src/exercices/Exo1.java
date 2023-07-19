package exercices;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {

        //exo1

        Scanner scanner = new Scanner (System.in);

        System.out.print("Saisir un prenom : ");
        String prenomUtilisateur = scanner.nextLine();

        System.out.print("Saisir un nom : ");
        String nomUtilisateur = scanner.nextLine();

        String str = String.format("Bonjour %s %s", prenomUtilisateur, nomUtilisateur.toUpperCase());
        System.out.println(str);
        //System.out.println("Bonjour" + " " + prenomUtilisateur + " " + nomUtilisateur.toUpperCase());

    }
}