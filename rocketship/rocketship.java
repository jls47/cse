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
      //I need to remove spaces from the spaces variable in order to make it work.
      //The assignment prompt mentioned nested for loops; why?
      System.out.println(spaces + fslash + "**" + bslash);
   }
   
   
   }
   public static void body1(int i){
   
   }
   public static void body2(int i){
   
   }
   
}
