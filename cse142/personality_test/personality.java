import java.util.Scanner;
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.lang.Math;

public class personality{
	public static void main(String[] args)throws FileNotFoundException{
		test();
	}

	//1, 8, 15, 22 are extrovert/introvert (separated by 7)
	//2, 3, 9, 10, 16, 17 are sensing and intuition (groups of 2 at multiples of 7 + 2)
	//4, 5, 11, 12, 18, 19 are thinking and feeling (groups of 2 at multiples of 7 + 4)
	//6, 7, 13, 14, 20, 21 are judging and perceiving (groups of 2 at multiples of 7 + 6)
	//70 total
	//Split into 10 groups?

	public static void test() throws FileNotFoundException{
		System.out.print("input file name? ");
		Scanner scan = new Scanner(System.in);
		String inputFile = scan.next();
		System.out.print("output file name? ");
		String outputFile = scan.next();
		readFile(inputFile, outputFile);
	}

	public static void readFile(String input, String output) throws FileNotFoundException{
		Scanner scan = new Scanner(new File(input));
		int[] percent = {0, 0, 0, 0};
		PrintWriter writer = new PrintWriter(output);
		while(scan.hasNext()){
			String name = scan.nextLine();
			String results = scan.nextLine();
			double[] rates = resultSplit(results);
			for(int i = 0; i < 4; i++){
				double percentage = rates[(i * 2) + 1] / (rates[i * 2] + rates[(i * 2) + 1]);
				percent[i] = (int) Math.round(percentage * 100);
			}
			String arrayPercent = Arrays.toString(percent);
			String analysis = analyze(percent);
			System.out.println(name + ": " + arrayPercent);
			writer.println(name + ": " + arrayPercent + " = "+ analysis);
		}
		writer.close();
	}

	public static String analyze(int[] percent){
		String analysis = "";
		String[] aresults = {"E", "S", "T", "J"};
		String[] bresults = {"I", "N", "F", "P"};
		//A vs B
		//E vs I
		//S vs N
		//T vs F
		//J vs P
		for(int i = 0; i < 4; i++){
			if(percent[i] < 50){
				analysis += aresults[i];
			}else if(percent[i] > 50){
				analysis += bresults[i];
			}else{
				analysis += "X";
			}
		}
		System.out.println(analysis);
		return analysis;
	}

	public static double[] resultSplit(String results){
		double[] result = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

		System.out.println(results);
		for(int i = 0; i < 10; i++){
			for(int x = 0; x < 7; x++){
				int y = (i * 7) + x;
				if(x == 0){
					if(Character.toUpperCase(results.charAt(y)) == 'A'){
						result[0] += 1.0;
					}else if(Character.toUpperCase(results.charAt(y)) == 'B'){
						result[1] += 1.0;
					}
				}else if(x <= 2){
					if(Character.toUpperCase(results.charAt(y)) == 'A'){
						result[2] += 1.0;
					}else if(Character.toUpperCase(results.charAt(y)) == 'B'){
						result[3] += 1.0;
					}
				}else if(x <= 4){
					if(Character.toUpperCase(results.charAt(y)) == 'A'){
						result[4] += 1.0;
					}else if(Character.toUpperCase(results.charAt(y)) == 'B'){
						result[5] += 1.0;
					}
				}else if(x <= 6){
					if(Character.toUpperCase(results.charAt(y)) == 'A'){
						result[6] += 1.0;
					}else if(Character.toUpperCase(results.charAt(y)) == 'B'){
						result[7] += 1.0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

}