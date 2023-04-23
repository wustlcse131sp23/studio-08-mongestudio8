package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean twelveHrFormat;

	public Time(int hour, int min, boolean twelveHr) {
		this.hour = hour;
		this.minute = min;
		this.twelveHrFormat = twelveHr;
	}

	public String toString() {
		if (twelveHrFormat) {
			return this.hour % 12 + ":" + this.minute;
		} else {
			return this.hour + ":" + this.minute;
		}
	}

	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time twelve = new Time(13, 22, true);
		Time twentyFour = new Time(13, 22, false);
		System.out.println(twelve);// 1:22
		System.out.println(twentyFour);// 13:22
		System.out.println(twelve.equals(twentyFour));//true

	}

}