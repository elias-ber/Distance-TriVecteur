package Distance;

public class Main {

    public static void main(String[] args) {
    	// Déclaration des variables
    	int CompteurDepart, CompteurDestination, i, Echange, Distance, TailleVille,
    	TabDistance[][] = {{0, 996, 723, 890, 1286, 305, 564, 245, 1026, 884},
    					  {0, 0, 750, 104, 286, 711, 576, 747, 505, 543},
                          {0, 0, 0, 668, 979, 593, 224, 515, 524, 905},
                          {0, 0, 0, 0, 316, 607, 472, 645, 434, 467},
                          {0, 0, 0, 0, 0, 890, 769, 938, 750, 400},
                          {0, 0, 0, 0, 0, 0, 386, 106, 832, 559},
                          {0, 0, 0, 0, 0, 0, 0, 348, 447, 681},
                          {0, 0, 0, 0, 0, 0, 0, 0, 799, 665},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 901},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    	boolean Trouve;
    	String VilleDepart = null, VilleDestination = null, Recommencer,
    			TabVille[] = {"Brest", "Grenoble", "Lille", "Lyon", "Marseille", "Nantes", "Paris", "Rennes", "Strasbourg", "Toulouse"};
    	
    	do {
            	
           	VilleDepart = null;
           	VilleDestination = null;
            // Détermination de la taille du vecteur TabVille[]
            TailleVille = TabVille.length;

            // Recherche de la ville de départ
            Trouve = false;
            CompteurDepart = 0;
            while (!Trouve) {
                VilleDepart = Saisie.lire_String("Quelle est la ville de départ ? :");
                System.out.println();
                for (i = 0; i < TailleVille; i++) {
                    if (VilleDepart.equalsIgnoreCase(TabVille[i])) {
                        VilleDepart = TabVille[i];
                        CompteurDepart = i;
                        Trouve = true;
                    }
                }
                // Indique une erreur de saisie ou une donnée manquante à l'utilisateur
                if (!Trouve) {
                    System.out.println("Ville inconnue.");
                }
            }

            // Recherche de la ville de destination
            Trouve = false;
            CompteurDestination = 0;
            while (!Trouve) {
                VilleDestination = Saisie.lire_String("Quelle est la ville de destination ? :");
                System.out.println();
                for (i = 0; i < TailleVille; i++) {
                    if (VilleDestination.equalsIgnoreCase(TabVille[i])) {
                        VilleDestination = TabVille[i];
                        CompteurDestination = i;
                        Trouve = true;
                    }
                }
                // Indique une erreur de saisie ou une donnée manquante à l'utilisateur
                if (!Trouve) {
                    System.out.println("Ville inconnue.");
                }
            }

            /* Vérification de l'ordre des villes pour savoir comment traiter
               les données si la ville de départ se trouve après la ville de destination */
            if (CompteurDepart > CompteurDestination) {
                Echange = CompteurDepart;
                CompteurDepart = CompteurDestination;
                CompteurDestination = Echange;
            }

            // Récupération de la distance entre les deux villes
            Distance = TabDistance[CompteurDepart][CompteurDestination];

            // Affichage de la distance entre les deux villes
            System.out.println("La distance entre " + VilleDepart + " et " + VilleDestination + " est de : " + Distance + "km.");

            // Demander à l'utilisateur s'il souhaite recommencer
         	while((Recommencer.equalsIgnoreCase("OUI") == false) && (Recommencer.equalsIgnoreCase("NON") == false)) {
         		Recommencer = Saisie.lire_String("Voulez-vous recommencer le traitement ? (Oui/Non) :"); // Redemande la réponse aux joueurs
         		}

        } while (Relancer.toUpperCase().equals("OUI") == true);
		
		// Bas de page
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("					MERCI D'AVOIR JOUÉ");
    }
}
