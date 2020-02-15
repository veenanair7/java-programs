package anil0004_a02;

public class Clock {
         int hours;
         int minutes;
         int seconds;
	
		// TODO Auto-generated method stub
		public String timeInDay() {
			   if(hours < 12 )
			   {
						return "AM";
			   }
						else {
							return "PM"; 
						}
		// replace this line with your solution
		}/** Returns the number of Seconds in this Clock. *  
		@return  number of seconds */
		public int secInClock() {
			seconds = (hours*60*60)+(minutes*60)+seconds;
			return seconds;                           // replace this line with your solution
		}/** Checks whether the given clock is valid. * 
		 @return true if and only if "hours:minutes:seconds" constitute a valid clock. * */
		public static boolean isValidClock(int hours, int minutes, int seconds) 
		{
			 if ( hours < 12 && minutes <60 && seconds < 60 )
		      return true;
			 else
			
				 System.exit(0);
			 return false;// replace this line with your solution}
		}
		
		/** Constructs a clock with the given hours, minutes and seconds.  If the clockis *  
		 * not valid, the entire program will halt with an error message. *  
		 * @param hours is an hour, numbered in the range 0...23. *  
		 * @param minutes is between 1 and 60. *  @param seconds is between 1 and 60 */
		public Clock(int hours, int minutes, int seconds) 
		{
			this.hours=hours;
			this.minutes=minutes;
			this.seconds=seconds;
		}/** Constructs a Clock object corresponding to the given string. * 
		 @param s should be a string of the form "hours:minutes:seconds" 
		 where  * hours, minutes and seconds must be one or two digits. 
		 If s does not match  * these requirements or is not a valid clock, 
		 the program halts with an error * message. */
		public Clock(String s)
		{   
			if (!s.equals("[0-9][0-9]:[0-9][0-9]:[0-9][0-9]"))
			{
				this.hours   = Integer.parseInt(s.substring(0, 2));
		        this.minutes = Integer.parseInt(s.substring(3, 5));
		        this.seconds = Integer.parseInt(s.substring(6, 8));
			}else {
				System.out.println("This is not a valid clock");
			}
			
		}/** Returns a string representation of this clock in the form  
		* hours:minutes:seconds. The hours, minutes, and seconds are expressed in full *  
		* as integers; for example, 12:7:20 or 3:21:40. *  
		* @return a String representation of this clock. */
		public String toString() {
			
			return hours+":"+minutes+":"+seconds ;
		// replace this line with your solution
		}/** Returns true if this clock is equal to otherClock *  @return true if equal. */
		public boolean equals(Clock otherClock)
		{
		
			if (hours == otherClock.hours && minutes == otherClock.minutes && seconds == otherClock.seconds)
			{
		return true;
			}else
				return false;
		}	
//			return (hours == otherClock.hours && minutes == otherClock.minutes && seconds == otherClock.seconds);
//			
//		}
		
		  public boolean isBefore(Clock d) 
		{
			if(hours>d.hours) {
					return false;
				}else if(hours<d.hours) {
					return true;
				}else if(minutes>d.minutes) {
					return false;
				}else if(minutes <d.minutes) {
					return true;
				}else if(seconds>d.seconds) {
					return false;
				}else
					return true;
			  
//			  if(hours > d.hours && minutes >d.minutes && seconds >d.seconds)
//			  {
//				  return true;
//			  }else
//				  return false;
		}
			// replace this line with your solution
		
		
		 /** Determines whether this Clock is after the Clock d. *  @return true if and only if this Clock is after d. */
		public boolean isAfter(Clock d)
		{
			if(hours<d.hours) {
				return false;
			}else if(hours>d.hours) {
				return true;
			}else if(minutes<d.minutes) {
				return false;
			}else if(minutes >d.minutes) {
				return true;
			}else if(seconds<d.seconds) {
				return false;
			}else
				return true;
//			if(hours < d.hours && minutes <d.minutes && seconds <d.seconds)
//			  {
//				  return true;
//			  }else
//				  return false;
			}
						
					
			                        // replace this line with your solution
		/** Return the time elapsed between the two clocks in seconds. *  
		@return true if and only if the input hours is in the morning. */
		
		public static int timeElapsed(Clock firstClock, Clock secondClock) {
			            
			            int time=   firstClock.secInClock()- secondClock.secInClock();
			            return time;
			            
			            // replace this line with your solution
		}
		/** Convert the clock to the format for this clock to hours:minutes:seconds XX.
		 * Where the hours will be a number between 1.. 12 * and XX will be either "AM" or "PM" For example, *  
		 * if this Clock is 16:15:20 , the returned string will be 4:15:20 PM. and *  if this Clock is 00:15:20 , 
		 * the returned string will be 12:15:20 AM. *  @return the string representation of the Clock. */
		public String convertClock() 
		{
			if(hours>12)
			{
		     hours=hours-12;
		     return hours+":"+minutes+":"+seconds+" "+"PM";
			}
			 
			return hours+":"+minutes+":"+seconds+" "+"AM"; // replace this line with your solution
		}
		 
 public static void main (String[] args)
 {
	Clock c= new Clock(13,59,26);
	Clock c1= new Clock("01:50:19");
	System.out.println("Clock should be "+c.toString()+" "+ c1.toString());
	System.out.println("Testing time in day:"+c.timeInDay() );
	System.out.println("Time "+c.toString()+" is equal to  "+c1.toString() +"  "+c.equals(c1));
	System.out.println(c.toString()+ "  before "+ c1.toString() +" should be " + c.isBefore(c1));
	System.out.println(c.toString()+ "  after "+ c1.toString() +" should be " +c.isAfter(c1));
	
	
	System.out.println(c.toString()+" should be"+ " " +c.convertClock());
	System.out.println("sec clock: "+c1.secInClock());
	System.out.println("Time elapsed is:"+Clock.timeElapsed(c1, c));
//	
	//
	
	
 }
	
}

