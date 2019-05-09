import java.awt.*;

public class cafewall{
   public static void main(String[] args){
      DrawingPanel panel = new DrawingPanel(650,400);
      Graphics g = panel.getGraphics();
      g.setColor(Color.GRAY);
      g.fillRect(0, 0, 650, 400);
      row(3, 20, 0, 0, g);
      row(4, 30, 50, 70, g);
      grid(4, 25, 10, 150, 0, g);
      grid(3, 25, 250, 200, 10, g);
      grid(5, 20, 425, 180, 10, g);
      grid(2, 35, 400, 20, 35, g);
   }
   public static void boxpair(int size, int xc, int yc, Graphics g){
      g.setColor(Color.BLACK);
      g.fillRect(xc, yc, size, size);
      g.setColor(Color.WHITE);
      g.fillRect(xc + size, yc, size, size);
   }
   public static void row(int pairs, int size, int xc, int yc, Graphics g){
      for(int x = 0; x <= pairs; x++){
         boxpair(size, xc + (2*x*size), yc, g);
      }
      
   }
   
   public static void grid(int pairs, int size, int xc, int yc, int offset, Graphics g){
      pairs = pairs - 1;

      int vertoff = 1;
      for(int x = 0; x <= pairs; x++){
         row(pairs, size, xc, yc + 2 * x * size + x * 4, g);
         row(pairs, size, xc + offset, yc + (1+x*2) * size + (1+x*2) * 2, g);
      }
   }

}