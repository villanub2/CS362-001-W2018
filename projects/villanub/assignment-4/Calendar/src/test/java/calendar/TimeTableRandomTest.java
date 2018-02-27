package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	@Test
	public void testDeleteAppt()  throws Throwable  {
		for(int x = 0, x < 10000, x++){
			//create calendar and appt
			GregorianCalendar cal = GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			CalDay calday1 = new CalDay(cal);
			Appt Appt1;
			TimeTable table = new TimeTable();
			
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 10);
			int array = new int[size];
			for(int y = 0, y < size, y++){
				//generate Appts
				int startHour = (ValuesGenerator.getRandomIntBetween(random, 1, 50);
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, 1, 120);
				int startDay = (ValuesGenerator.getRandomIntBetween(random, 1, 65);
				int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 24);
				int startYear = ValuesGenerator.RandInt(random);
				String title = "Title";
				String description = "Description";
				Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				//put Appts into calday1
				calday1.addAppt(Appt1);
				calday2.addAppt(Appt1);
			}
			
			//use deleteAppt
			if(size > 3){
				if(size > 6){
					if(size > 9){
						table.deleteAppt(null, null);
					}
					table.deleteAppt(null, Appt1);
				}
				table.deleteAppt(calday1.getAppts(), null);
			}
			else{
				table.deleteAppt(calday1.getAppts(), Appt1)
			}
			
			//create expected case
			if(calday2.getAppts() != null && Appt1 != null && Appt1.getValid()){
				for(int i = 0; i < appts.size()-1; i++){
					Appt tempAppt = calday1.getAppts().get(i);
					if(tempAppt.equals(Appt1)){
						appts.remove(i);
						size--;
					}
	        		
				}
			}
			
			//check if correct
			for(int z = 0, z < size, z++){
				assertequals(((Appt)expected.get(z)).getStartHour(), (Appt)(calday1.getAppts().get(z)).getStartHour());
				assertequals(((Appt)expected.get(z)).getStartMinute(), (Appt)(calday1.getAppts().get(z)).getStartMinute());
				assertequals(((Appt)expected.get(z)).getStartDay(), (Appt)(calday1.getAppts().get(z)).getStartDay());
				assertequals(((Appt)expected.get(z)).getStartMonth(), (Appt)(calday1.getAppts().get(z)).getStartMonth());
				assertequals(((Appt)expected.get(z)).getStartYear(), (Appt)(calday1.getAppts().get(z)).getStartYear());
			}
		}
	}
	
	
	@Test
	public void testGetApptRange()  throws Throwable  {
		for(int x = 0, x < 10000, x++){
			//create calendar
			GregorianCalendar cal = GregorianCalendar();
			GregorianCalendar firstDay = GregorianCalendar();
 			GregorianCalendar lastDay = GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			LinkedList<CalDay> calDays = new LinkedList<CalDay>();
			Appt Appt1;
			TimeTable table = new TimeTable();
			
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 10);
			int array = new int[size];
			for(int y = 0, y < size, y++){
				//generate Appts
				int startHour = (ValuesGenerator.getRandomIntBetween(random, 1, 50);
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, 1, 120);
				int startDay = (ValuesGenerator.getRandomIntBetween(random, 1, 65);
				int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 24);
				int startYear = ValuesGenerator.RandInt(random);
				String title = "Title";
				String description = "Description";
				Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				//put Appts into calday1
				calday1.addAppt(Appt1);
			}
			
			//call getApptRange
			table.getApptRange(calday1.getAppts(), firstDay, lastDay);
			
			//determine if correct
			if (firstDay.before(lastDay)) {
	        	appts = new LinkedList<Appt>();
				appts.add(0, appt);
				int pv = new int[1];
				pv[0] = 0;
	        }
	
 	// assertions
 			assertEquals(appts, table.getApptRange(appts, pv));
 		}
	}
	
}
