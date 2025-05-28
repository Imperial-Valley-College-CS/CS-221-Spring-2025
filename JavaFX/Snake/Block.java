public class Block
{
   private double x, y;
   
   public Block( double x, double y )
   {
      this.x = x;
      this.y = y;
   }
   
   public void setX( int x )
   {
      this.x = x;
   }
   
   public void setY( int y )
   {
      this.y = y;
   }
   
   public double getX(){ return this.x; }
   public double getY(){ return this.y; }
}