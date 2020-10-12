

public class Class_Client_double_checked_locking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 //illegal construct
	      //Compile Time Error: The constructor ClassTerre() is not visible
	      //ClassTerre object = new ClassTerre();

	      //Get the only object available
		Class_Terre_double_checked_locking object = Class_Terre_double_checked_locking.getInstance();

	      //show the message
	      object.showMessage();


	}

}
