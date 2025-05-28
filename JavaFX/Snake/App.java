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
   String direction = "RIGHT";
   String prevDir = direction;
   
   @Override
   public void start(Stage s)
   {
      createSnake();
      t.start();        //starts Timer (handle method is invoked on every frame)
      scene.setOnKeyPressed( keyHandler );      //makes keyboard come to life
      s.setScene(scene);      //stage needs a Scene
      s.show();
   }//end start
   
   public void createSnake()
   {
      int x = 50;
      int y = 50;
      int numBlocks = 20;
      int i = 0;
      while( i < numBlocks )
      {
         Constants.snake.add( new Block(x-i*Constants.SIZE,y) );     //head of snake - 0
         i++;
      }
   }
   
   public void drawSnake()
   {
      //paints entire Canvas black
      gc.setFill(Constants.COLOR_CANVAS);
      gc.fillRect(0,0, Constants.WIDTH, Constants.HEIGHT);
      
      gc.setFill(Constants.COLOR_APPLE);
      for( Block b : Constants.snake )
      {
         gc.fillRect(b.getX(), b.getY(),Constants.SIZE,Constants.SIZE);  
      }
       
      Block head = Constants.snake.get(0);
      double newX = head.getX();
      double newY = head.getY();
      switch(direction)
      {
         case "RIGHT": newX+=Constants.SPEED; break;
         case "LEFT": newX-=Constants.SPEED; break;
         case "UP": newY-=Constants.SPEED; break;
         case "DOWN": newY+=Constants.SPEED;
      } 
      Constants.snake.add(0,new Block( newX, newY ));       //add new head
      Constants.snake.remove( Constants.snake.size() - 1);  //remove tail
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
            drawSnake();
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