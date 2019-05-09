

public class Song
{
   public static void main(String[] args){
      first();
      second();
      third();
      fourth();
      fifth();
      sixth();
      seventh();
   }
   public static void endlines(){
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println("");
   }
   public static void first(){
      System.out.println("There was an old woman who swallowed a fly.");
      endlines();
   }
   public static void second(){
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      filler1();
      endlines();
   }
   public static void third(){
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      filler2();
      endlines();
   }
   public static void fourth(){
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      filler3();
      endlines();
   }
   public static void fifth(){
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      filler4();
      endlines();
   }
   public static void sixth(){
      System.out.println("There was an old woman who swallowed a stoat,");
      System.out.println("Imagine a vote to swallow a stoat!");
      filler5();
      endlines();
   }
   public static void seventh(){
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died, of course.");
   }
   public static void filler1(){
      System.out.println("She swallowed the spider to catch the fly,");
   }
   public static void filler2(){
      System.out.println("She swallowed the bird to catch the spider,");
      filler1();
   }
   public static void filler3(){
      System.out.println("She swallowed the cat to catch the bird,");
      filler2();
   }
   public static void filler4(){
      System.out.println("She swallowed the dog to catch the cat,");
      filler3();
   }
   public static void filler5(){
      System.out.println("She swallowed the stoat to catch the dog,");
      filler4();
   }
   
}