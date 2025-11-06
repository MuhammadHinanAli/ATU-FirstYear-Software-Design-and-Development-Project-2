import java.util.Scanner;
import java.io.*;

public class MuhammadHinanAliQuestion2
{
	public static void main(String[] args) throws IOException // required for java.io
	{
     // Create a Scanner object for keyboard input.
	 Scanner keyboard = new Scanner(System.in);

	 int lineOutput;

	 // Get the filename.
	 System.out.print("Enter filename of the file to be read (add .txt with filename) : ");
	 String filename = keyboard.nextLine();

	 // Scanner instance
	 File myFile = new File(filename);

	 // Use Scanner to read from the file
	 Scanner inputFile = new Scanner(myFile);

	 // Line Output
	 System.out.print("Line Output (output every nth line): ");
	 lineOutput = keyboard.nextInt();

	 //////////// READ AND OUTPUT ////////////
	 String myVariable;

	 while(inputFile.hasNext())
	 {
	  myVariable = inputFile.nextLine();
	  System.out.println(myVariable);
	 }

	 ////////////// CLOSE FILE //////////////
	 inputFile.close();

     }// method
}// class