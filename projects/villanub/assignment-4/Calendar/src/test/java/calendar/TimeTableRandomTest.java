package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.lang.Object;
import java.util.LinkedList;
import java.util.*;

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
		for(int x = 0; x < 10000; x++){
			//create calendar and appt
			GregorianCalendar cal = new GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			CalDay calday2 = new CalDay(cal);
			Appt Appt1 = new Appt(2, 2, 2, 2, 2002, "title", "description");
			TimeTable table = new TimeTable();
			
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 10));
			int[] array = new int[size];
			for(int y = 0; y < size; y++){
				//generate Appts
				int startHour = (ValuesGenerator.getRandomIntBetween(random, 1, 50));
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, 1, 120));
				int startDay = (ValuesGenerator.getRandomIntBetween(random, 1, 65));
				int startMonth = (ValuesGenerator.getRandomIntBetween(random, 1, 24));
				int startYear = (ValuesGenerator.RandInt(random));
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
					};
					table.deleteAppt(null, Appt1);
				};
				table.deleteAppt(calday1.getAppts(), null);
			}
			else{
				table.deleteAppt(calday1.getAppts(), Appt1);
			};
			
			//create expected case
			if(calday2.getAppts() != null && Appt1 != null && Appt1.getValid()){
				for(int i = 0; i < calday2.getAppts().size()-1; i++){
					Appt tempAppt = calday1.getAppts().get(i);
					if(tempAppt.equals(Appt1)){
						calday2.getAppts().remove(i);
						size--;
					};
	        		
				};
			};
			
			//check if correct
			for(int z = 0; z < size; z++){
				assertEquals((calday2.getAppts().get(z)).getStartHour(), (calday1.getAppts().get(z)).getStartHour());
				assertEquals((calday2.getAppts().get(z)).getStartMinute(), (calday1.getAppts().get(z)).getStartMinute());
				assertEquals((calday2.getAppts().get(z)).getStartDay(), (calday1.getAppts().get(z)).getStartDay());
				assertEquals((calday2.getAppts().get(z)).getStartMonth(), (calday1.getAppts().get(z)).getStartMonth());
				assertEquals((calday2.getAppts().get(z)).getStartYear(), (calday1.getAppts().get(z)).getStartYear());
			};
		};
	};
	
	
	@Test
	public void testGetApptRange()  throws Throwable  {
		for(int x = 0; x < 10000; x++){
			//create calendar
			GregorianCalendar cal = new GregorianCalendar();
			GregorianCalendar firstDay = new GregorianCalendar();
 			GregorianCalendar lastDay = new GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			LinkedList<CalDay> calDays = new LinkedList<CalDay>();
			Appt Appt1 = new Appt(2, 2, 2, 2, 2002, "title", "description");
			TimeTable table = new TimeTable();
			
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//add random Appts
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 10));
			int[] array = new int[size];
			for(int y = 0; y < size; y++){
				//generate Appts
				int startHour = (ValuesGenerator.getRandomIntBetween(random, 1, 50));
				int startMinute = (ValuesGenerator.getRandomIntBetween(random, 1, 120));
				int startDay = (ValuesGenerator.getRandomIntBetween(random, 1, 65));
				int startMonth = (ValuesGenerator.getRandomIntBetween(random, 1, 24));
				int startYear = (ValuesGenerator.RandInt(random));
				String title = "Title";
				String description = "Description";
				Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				//put Appts into calday1
				calday1.addAppt(Appt1);
			};
			
			//call getApptRange
			table.getApptRange(calday1.getAppts(), firstDay, lastDay);
			
			LinkedList appts = new LinkedList<Appt>();
			int[] pv = new int[1];
			//determine if correct
			if (firstDay.before(lastDay)) {	
				appts.add(0, Appt1);
				pv[0] = 0;
	        };
	
 	// assertions
 			assertEquals(appts, table.getApptRange(appts, firstDay, lastDay));
 		};
	};
	
};
