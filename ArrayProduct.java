import java.util.Arrays;

import com.capgemini.utils.Logging;
import com.capgemini.utils.keyboard;


public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String input = keyboard.readString ("Enter product names (separated by <space>) : ");	// Get product names
			String strArr [] = input.split (" ");													// Split by blank space
			
			Arrays.sort (strArr);	// Sort array
			
			Logging.LOG.info ("Result : " + Arrays.toString (strArr));	// Print result
			
			// Create strArr with size specified by user
			String strArr1 [] = new String [keyboard.readInt ("Enter number of products : ")];
			
			for (int i = 0; i < strArr1.length; ++ i)	// Get user inputs
				
				strArr1 [i] = keyboard.readString ("Enter product " + (i + 1) + " : ");
			
			Arrays.sort (strArr1);	// Sort array
			
			Logging.LOG.info ("Result : " + Arrays.toString (strArr1)); // Display result
	
	}

		

	}


