import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;

public class App extends Application
{
   Canvas canvas = new Canvas(Constants.WIDTH, Constants.HEIGHT);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);                 //is a Parent
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT);  //needs a Parent
   @Override
   public void start(Stage s)
   {
      gc.setFill(Constants.COLOR_APPLE);
      gc.fillRect(10,50,20,20);
      s.setScene(scene);      //stage needs a Scene
      s.show();
   }
}