

package com.capg.Lab6.exercise9;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date {
	


	

		public static void main(String[] args) {
			
			
			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(1965, Month.JULY, 15);

			Period p = Period.between(birthday, today);
			
			System.out.println( p.getYears() + " Years, " + p.getMonths() +
			                   " Months, and " + p.getDays() +
			                   " Days");

		}

	}



