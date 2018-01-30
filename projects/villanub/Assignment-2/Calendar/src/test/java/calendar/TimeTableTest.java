package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	// test getApptRange function
		public void test01()  throws Throwable  { 
			GregorianCalendar firstDay = GregorianCalendar();
			GregorianCalendar lastDay = GregorianCalendar();
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
			TimeTable table = new TimeTable();
			appts = new LinkedList<Appt>();
			appts.add(0, appt);
			
		  
	// assertions
			assertEquals(appts, table.getApptRange(appts, firstDay, lastDay));
		}
		
	@Test
	// test deleteAppt function
		public void test02()  throws Throwable  { 
			GregorianCalendar firstDay = GregorianCalendar();
			GregorianCalendar lastDay = GregorianCalendar();
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
			TimeTable table = new TimeTable();
			appts = new LinkedList<Appt>();
			appts.add(0, appt);
			
		  
	// assertions
			assertEquals(null, table.getApptRange(appts, Appt1));
		}
	
	@Test
	// test permute function
		public void test02()  throws Throwable  { 
			GregorianCalendar firstDay = GregorianCalendar();
			GregorianCalendar lastDay = GregorianCalendar();
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
			TimeTable table = new TimeTable();
			appts = new LinkedList<Appt>();
			appts.add(0, appt);
			int pv = new int[1]
			pv[0] = 0;
		  
	// assertions
			assertEquals(appts, table.getApptRange(appts, pv));
		}
}
