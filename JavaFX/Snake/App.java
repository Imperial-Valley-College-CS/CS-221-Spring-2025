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
      gc.fillRect(x,y,20,20);   
      switch(direction)
      {
         case "RIGHT": x+=10; break;
         case "LEFT": x-=10; break;
         case "UP": y-=10; break;
         case "DOWN": y+=10;
      } 
   }//end drawSquare
   
   class Timer extends AnimationTimer
   {
      @Override
      public void handle( long now )
      {
         drawSquare();
      }
   }//end Timer
   
   class HandleKey implements EventHandler<KeyEvent>
   {
      @Override
      public void handle( KeyEvent event )
      {
         System.out.println( direction );
         direction = event.getCode().toString();
      }
   }//end HandleKey
   
}//end App