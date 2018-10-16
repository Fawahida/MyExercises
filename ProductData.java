import java.text.DateFormat;
import java.time.LocalDate;

import com.capgemini.utils.Logging;
import com.capgemini.utils.keyboard;


public class ProductData {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate purchaseDate = keyboard.readDate ("Enter purchase date : ");					// Get purchase date in DD/MM/YYYY format
		int warranty [] = ProductData.readWarranty ("Enter warranty : ");						// Get warranty period
		
		LocalDate expiry = purchaseDate.plusYears (warranty [0]).plusMonths (warranty [1]);		// Calculate expire date
		Logging.LOG.info ("Expiry date : " + expiry);											// Print result
	}
	
	private static int [] readWarranty (String prompt)
	{
		String input = keyboard.readString (prompt + "[years months] ");	// Get date input as string
		String warranty [] = input.split (" ");								//Split based on blank space
		
		int years = 0;
		int months = 0;
		
		try
		{
			// Try convert years and months to int
			years = Integer.parseInt (warranty [0]);
			months = Integer.parseInt (warranty [1]);
		}
		catch (NumberFormatException nfe)
		{
			// If converstion fails report error and request input again
			Logging.LOG.error ("*** Invalid warranty format ***");
			return readWarranty (prompt);
		}
		
		return new int [] {years, months};
	}
				

	}


