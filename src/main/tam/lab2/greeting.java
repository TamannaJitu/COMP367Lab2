package lab2;

import java.util.Calendar;

public class greeting {
	private String timeOfDay ;
	private final String GoodMorning = "Good Morning, Tamanna Jitu";
	private final String GoodAfternoon = "Good Afternoon, Tamanna Jitu";
	private final String GoodEvening = "Good Evening, Tamanna Jitu";

	public String getSetTimeOfDay() {
		
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour < 12)
		{
			timeOfDay  = GoodMorning;
		}
		else if (hour  < 18)
		{
			timeOfDay  = GoodAfternoon;
		}
		else {
			timeOfDay  = GoodEvening;
		}
		return timeOfDay ;
	}

	public String getTimeOfDay() {
		return timeOfDay ;
	}
}
