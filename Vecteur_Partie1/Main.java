package Vecteur_Partie1;

public class Main {
    public static void main(String[] args) {
        int i, j, Vecteur[], plusPetit, Echange, N;
        
        Vecteur = new int[5];

        for (i=0; i<5; i++) {
        	Vecteur[i] = Saisie.lire_int("Saisissez la valeur de la case n°" + (i+1) + ".");
        }
        System.out.println();
        
        // Affichage du vecteur avant le tri
        System.out.println("Vecteur avant le tri : ");
        afficherVecteur(Vecteur);
        System.out.println();

        
        // Tri par sélection
        for (i = 0; i < 5-1; i++) {
            plusPetit = i;
            for (j = i + 1; j < 5; j++) {
                if (Vecteur[j] < Vecteur[plusPetit]) {
                    plusPetit = j;
                }
            }
            // Echange avec la plus petite variable
            Echange = Vecteur[plusPetit];
            Vecteur[plusPetit] = Vecteur[i];
            Vecteur[i] = Echange;

            // Affichage du vecteur à chaque étape du tri
            System.out.println("Étape " + (i+1) + " du tri : ");
            afficherVecteur(Vecteur);
        }

        // Affichage du vecteur après le tri
        System.out.println();
        System.out.println("Vecteur après le tri : ");
        afficherVecteur(Vecteur);
    }

    // Procédure d'affichage du vecteur pour être réutilisé
    public static void afficherVecteur(int[] vecteur) {
        for (int i = 0; i < 5; i++) {
            System.out.print(vecteur[i] + " ");
        }
        System.out.println();
    }
}
