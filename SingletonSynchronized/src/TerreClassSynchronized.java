

public class TerreClassSynchronized {
	
	int Population;
    int Age;	
    private static TerreClassSynchronized objet;
    
    private TerreClassSynchronized() {}
   
 
    public static synchronized TerreClassSynchronized getInstance() 
     {	                                          // cr�er un objet s'il n'est pas d�j� cr��
        if (objet == null) 
        {
            objet = new TerreClassSynchronized();
            System.out.println("un objet Terre est cr�e");
     } 
        else 
        {
            System.out.println("un objet Terre est d�ja instanci�");
         }	                                                            // renvoie l'objet singleton
        return objet;
    }
 
    public void getConnection() {
        System.out.println("Vous �tes maintenant connect� � la base de donn�es de La classe Terre.");
    }	
   
}



