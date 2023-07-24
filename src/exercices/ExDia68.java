package exercices;

import java.util.Scanner;

public class ExDia68 {
    /*1. Créer une variable age

    2. Affecter une valeur à la variable age

    3. Créer une condition qui permet d'afficher si la personne est majeure ou mineure*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un âge : ");
        int age = scanner.nextInt();

        if(age>17){
            System.out.println("Vous êtes majeur et pouvez adhérer au club");
        }

        else{
            System.out.println("Vous êtes mineur, votre adhésion n'est pas possible!");
        }

    }
}
