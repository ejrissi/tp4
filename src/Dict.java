public class Dict {

    private int nb_mot;
    private Mot_dict[] dict;
    private String nom;

    public Dict(int a, String n) {
        this.nom = n;
        this.nb_mot = 0;
        this.dict = new Mot_dict[a];
    }

    public void ajouter_mot(Mot_dict a) {
        if (nb_mot < dict.length) {
            dict[nb_mot] = a;
            nb_mot++;
            trie();
        } else {
            System.out.println("Le dictionnaire est plein.");
        }
    }

    
    public void trie() {
        for (int i = 0; i < nb_mot - 1; i++) {
            for (int j = i + 1; j < nb_mot; j++) {
                if (dict[i].getMot().compareTo(dict[j].getMot()) > 0) {
                    Mot_dict temp = dict[i];
                    dict[i] = dict[j];
                    dict[j] = temp;
                }
            }
        }
    }

    
    public void supprimer_mot(Mot_dict a) {
        for (int i = 0; i < nb_mot; i++) {
            if (dict[i].getMot().equals(a.getMot()) && dict[i].getDef().equals(a.getDef())) {
                for (int j = i; j < nb_mot - 1; j++) {
                    dict[j] = dict[j + 1];                 }
                dict[nb_mot - 1] = null; 
                nb_mot--;
                break;
            }
        }
    }

   
    public String Recherche_dicho(String a) {
        for (int i = 0; i < nb_mot; i++) {
            if (dict[i].getMot().equals(a)) {
                return dict[i].getDef();
            }
        }
        return "Mot non trouvé.";
    }

   
    public void lister_dict() {
        if (nb_mot == 0) {
            System.out.println("Le dictionnaire est vide.");
            return;
        }
        System.out.println("Nom du dictionnaire: " + this.nom);
        for (int i = 0; i < nb_mot; i++) {
            System.out.println("Mot: " + dict[i].getMot() + ", Définition: " + dict[i].getDef());
        }
    }

   
    public int Nombre_synonyme(Mot_dict mot) {
        int c = 0;
        for (int i = 0; i < nb_mot; i++) {
            if (mot.synonyme(dict[i].getMot())) {
                c++;
            }
        }
        return c;
    }
}
