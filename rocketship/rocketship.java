public class rocketship{
   public static void main(String[] args){
      rocket(3);
   }
   public static void rocket(int i){
      cone(i);
      body1(i);
      body2(i);
      cone(i);
   }
   public static void cone(int i){
   String fslash = "";
   String bslash = "";
   String spaces = "";
   
   for(int x = 0; x <= i; x++){
      spaces += " ";
   }
   
   for(int x = 0; x <= i; x++){
      fslash += "/";
      bslash += "\\";
      //I need to remove spaces from the spaces variable in order to make it work.
      //The assignment prompt mentioned nested for loops; how do I get that going?
      System.out.println(spaces + fslash + "**" + bslash);
   }
   
   
   }
   public static void body1(int i){
   
   }
   public static void body2(int i){
   
   }
   
}
