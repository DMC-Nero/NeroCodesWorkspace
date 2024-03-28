package qedge_class;

public class EnumExample {

	public static void main(String[] args) {
		System.out.println(WeekDay.SUN);
		// while printing the enum constant, it prints the enum constant name, but not address.
		
		WeekDay dayOne = WeekDay.SUN;
		System.out.println(dayOne == WeekDay.SUN);
		
		System.out.println(dayOne == WeekDay.MON);
	}

}

enum WeekDay{
	SUN, MON, TUE, WED, THU, FRI, SAT;
}
