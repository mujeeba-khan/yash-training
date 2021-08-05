package com.yash.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * demonstrating Java7 and Java8 date and time APIs
 * */

public class DateTimeAPI {

	public static void main(String[] args) 
	{
		
		//functions of Java7 date ant time api
		
		Date date = new Date();
		
		System.out.println("Current date and time: "
				+date.toString()); // displaying current date and time
		
		date.setTime(34000); // setting millisec
		  
        System.out.println("\nTime after setting:  " + date.toString());
        
        Date d1 = new Date(2010, 12, 10);
        Date d2 = new Date(1998, 02, 12);
        
        boolean a = d1.after(d2);
        //checks whether the d1 is after d2 or not
        System.out.println("\nd1 is after d2 : " + a);
        
        boolean b = d1.before(d2);
        //checks whether the d1 is before d2 or not
        System.out.println("d1 is before d2 : " + b);
        
        
        //functions of Java8 date and time api
        
        System.out.println("\n");
        LocalDate today = LocalDate.now(); // today's date
        LocalDate tomorrow = LocalDate.now().plusDays(1); // today's date + 1 day
        
        System.out.println("Today's date "+today);
        System.out.println("Tomorrow's date "+tomorrow);
        
        
        //getting day of the week of that particular date
        DayOfWeek day = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("\nday of week "+day);

        //getting month number of that particular date 
        int date1 = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("month "+date1);
        
        //checking whether year in a particular date is a leap year or not
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("\nYear in current date is a leap year "+leapYear);
        
        //representing time in diff ways
        LocalTime t1 = LocalTime.parse("06:30");
        LocalTime t2 = LocalTime.of(6, 30);
        System.out.println("\nTime "+t1+"\n"+t2);
        
        //adding 1 hour to the given time
        LocalTime t3 = LocalTime.parse("07:10").plus(1, ChronoUnit.HOURS);
        System.out.println("\nTime after 1 hour "+t3);
        
        //extracting hour from the given time
        int hr = LocalTime.parse("10:05").getHour();
        System.out.println("\nHour from time "+hr);
        
        //local date and time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("\nCurrent date and time: "+dt);
        
        //adding a day 
        System.out.println("\nAdding a day to current day: "+dt.plusDays(1));
        
        //subtracting 2 hrs
        System.out.println("\nSubtracting 2 hours from current time: "+dt.minusHours(2));
        
        //getting zone id of particular zone
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        
        ZonedDateTime zonedDT = ZonedDateTime.of(dt, zoneId);
        System.out.println("\nZoned date and time of India "+zonedDT);
        
        //adding 5 days to date
        LocalDate initialDate = LocalDate.parse("2019-04-13");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("\nInitial date: "+initialDate
        		+"\nFinal date after adding 5 days: "+finalDate);
        
        //difference of days
        int days = Period.between(initialDate, finalDate).getDays();
        System.out.println("\nDays difference: "+days);
        
        
        
        /*
        Calendar calendar = new GregorianCalendar();

        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH); 
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);
        */
        
        
	}

}
