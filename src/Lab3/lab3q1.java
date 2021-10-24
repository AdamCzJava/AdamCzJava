package Lab3;

import java.util.Calendar;

public class lab3q1 {
	public static void main (String args[])
	{
	
		
	Calendar cal = Calendar.getInstance();
	Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
	long sec = System.currentTimeMillis() / 1000;
	long current = sec;
	int minute = t.getMinute() + 1;
	while(minute != t.getMinute())
	{
		current = System.currentTimeMillis() /1000;
		if(sec != current )
		{
			t.tick();
			System.out.println(t.getSecond());
			sec = current;
		}
	}
	
	}
}
