package singleton;

public class TerreClass {

	
	   //create an object of TerreClass
	   private static TerreClass instance = new TerreClass();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private TerreClass(){}

	   //Get the only object available
	   public static TerreClass getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println(" un objet de La classe Terre a été créer !");
	   }
	}

