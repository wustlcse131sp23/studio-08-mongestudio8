package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Date {

	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString() {
		return month + " / " + day + " / "+ year;
	}

	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	Date today = new Date(04, 22, 2023);//"new" creates a new instance of an object
    	Date tomorrow = new Date(04, 23, 2023);
    	Date yesterday = new Date(04, 21, 2023);
    	Date alsoToday = new Date(04, 22, 2023);//is in list, wont be put in set
		System.out.println(today);// 04 / 22 / 2023
		
		List<Date> list = new LinkedList<>();
		list.add(today);
		list.add(tomorrow);
		list.add(yesterday);
		list.add(alsoToday);
		System.out.println(list);
		
		Set<Date> set = new HashSet<>();
		set.add(today);
		set.add(tomorrow);
		set.add(yesterday);
		set.add(alsoToday);
		System.out.println(set);
	}

}
