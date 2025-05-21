import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.animation.AnimationTimer;

public class App extends Application
{
   Canvas canvas = new Canvas(Constants.WIDTH, Constants.HEIGHT);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);                 //is a Parent
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT);  //needs a Parent
   Timer t = new Timer();
   int x = 0;
   int y = 50;
   
   @Override
   public void start(Stage s)
   {
      t.start();        //starts Timer (handle method is invoked on every frame)
      s.setScene(scene);      //stage needs a Scene
      s.show();
   }//end start
   
   public void drawSquare()
   {
      gc.setFill(Constants.COLOR_CANVAS);
      gc.fillRect(0,0, Constants.WIDTH, Constants.HEIGHT);
      
      gc.setFill(Constants.COLOR_APPLE);
      gc.fillRect(x,y,20,20);   
      x += 10; 
   }//end drawSquare
   
   class Timer extends AnimationTimer
   {
      @Override
      public void handle( long now )
      {
         drawSquare();
      }
   }//end Timer
   
}//end App