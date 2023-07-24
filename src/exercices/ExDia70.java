package exercices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExDia70 {
  /*  1. Créer 3 variables : nombre1, nombre2, nombre3
2. Affecter des valeurs aux variables
3. Créer des structures conditionnelles permettant d'afficher le
    maximum parmis les 3 nombres créésprécédemment*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Saisir le nombre 1 : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Saisir le nombre 2 : ");
        int nombre2 = scanner.nextInt();

        System.out.print("Saisir le nombre 3 : ");
        int nombre3 = scanner.nextInt();


        if(nombre1>nombre2 && nombre1>nombre3){
        System.out.println("La valeur maximal est de : " + nombre1);
        }
        else if(nombre2>nombre1 && nombre2>nombre3){
            System.out.println("La valeur maximal est de : " + nombre2);
        }
        else{
            System.out.println("La valeur maxmal est de : " + nombre3);
        }




    }

}
