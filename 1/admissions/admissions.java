import java.util.Scanner;

public class admissions{
   public static void main(String[] args){
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant.  For each candidate I will need");
      System.out.println("either SAT or ACT scores plus a weighted GPA.");
      System.out.println("");
      System.out.println("Information for applicant #1:");
      double score1 = test();
      System.out.println("Information for applicant #2:");
      double score2 = test();
      compare(score1, score2);
   }
   public static double test(){
      System.out.print("do you have 1) SAT scores or 2) ACT scores?");
      Scanner scan = new Scanner(System.in);
      int input = scan.nextInt();
      System.out.println(input);
      double examscore = 0.0;
      if(input == 1){
         examscore = SAT();
      }else if(input == 2){
         examscore = ACT();
      }
      double gpascore = GPA();
      double score = examscore + gpascore;
      return score;
   }
   public static double SAT(){
      Scanner scan = new Scanner(System.in);
      System.out.print("SAT math? ");
      int satmath = scan.nextInt();
      System.out.print("SAT critical reading? ");
      int satread = scan.nextInt();
      System.out.print("SAT writing? ");
      int satwrite = scan.nextInt();
      double satscore = (2.0 * satmath + satread + satwrite)/32;
      System.out.println("exam score = " + satscore);
      return satscore;
   }
   public static double ACT(){
      Scanner scan = new Scanner(System.in);
      System.out.print("ACT English? ");
      int actenglish = scan.nextInt();
      System.out.print("ACT math? ");
      int actmath = scan.nextInt();
      System.out.print("ACT reading? ");
      int actread = scan.nextInt();
      System.out.print("ACT science? ");
      int actscience = scan.nextInt();
      double actscore = (2 * actmath + actenglish + actread + actscience)/1.8;
      System.out.println("exam score = " + actscore);
      return actscore;
   }
   public static double GPA(){
      Scanner scan = new Scanner(System.in);
      System.out.print("overall GPA? ");
      double overgpa = scan.nextDouble();
      System.out.print("max GPA? ");
      double maxgpa = scan.nextDouble();
      System.out.print("Transcript Multiplier? ");
      double transmult = scan.nextDouble();
      double gpascore = (overgpa/maxgpa) * 100 * transmult;
      System.out.print("GPA Score = " + gpascore);
      return gpascore;
   }
   public static void compare(double s1, double s2){
      System.out.println("First applicant overall score = " + s1);
      System.out.println("Second applicant overall score = " + s2);
      if(s1 > s2){
         System.out.println("The first applicant seems to be better");
      }else if(s2 > s1){
         System.out.println("The second applicant seems to be better");
      }else{
         System.out.println("It's a tie.  Whoever wins a FT3 in SFVAE gets in!");
      }
   }



}