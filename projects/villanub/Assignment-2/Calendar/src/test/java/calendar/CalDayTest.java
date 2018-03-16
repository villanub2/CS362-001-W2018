package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 /**
     * Test that the gets methods work as expected.
     */
	 @Test
	 //test constructors
		public void test01()  throws Throwable  {
			GregorianCalendar cal = GregorianCalendar();
			CalDay calday1 = new CalDay();
			CalDay calday2 = new CalDay(cal);
	// assertions
			assertEquals(cal.get(cal.DAY_OF_MONTH), calday2.getDay());
			assertEquals(cal.get(cal.MONTH), calday2.getMonth());
			assertEquals(cal.get(cal.YEAR), calday2.getYear());
			assertEquals(false, calday1.isValid());
			assertEquals(true, calday2.isValid());         		
	}
	 
	@Test
	// test addAppt function
		public void test02()  throws Throwable  { 
			GregorianCalendar cal = GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			int startHour=21;
			int startMinute=30;
			int startDay=15;
			int startMonth=01;
			int startYear=2018;
			String title="Birthday Party";
			String description="This is my birthday party.";
			//Construct a new Appointment object with the initial data	 
			Appt Appt1 = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			calday1.addAppt(Appt1);
			appts = new LinkedList<Appt>();
			appts.add(0, appt);
	// assertions
			assertEquals(appts, calday1.getAppts());
		}
		
	@Test
	// test toString function
		public void test03()  throws Throwable  { 
			GregorianCalendar cal = GregorianCalendar();
			CalDay calday1 = new CalDay(cal);
			int startHour=21;
			int startMinute=30;
			int startDay=15;
			int startMonth=01;
			int startYear=2018;
			String title="Birthday Party";
			String description="This is my birthday party.";
			//Construct a new Appointment object with the initial data	 
			Appt Appt1 = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			calday1.addAppt(Appt1);
	// assertions
			assertEquals("\t --- 01/15/2018 --- \n --- -------- Appointments ------------ --- \n 01/15/2018 at 9:30pm ,Birthday Party, This is my birthday party\n", calday1.toString())
		}
}
