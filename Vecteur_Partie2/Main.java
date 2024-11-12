package Vecteur_Partie2;

public class Main {
    public static void main(String[] args) {
        
    	// Déclaration des variables
    	int N, i, Ech, Sauve, Tab[];

        // Saisie de la taille du tableau
        N = Saisie.lire_int("Quelle est la taille de votre tableau ?");
        Tab = new int[N]; // Instanciation du tableau à partir de 0

        // Remplissage du tableau à trier
        for (i = 0; i < N; i++) {
            Tab[i] = Saisie.lire_int("Veuillez saisir le contenu de la case de rang " + (i+1));
        }

        // Sauvegarde de la valeur de N pour la réutiliser après le tri
        Sauve = N;

        // Traitement
        while (N > 0) {
            i = 0;
            while (i < N - 1) {
                if (Tab[i] > Tab[i + 1]) {
                    Ech = Tab[i];
                    Tab[i] = Tab[i + 1];
                    Tab[i + 1] = Ech;
                }
                i++;
            }
            N--;
        }

        // Affichage du tableau trié
        for (i = 0; i < Sauve; i++) {
            System.out.print(Tab[i] + " ");
        }
    }
}
