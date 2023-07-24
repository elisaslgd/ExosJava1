package exercices;

public class ExoDia80 {

    public static void main(String[] args) {

        /*1. Créer un programme permettant d'afficher les tables de
        multiplications de 1 à 10*/

        for(int i =1; i<11 ; i++){
            System.out.println("Table de "+i);
            for (int j = 1; j<11 ; j++){
                System.out.println(i+"x"+j+"="+ (i*j));
            }
        }

    }
}
