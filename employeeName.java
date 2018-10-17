import com.capgemini.utils.Logging;
import com.capgemini.utils.keyboard;
import com.cg.eis.exception.BlankNameException;



public class employeeName {

	private static keyboard Keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Read user inputs
		String firstName = keyboard.readString ("First name : ");
		String lastName = keyboard.readString ("Last name : ");
		char gender = Character.toUpperCase (Keyboard.readChar ("Gender : "));
		int age = keyboard.readInt ("Age : ");
		double weight = keyboard.readDouble ("Weight : ");
		
		try
		{
			Logging.LOG.info (new person (firstName, lastName, gender, age, weight));
		}
		catch (BlankNameException e)
		{
			Logging.LOG.error (e.getMessage ());
		}

	}

}
