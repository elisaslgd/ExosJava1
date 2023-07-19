package exercices;

import java.util.Scanner;

import static java.lang.Math.round;

public class Exo5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Saisir un rayon : ");
        double rayon = scanner.nextDouble();

        System.out.print("Saisir une hauteur : ");
        double hauteur = scanner.nextDouble();

        double volume = (Math.PI * Math.pow(rayon,2) * hauteur/3);

        System.out.printf("Le volume du cône est de %.2f cm3.", volume);

    }
}
