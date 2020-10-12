
public class Class_Terre_double_checked_locking {

	 
	    private volatile static Class_Terre_double_checked_locking obj; 
	  
	    private Class_Terre_double_checked_locking() {} 
	  
	    public static Class_Terre_double_checked_locking getInstance() 
	    { 
	        if (obj == null) 
	        { 
	            // To make thread safe 
	            synchronized (Class_Terre_double_checked_locking.class) 
	            { 
	                // check again as multiple threads 
	                // can reach above step 
	                if (obj==null) 
	                    obj = new Class_Terre_double_checked_locking(); 
	            } 
	        } 
	        return obj; 
	    } 
	
    public void showMessage(){		   
    
    System.out.println(" un objet de La classe Terre a été créer avec la methode double checking locking !");
   
 }
}

