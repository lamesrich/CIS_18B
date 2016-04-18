
package hwk4main;


public class MyRectangle extends MyBounded
{
   public MyRectangle()
   {
         super();
   }
   
   public MyRectangle(int x1, int y1, int x2, int y2, boolean f)
   {
       super(x1, y1, x2, y2, f);
   }
   
   public void MyRectangle(int x1, int y1, int x2, int y2, Color c, boolean f)
   {
       super(x1, y1, x2, y2, c, f);
   }
   
   public void draw(Graphics g)
   {
       Color c = g.getColor();
       g.setColor(this.getColor());
       
       if(getFilled())
           g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth, getHeight());
           else
           g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth, getHeight());
           g.setColor(c);
   }
    
   public String toString()
   {
       return "Rectangle";
   }
   
}
