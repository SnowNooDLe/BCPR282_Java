package enumDemo;

public class EnumTest {
//	attribute
	Day day;
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad");
				break;
			case FRIDAY:
				System.out.println("Fridays are better");
				break;
			default:
				System.out.println("Midweek days are ok");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		
		EnumTest lastDay = new EnumTest(Day.FRIDAY);
		lastDay.tellItLikeItIs();

	}

}
