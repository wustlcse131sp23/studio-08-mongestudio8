package studio8;

import java.util.Objects;

public class Appointment {

	private Time appointmentTime;
	private Date appointmentDate;
	
	
	public Appointment(Date d, Time t) {
		this.appointmentDate = d;
		this.appointmentTime = t;
	}
	
	public int hashCode() {
		return Objects.hash(appointmentDate, appointmentTime);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appointmentDate, other.appointmentDate)
				&& Objects.equals(appointmentTime, other.appointmentTime);
	}
	public String toString() {
		return "Appointment Date and Time: " + appointmentDate + ", " + appointmentTime;
	}
	public static void main(String[] args) {
		Date today = new Date(04, 22, 2023);
		Time now = new Time (19, 11, true);
		Appointment aNow = new Appointment(today, now);
		System.out.println(aNow);//Appointment Date and Time: 4/22/2023, 7:11
	}

}
