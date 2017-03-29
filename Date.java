
/**
 * Write a description of class Date here.
 * 
 * @author (Natalia Alija Novo) 
 * @version (a version number or a date)
 */
public class Date
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;
    /**
     * Constructor for objects of class Date
     */
    public Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

   public int getYear(){
       return this.year;
   }
   
   public int getMonth(){
       return this.month;
   }
   
   public int getDay(){
       return this.day;
   }
    
    public boolean isSameYear(Date another){
        if(getYear() == another.getYear()){
            return true;
        }
        else
        return false;
    }
    
    public boolean isSameMonth(Date another){
        if(getMonth() == another.getMonth()){
            return true;
        }
        else
        return false;
    }
    
    public boolean isSameDay(Date another){
        if(getDay() == another.getDay()){
            return true;
        }
        else
        return false;
    }
    
    public boolean isSame(Date another){
        if((getDay() == another.getDay()) && (getMonth() == another.getMonth()) && (getYear() == another.getYear())){
            return true;
        }
        else
        return false;
    }

    public String toString (int day, int month, int year)
    {
        return +this.day+ "/" +this.month+"/"+this.year;
    }
    
}
