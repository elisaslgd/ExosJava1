package demo;

public class Variables {
    public static void main(String[] args) {

        //Déclaration d'une variable

        // <type> <nom>;

        // int : entier sur 32 bits
        int age;

        // long : entier sur 64 bits
        long indice;

        float distance;

        double monnaie;

        boolean estVrai;

        char lettre;

        // Chaine de caractere
        // String n'est pas considere comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>;
        int jour = 5;

        // affectation
        age = 25;
        indice = 100_000_000;
        distance = 12.74f;
        monnaie = 15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "Toto";


        double resultat = age + monnaie;

        // println() permet d'afficher des enregistrement dans la console

        System.out.println(resultat);

        System.out.println(prenom + " a " + age + "ans.");

        System.out.println(indice);
        System.out.println(age);
        System.out.println(distance);
        System.out.println(monnaie);
        System.out.println(estVrai);
        System.out.println(lettre);
        System.out.println(prenom);

        // les types enumérés (enum)

        enum JourSemaine {

            LUNDI, MARDI, MERCREDI
        }

        JourSemaine today = JourSemaine.MARDI;

        System.out.println(today);




    }
}
