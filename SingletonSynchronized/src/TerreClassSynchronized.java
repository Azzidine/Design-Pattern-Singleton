

public class TerreClassSynchronized {
	
	int Population;
    int Age;	
    private static TerreClassSynchronized objet;
    
    private TerreClassSynchronized() {}
   
 
    public static synchronized TerreClassSynchronized getInstance() 
     {	                                          // créer un objet s'il n'est pas déjà créé
        if (objet == null) 
        {
            objet = new TerreClassSynchronized();
            System.out.println("un objet Terre est crée");
     } 
        else 
        {
            System.out.println("un objet Terre est déja instancié");
         }	                                                            // renvoie l'objet singleton
        return objet;
    }
 
    public void getConnection() {
        System.out.println("Vous êtes maintenant connecté à la base de données de La classe Terre.");
    }	
   
}



