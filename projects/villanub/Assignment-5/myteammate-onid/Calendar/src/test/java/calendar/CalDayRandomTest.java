package calendar;


import org.junit.Test;

import java.util.*;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */

	@Test
	public void testAddAppt()  throws Throwable  {
		for(int x = 0; x < 10000; x++){
			//create calendar
			GregorianCalendar cal = new GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			LinkedList expected = new LinkedList<Appt>();
			Appt Appt1 = new Appt(2, 2, 2, 2, 2002, "title", "description");

			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts

			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 30));
			int[] array = new int[size];
			for(int y = 0; y < size; y++){
				//generate numbers
				int startHour = (ValuesGenerator.getRandomIntBetween(random, -50, 50));
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, -120, 120));
				int startDay = (ValuesGenerator.getRandomIntBetween(random, -65, 65));
				int startMonth = (ValuesGenerator.getRandomIntBetween(random, -24, 24));
				int startYear = (ValuesGenerator.RandInt(random));
				String title = "Title";
				String description = "Description";
				Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				//create own expected values
				if (Appt1.getValid()) {
					for (int i = 0; i < expected.size(); i++) {
						if (((Appt)expected.get(i)).getStartHour() > Appt1.getStartHour()) {
							expected.add(i, Appt1);
							return;
							
						};
						expected.add(i, Appt1);
					};
					//expected.add(Appt1);
				};
				
				//use addAppt
				calday1.addAppt(Appt1);

				
			}
			
			//see if setRecurDays works

			for(int z = 0; z < size; z++){
				
				assertEquals(Appt1.getStartHour(), ((calday1.getAppts()).get(z)).getStartHour());
				assertEquals(Appt1.getStartMinute(), ((calday1.getAppts()).get(z)).getStartMinute());
				assertEquals(Appt1.getStartDay(), ((calday1.getAppts()).get(z)).getStartDay());
				assertEquals(Appt1.getStartMonth(), ((calday1.getAppts()).get(z)).getStartMonth());
				assertEquals(Appt1.getStartYear(), ((calday1.getAppts()).get(z)).getStartYear());
				
				
			//	assertEquals((expected.get(z)).getStartHour(), ((calday1.getAppts()).get(z)).getStartHour());
			//	assertEquals((expected.get(z)).getStartMinute(), ((calday1.getAppts()).get(z)).getStartMinute());
			//	assertEquals((expected.get(z)).getStartDay(), ((calday1.getAppts()).get(z)).getStartDay());
			//	assertEquals((expected.get(z)).getStartMonth(), ((calday1.getAppts()).get(z)).getStartMonth());
			//	assertEquals((expected.get(z)).getStartYear(), ((calday1.getAppts()).get(z)).getStartYear());

			}
			
		}
	}



	
}
