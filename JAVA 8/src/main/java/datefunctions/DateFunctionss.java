package datefunctions;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateFunctionss {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		
		LocalDateTime time=LocalDateTime.now();
		System.out.println(time.getMonth());
		
		LocalTime local=LocalTime.now();
		System.out.println(local.getMinute());
		
		String Date = "30-09-2004";
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-");
		LocalDate convertedDate= LocalDate.parse(Date, f);
		System.out.println(convertedDate);
		
		Period p=Period.between(date, convertedDate);
		Integer days=p.getDays();
		System.out.println(days);
		
		long exactDays= ChronoUnit.DAYS.between(date, convertedDate);
		System.out.println(exactDays);

	}

}
