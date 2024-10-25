public class Main {
    public static void main(String[] args) {

       
        Dict myDict = new Dict(5, "Mon Dictionnaire");

      
        Mot_dict mot1 = new Mot_dict();
        mot1.setMot("Pomme");
        mot1.setDef("Un fruit rond et sucré.");

        Mot_dict mot2 = new Mot_dict();
        mot2.setMot("Banane");
        mot2.setDef("Un fruit jaune et courbé.");

        Mot_dict mot3 = new Mot_dict();
        mot3.setMot("Cerise");
        mot3.setDef("Un petit fruit rouge.");

      

        
        myDict.ajouter_mot(mot1);
        myDict.ajouter_mot(mot2);
        myDict.ajouter_mot(mot3);
     

        
        myDict.lister_dict();

        
        System.out.println("\nRecherche du mot banane:");
        String definition = myDict.Recherche_dicho("Banane");
        System.out.println("Définition: " + definition);

       
        System.out.println("\nSuppression du mot cerise");
        myDict.supprimer_mot(mot3);

        

        myDict.lister_dict();
    }
}
