public class rocketship{
   public static void main(String[] args){
      rocket(3);
   }
   public static void rocket(int i){
      cone(i);
      line(i);
      body1(i);
      line(i);
      body2(i);
      line(i);
      cone(i);
   }
   
   public static void line(int i){
   	String line1 = "";
   	for(int x = 0; x <= i; x++){
   		line1 += "*=";
   	}
   	System.out.println("+" + line1 + "+");
   }
   
   public static void cone(int i){
   String fslash = "";
   String bslash = "";
   String spaces = "";
   
   for(int x = 0; x <= i; x++){
      fslash += "/";
      bslash += "\\";
      spaces = "";
      for(int y = (i-x-1); y >= 0; y--){
      	spaces += " ";
      }
      System.out.println(spaces + fslash + "**" + bslash);
   }
   
   
   }
   public static void body1(int i){
      String dots = "";
      String slashes = "";
      String dots1 = "";
      String slashes1 = "";
      for(int x = 0; x <= (i/2); x++){
         for(int y = (i/2)-1; y >= x; y--){
            dots += ".";
         }
         slashes += "/\\";
         System.out.println("|" + dots + slashes + dots + dots + slashes + dots + "|");
         dots = "";
      }
      dots = "";
      slashes = "";
      for(int x = ((i/2)+1); x <= i; x++){
         for(int y = x; y <= i; y++){
            slashes += "\\/";
         }
         System.out.println("|" + dots + slashes + dots + dots + slashes + dots + "|");
         dots += ".";
         slashes = "";
      }
   }
   public static void body2(int i){
      String dots = "";
      String slashes = "";
      String dots1 = "";
      String slashes1 = "";
      for(int x = 0; x <= (i/2); x++){
         for(int y = (i/2); y >= x; y--){
            slashes += "\\/";
         }
         System.out.println("|" + dots + slashes + dots + dots + slashes + dots + "|");
         dots += ".";
         slashes = "";
      }
      dots = "";
      slashes = "";
      for(int x = ((i/2)+1); x <= i; x++){
         for(int y = x+1; y <= i; y++){
            dots += ".";
         }
         slashes += "/\\";
         System.out.println("|" + dots + slashes + dots + dots + slashes + dots + "|");
         dots = "";
      }
      dots = "";
      slashes = "";
      
   }
}
   

