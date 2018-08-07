import java.util.Scanner;
import java.awt.*;
import java.io.*;

public class baby_names{

   public static void main(String[] args) throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      System.out.print("Type your name: ");
      String name = console.next();
      System.out.print("Are you M or F?");
      String gender = console.next();
      find(name, gender);
      
   }
   
   public static void find(String name, String gender) throws FileNotFoundException{
      Scanner scanner = new Scanner(new File("names.txt"));
      while (scanner.hasNext()){
         String next = scanner.next();
         String next2 = scanner.next();
         int n0 = Integer.parseInt(scanner.next());
         int n1 = Integer.parseInt(scanner.next());
         int n2 = Integer.parseInt(scanner.next());
         int n3 = Integer.parseInt(scanner.next());
         int n4 = Integer.parseInt(scanner.next());
         int n5 = Integer.parseInt(scanner.next());
         int n6 = Integer.parseInt(scanner.next());
         int n7 = Integer.parseInt(scanner.next());
         int n8 = Integer.parseInt(scanner.next());
         int n9 = Integer.parseInt(scanner.next());
         int n10 = Integer.parseInt(scanner.next());
         int n11 = Integer.parseInt(scanner.next());
         int n12 = Integer.parseInt(scanner.next());

         int[] nums = {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12};
         
         String nextline = scanner.nextLine();
         if((next.toUpperCase().equals(name.toUpperCase())) && (next2.contains(gender.toUpperCase()))){
            DrawingPanel panel = new DrawingPanel(780,560);
            Graphics g = panel.getGraphics();
            System.out.println(nums[1]);
            System.out.println(n0 + " " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12);
            int len = nums.length;
            System.out.println(len);
            
            for(int i = 0; i<len; i++){
               System.out.println(i);
               String year = Integer.toString(2010-(((len-i)-1)*10));
               double fl = i * 1.0;
               int xvalue = (int)(780 * (fl/(len)));
               
               
               g.drawLine(xvalue, 0, xvalue, 560);
               g.drawString(year, xvalue, 560);
               g.drawLine(0, 20, 780, 20);
               g.drawLine(0, 540, 780, 540);
               if(i == 0){
                  g.drawString(next + " " + next2 + " " + Integer.toString(nums[i]), 0, 25 + nums[0]);
               }else{
                  double fl2 = (i-1) * 1.0;
                  int lastx = (int)(780 * (fl2/(len)));
                  System.out.println(Integer.toString(lastx));
                  int lasty = (int)(25 + nums[i-1]);
                  if(i < len){
                     int currenty = 25 + nums[i];
                     g.drawLine(lastx, lasty, xvalue, currenty);
                     String info = next + " " + next2 + " " + Integer.toString(nums[i]);
                     g.drawString(info, xvalue, currenty);
                  }
                  
               }
               
               
            }

         }
         
      }
      
   }
   
   
   
   


}