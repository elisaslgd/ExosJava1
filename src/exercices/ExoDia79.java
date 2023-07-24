package exercices;

import java.util.Scanner;

public class ExoDia79 {

    public static void main(String[] args) {

        /*Exercice : Chapitres
        1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
        2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à
                afficher*/

        Scanner scanner = new Scanner (System.in);

        System.out.print("Saisir un nombre de chapitres : ");
        int chapitre = scanner.nextInt();
        System.out.print("Saisir un nombre de sous-partie : ");
        int sspartie = scanner.nextInt();

        for(int i = 1; i<=chapitre; i++){
            System.out.println("Chapitre "+i);
            for(int j = 1; j<=sspartie; j++){
                System.out.println("Sous-partie "+j);
            }
        }



    }
}
