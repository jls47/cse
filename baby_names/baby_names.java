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
         String nextline = scanner.nextLine();
         if((next.toUpperCase().equals(name.toUpperCase())) && (next2.contains(gender.toUpperCase()))){
            DrawingPanel panel = new DrawingPanel(780,560);
            Graphics g = panel.getGraphics();
            System.out.println(n0 + " " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12);
            
         }
         
      }
      
   }
   
   
   
   


}