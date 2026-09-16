public class time{

	public static void main (String[] args) {
		
		//variable declarations
		int hour = 13;
		int minute = 11;
		int second = 39;
		int timePast= hour*60*60+ minute*60;
		int timeLeft= 60*60*24-timePast;
		double percent= timePast*100/60/60/24;
		
		//printing variables
		System.out.print("The current time is");
		System.out.print(": ");
		System.out.println(hour + ":" + minute + ":" + second);
		
		System.out.print("Number of seconds since midnight"+ ":");
		System.out.print(timePast+ second);
		System.out.println(" "+"seconds");
		
		System.out.print("Number of seconds remainding in the day"+ ":");
		System.out.println(timeLeft + " "+"seconds");
		
		System.out.print("Percentage of the day passed"+ ":");
		System.out.println(percent+ "%");
		
		System.out.print("Elapsed time"+ ":");
		System.out.println(timePast- (12*60*60+34*60+6) +" "+ "seconds");
	}
}
