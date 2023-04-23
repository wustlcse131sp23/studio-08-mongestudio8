package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {

	private Set<Appointment> calendar;
	
	public Calendar() {
		this.calendar = new HashSet<>();
	}
	public void add(Appointment a) {
		this.calendar.add(a);
	}
	
	public static void main(String[] args) {

	}

}
