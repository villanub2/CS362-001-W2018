package calendar;


import org.junit.Test;


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
		for(int x = 0, x < 10000, x++){
			//create calendar
			GregorianCalendar cal = GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			expected = new LinkedList<Appt>()
			
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 30);
			int array = new int[size];
			for(int y = 0, y < size, y++){
				//generate numbers
				int startHour = (ValuesGenerator.getRandomIntBetween(random, -50, 50);
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, -120, 120);
				int startDay = (ValuesGenerator.getRandomIntBetween(random, -65, 65);
				int startMonth = ValuesGenerator.getRandomIntBetween(random, -24, 24);
				int startYear = ValuesGenerator.RandInt(random);
				String title = "Title";
				String description = "Description";
				Appt Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				//create own expected values
				if (appt.getValid()) {
					for (int i = 0; i < getAppts().size(); i++) {
						if (((Appt)expected.get(i)).getStartHour() > Appt1.getStartHour()) {
							expected.add(i, Appt1);
							return;
						}
					}
					expected.add(Appt1);
				}
				
				//use addAppt
				calday1.addAppt(Appt1)
				
			}
			
			//see if setRecurDays works
			for(int z = 0, z < size, z++){
				assertequals(((Appt)expected.get(z)).getStartHour(), (Appt)(calday1.getAppts().get(z)).getStartHour());
				assertequals(((Appt)expected.get(z)).getStartMinute(), (Appt)(calday1.getAppts().get(z)).getStartMinute());
				assertequals(((Appt)expected.get(z)).getStartDay(), (Appt)(calday1.getAppts().get(z)).getStartDay());
				assertequals(((Appt)expected.get(z)).getStartMonth(), (Appt)(calday1.getAppts().get(z)).getStartMonth());
				assertequals(((Appt)expected.get(z)).getStartYear(), (Appt)(calday1.getAppts().get(z)).getStartYear());
			}
			
		}
	}

	
}
