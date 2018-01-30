package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	@Test
	// test constructors
	public void test01()  throws Throwable  {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
	// assertions
		assertTrue(appt.getValid());
		assertEquals(21, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(15, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());         		
	}
	 
	@Test
	// test setRecurrence and isRecurring function
		public void test02()  throws Throwable  { 
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
			int days = new int[2]
			days[0] = 1;
			days[1] = 2;
			int by = 2;
			int inc = 2;
			int numb = 2;
			Appt1.setRecurrence(days, by, inc, numb);
			boolean recur = Appt1.isRecurring();
	// assertions
			assertEquals(days, appt.getRecurDays());
			assertEquals(2, appt.getRecurBy());
			assertEquals(2, appt.getRecurIncrement());
			assertEquals(2, appt.getRecurNumber());
			assertEquals(true, recur());
	}
		
	@Test
	// test toString and representationApp function
		public void test03()  throws Throwable  { 
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
	// assertions
			assertEquals("\t01/15/2018 at 9:30pm ,Birthday Party, This is my birthday party\n", Appt1.toString())
		}
		
		@Test
	 // test compareTo function
		public void test04()  throws Throwable  { 
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
			//Construct a new Appointment object with the initial data	 
			Appt Appt2 = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			int num = Appt1.compareTo(Appt2);
	// assertions
			assertequals(0, num);
	 }

	
}
