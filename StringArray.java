import java.util.Arrays;

import com.capgemini.utils.Logging;
import com.capgemini.utils.keyboard;


public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = keyboard.readString ("Enter product names (separated by <space>) : ");	// Get product names
		String strArr [] = input.split (" ");													// Split by blank space
		
		Arrays.sort (strArr);	// Sort array
		
		Logging.LOG.info ("Result : " + Arrays.toString (strArr));	// Print result

	}

}
