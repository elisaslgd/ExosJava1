package exercices;

import java.util.Scanner;

public class ExoDia74 {

    public static void main(String[] args) {

       /* 1. Créer une variable annee de type entier
        2. Affecter une valeur à la variable annee
        3. Une année est bissextile si elle est divisible par 4 mais non divisible
        par 100.
        4. L'année est également bissextile si elle est divisible par 40 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir une année : ");
        int annee = scanner.nextInt();

        if((annee%4==0 && annee%100!=0) || (annee%400==0) ) {
            System.out.println("L'année saisie est une année bissextile");
        }else{
            System.out.println("L'année saisie n'est pas une année bissextile");
        }

    }
}
