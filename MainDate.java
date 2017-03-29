 /**
 * Write a description of class MainDate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainDate{

    public static void main(String args[])
    {
        Date today = new Date (29,03,2017);
        Date tomorrow = new Date (30,03,2017);
        System.out.println("isSameYear = " + today.isSameYear(tomorrow));
        System.out.println("isSameMonth = " + today.isSameMonth(tomorrow));
        System.out.println("isSameDay = " + today.isSameDay(tomorrow));
        System.out.println("isSame = " + today.isSame(tomorrow));
        System.out.println(today.toString());
    }

}