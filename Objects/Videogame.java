import java.util.GregorianCalendar;

public class Videogame
{
   private String title;
   private int sales;
   private GregorianCalendar releaseDate;
   
   public Videogame( String t, int s, String date )
   {
      this.title = t;
      this.sales = s;
      setReleaseDate(date);
   }
   
   private void setReleaseDate( String date )
   {
      String[] tokens = date.split("-");     //{"Nov", "18", "2011"}
      int day = Integer.parseInt(tokens[1]);
      int year = Integer.parseInt(tokens[2]);
      int month = 11;
      switch( tokens[0].toLowerCase() )
      {
         case "jan": month = 0; break;
         case "feb": month = 1; break;
         case "mar": month = 2; break;
         case "apr": month = 3; break;
      }
      this.releaseDate = new GregorianCalendar(month, day, year);
   }
}