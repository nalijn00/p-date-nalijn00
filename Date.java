
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
    public Date(int Enero, int Febrero, int Marzo, int Abril, int Mayo, int Junio, int Julio, int Agosto, int Septiembre,int Octubre, int Noviembre, int Diciembre)
    {
        this.Enero=Enero;
        this.Febrero=Febrero;
        this.Marzo=Marzo;
        this.Abril=Abril;
        this.Mayo=Mayo;
        this.Junio=Junio;
        this.Julio=Julio;
        this.Agosto=Agosto;
        this.Septiembre=Septiembre;
        this.Octubre=Octubre;
        this.Noviembre=Noviembre;
        this.Diciembre=Diciembre;
        
    }
    public Date(int primavera, int verano, int otonyo, int invierno)
    {
        this.primavera=primavera;
        this.verano=verano;
        this.otonyo=otonyo;
        this.invierno=invierno;
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
    
    public boolean isSameYear(Date another){
        return getYear.equals(another.getYear);
    }
    
    public boolean isSameMonth(Date another){
        return getMonth.equals(another.getMonth);
    }
    
    public boolean isSameDay(Date another){
        return getDay.equals(another.getDay);
    } 
    
   
    
    
   
    public boolean printMonth(Date another){
        if (another.getMonth == 01){
               return Enero;
        }
        
        if (getMonth == 02){
               return Febrero;
        }
        
        if (getMonth == 03){
               return Marzo;
        }
        
        if (getMonth == 04){
               return Abril;
        }
        
        if (getMonth == 05){
               return Mayo;
        }
        
        if (getMonth == 06){
               return Junio;
        }
        
        if (getMonth == 07){
               return Julio;
        }
        
        if (getMonth == 8){
               return Agosto;
        }
        
        if (getMonth == 9){
               return Septiembre;
        }
        
        if (getMonth == 10){
               return Octubre;
        }
        
        if (getMonth == 11){
               return Noviembre;
        }
        
        if (getMonth == 12){
               return Diciembre;
        }
    }    
     
    public boolean getSeason(Date another){
        if((getMonth == 03) || (getMonth == 04) ||(getMonth == 05) ||(getMonth == 06)){
            return primavera;
        }
        if((getMonth == 07) || (getMonth == 8) ||(getMonth == 9)){
            return verano;
        }
        if((getMonth == 10) || (getMonth == 11) ||(getMonth == 12)){
            return otonyo;
        }
        if((getMonth == 01) || (getMonth == 02)){
            return invierno;
        }
    }
    
        

    public String toString(int day, int month, int year)
    {
        return +this.day+ "/" +this.month+"/"+this.year;
    }
    
}
