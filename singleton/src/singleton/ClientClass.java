package singleton;


public class ClientClass {
	

	public static void main(String[] args) {
		
		 //illegal construct
	      //Compile Time Error: The constructor ClassTerre() is not visible
	      //ClassTerre object = new ClassTerre();

	      //Get the only object available
		TerreClass object = TerreClass.getInstance();

	      //show the message
	      object.showMessage();
	}

}
