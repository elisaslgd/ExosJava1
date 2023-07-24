package exercices;

import java.util.Scanner;

public class ExDia71 {

   /* 1. Créer une variable caractere
2. Affecter une valeur à la variable caractere
3. A l'aide des structures conditionnelles, déterminer si le caractère
    est une consonne ou une voyelle */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un caractère : ");
        char c = scanner.next().charAt(0);

        if (c =='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'){
            System.out.println("Le caractère saisi est une voyelle !");
        }
        else{
            System.out.println("Le caractère saisi est une consonne ! ");
        }

    }
}
