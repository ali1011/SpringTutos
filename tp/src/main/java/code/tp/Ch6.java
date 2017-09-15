package code.tp;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Ch6 {

		public static void main(String[] args) {
		
			LocalDate da = LocalDate.of(1988, Month.SEPTEMBER, 8) ;
			LocalDate de = LocalDate.of(1981, Month.NOVEMBER, 11) ;
			Period p = Period.between(da, de);
			da = da.plus(29, ChronoUnit.YEARS) ;
			System.out.println(da);
					}
		
		
}
