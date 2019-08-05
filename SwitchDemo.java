public class SwitchDemo {
	public static void main(String[] args) {
		int day = 4;
		String weekOfDay = "none";

		switch (day) {
			case 1:
				weekOfDay = "Monday";
				break;
			case 2:
				weekOfDay = "Tuesday";
				break;
			case 3:
				weekOfDay = "Wednesday";
				break;
			case 4:
				weekOfDay = "Thursday";
				break;
			case 5:
				weekOfDay = "Friday";
				break;
			case 6:
				weekOfDay = "Saturday";
				break;
			case 7:
				weekOfDay = "Sunday";
				break;
			default:
				System.out.println("Day is not between 1 and 7");
				break;
		}

		System.out.println("Week of day: " + weekOfDay);
	}
}