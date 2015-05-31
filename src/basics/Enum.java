package basics;


/*
 * All enums implicitly extend java.lang.Enum, so it can't extend anything else.
 * 
 * */
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}

enum Month {
	JAN(31),	//enum constant declared with values
	FEB(28),	// these constants must be declared before all fields and methods
	MAR(31);		//must end with a semicolon when enums have fields and/or methods
	
	public int days;
	
	//public Month(int days){	// error - modifier cant be public for enum
	//private Month(int days) {	//this is accepted
	Month(int days) {
		this.days = days;
	}
	
	public int getDays(){
		return days;
	}
}


public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day mon = Day.MONDAY;
		// every enum has a static values method which returns an array with all values in the order they are declared.
		Day[] days = Day.values();
		for(Day day : days){
			System.out.println(day);
		}
		
		
		Month j = Month.JAN;
		//Month f = new Month(28);	// error - cannot instantiate type Month
		System.out.println(j.getDays());

	}

}
