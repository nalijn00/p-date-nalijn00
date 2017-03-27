package es.unileon.prg;
public class Date{	
	
	class Date{
	public static void main(Strings args []){
	Date date=new date(27,03,2017);
	System.out.println(date.isSameYear(2017));
	Date anotherDate=new date(01,01,1970);
	System.out.println(date.isSameYear(anotherDate));
	}
	}

private int day;
private int month;
private int year;

public Date(int day, int month, int year){
this.day=day;
this.month=month;
this.year=year;

	public int getDay(){
		return _day;
	}
	public int getMonth(){
		return _month;
	}	public int getYear(){
		return _year;
	}

	boolean isSameDay(Date another){
		
		if (this.day==another.getDay){
		return true;
		
		}else{
		return false;
		}
	}
}
}
