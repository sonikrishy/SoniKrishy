import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File readFile = new File("/Users/soniya/Documents/Eclipse_workspace/Read.txt"); 
		//java has a class called File
		//File is constructor
		//has no methods for reading, writing into a file
		//has some operations on file
		
		//special class called scanner, reading file line by line
		
	/*	try
		{
			Scanner r = new Scanner(readFile);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		*/
	//or
		Scanner r = new Scanner(readFile);
		while (r.hasNext())
			System.out.println(r.nextLine());
	
	File writeFile = new File("/Users/soniya/Documents/Eclipse_workspace/Write.txt");
	
	//use class PrintWriter
	PrintWriter w = new PrintWriter(writeFile);
	
	w.println("My first string.");
	w.println("My second string.");
	w.println("My third string.");
	w.close();
	}
}
