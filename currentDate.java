import java.time.LocalDate;
import java.time.Period;

import org.apache.log4j.Logger;

import com.capgemini.utils.Logging;
import com.capgemini.utils.keyboard;


public class currentDate {
	
	

	public static void main(String[] args) {

			LocalDate date = keyboard.readDate ("Enter a date : ");	// Read date in DD/MM/YYYY format
			LocalDate now = LocalDate.now ();						// Get current date
			Logging.LOG.info (Period.between (now, date));			// Print duration
		}
		
	
		
		

	}


