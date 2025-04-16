import javafx.scene.paint.Color;
import java.io.*;
import java.util.*;

public class Invader
{
   //data fields
   private int health, speedX, speedY;
   private Color color;       //need to import Color class
   private boolean isAlive;
   private boolean[][] body;
   private Position pos;
   private String filename;      //will likely delete
   
   //constructor
   public Invader(String type, double x, double y)
   {
      this.pos = new Position(x,y);
      this.body = new boolean[8][12];
      
      if( type.equals("squid") )
         this.filename = "InvaderMatrices/SquidMatrix.txt";
         
      setBody();
   }
   
   public void setBody()
   {
      try
      {
         File f = new File(this.filename);
         Scanner scan = new Scanner(f);
         int i = 0;
         
         while( scan.hasNextLine() )
         {
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            for( int j = 0; j < tokens.length; j++ )
            {
               if( tokens[j].equals("1") )
                  this.body[i][j] = true;
               else
                  this.body[i][j] = false;
            }
            i++;
         }
         for( boolean[] row : this.body )
            System.out.println( Arrays.toString( row ) );
      }catch( FileNotFoundException e )
      {
         System.out.println( e.getMessage() );
      }
   }
}