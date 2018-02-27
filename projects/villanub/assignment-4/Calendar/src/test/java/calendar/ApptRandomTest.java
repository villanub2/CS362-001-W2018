package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
   /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}				
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }
	 
	 

	@Test
	public void testIsValid()  throws Throwable  {
		for(int x = 0, x < 10000, x++){
			boolean expected;
			//Set up random numbers
			int NumDaysInMonth= CalendarUtil.NumDaysInMonth(startYear,startMonth-1);
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			//Determine random numbers
			int startHour = (ValuesGenerator.getRandomIntBetween(random, -50, 50);
			int startMinute = (ValuesGenerator.getRandomIntBetween(random, -120, 120);
			int startDay = (ValuesGenerator.getRandomIntBetween(random, -65, 65);
			int startMonth = ValuesGenerator.getRandomIntBetween(random, -24, 24);
			int startYear = ValuesGenerator.RandInt(random);
 			String title = "Title";
 			String description = "Description";
			//generate Appt class based on values
			Appt Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
			//determine if it would be accepted or not
			if(startHour < 0 || startHour > 23){
				expected = false;
			}
			else{
				if(startMinute < 0 || startMinute > 59){
					Expected = false;
				}
				else{
					if(startDay < 1 || startDay > NumDaysInMonth){
						expected = false;
					}
					else{
						if(startMonth < 1 || startMonth > 12){
							expected = false;
						}
						else{
							expected = true;
						}
					}
				}
			}
			//test is valid function
			assertequals(expected, Appt1.getValid());
		}
	}
	
	
	@Test
	public void testIsValid()  throws Throwable  {
		for(int x = 0, x < 10000, x++){
			//Set up random numbers
			long randomseed =System.currentTimeMillis(); 
			Random random = new Random(randomseed);
			
			//set up random arrays
			int size = (ValuesGenerator.getRandomIntBetween(random, 0, 30);
			int array = new int[size];
			for(int y = 0, y < size, y++){
				int num = (ValuesGenerator.getRandomIntBetween(random, 0, 30);
				array[y] = num;
			}
			
			//set up Appt class with setRecurrence
			int startHour=21;
 			int startMinute=30;
 			int startDay=15;
 			int startMonth=01;
 			int startYear=2018;
 			String title = "Title";
 			String description = "Description";
			Appt Appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
			Appt1.setRecurrence(array, 2, 2, 2);
			
			//see if setRecurDays works
			if(size == 0){
				assertequals(0, (Appt1.getRecurDays())[0]);
			}
			else{
				for(int z = 0, z < size, z++){
					assertequals(array[z], (Appt1.getRecurDays())[z]);
				}
				
			}
		}
	}
	
}
