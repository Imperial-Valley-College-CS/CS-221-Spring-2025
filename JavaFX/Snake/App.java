import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;


public class App extends Application
{
   Canvas canvas = new Canvas(Constants.WIDTH, Constants.HEIGHT);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);                 //is a Parent
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT);  //needs a Parent
   Timer t = new Timer();
   HandleKey keyHandler = new HandleKey();
   int x = 0;
   int y = 50;
   String direction = "RIGHT";
   String prevDir = direction;
   
   @Override
   public void start(Stage s)
   {
      t.start();        //starts Timer (handle method is invoked on every frame)
      scene.setOnKeyPressed( keyHandler );      //makes keyboard come to life
      s.setScene(scene);      //stage needs a Scene
      s.show();
   }//end start
   
   public void drawSquare()
   {
      gc.setFill(Constants.COLOR_CANVAS);
      gc.fillRect(0,0, Constants.WIDTH, Constants.HEIGHT);
      
      gc.setFill(Constants.COLOR_APPLE);
      gc.fillRect(x,y,Constants.SIZE,Constants.SIZE);   
      switch(direction)
      {
         case "RIGHT": x+=Constants.SPEED; break;
         case "LEFT": x-=Constants.SPEED; break;
         case "UP": y-=Constants.SPEED; break;
         case "DOWN": y+=Constants.SPEED;
      } 
   }//end drawSquare
   
   class Timer extends AnimationTimer
   {
      private long last = 0;
      private double dt = 0.016;  //time between frames
      @Override
      public void handle( long now )
      {
         double timeLapse = (now - last)/(1000.0*1000.0*1000.0);
         if( timeLapse > 1*dt )
         {
            drawSquare();
            last = now;
         }
      }
   }//end Timer
   
   class HandleKey implements EventHandler<KeyEvent>
   {
      @Override
      public void handle( KeyEvent event )
      {
         prevDir = direction;    //previous direction equals current direction
         direction = event.getCode().toString();
         switch( direction )
         {
            case "UP": case "DOWN": case "LEFT": case "RIGHT": break;
            default:
               direction = prevDir;
         }
      }
   }//end HandleKey
   
}//end App