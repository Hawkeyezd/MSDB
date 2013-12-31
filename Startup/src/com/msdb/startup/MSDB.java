package com.msdb.startup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MSDB {
	
	public static void createServer() throws FileNotFoundException {
		
		File file = new File("./db/welcome.txt");  
		file.getParentFile().mkdirs();
		PrintWriter output = new PrintWriter(file);  
		output.print("Welcome to MSDB! We hope you enjoy using our system. We've tried very hard to ensure it's the best and worth your time.");
       output.println(" Here's some friendly tips:");
       output.println("# = A note.");
       output.println(">> = A new table.");
       output.println("> = The demonstration line of a table. Showing the names of each column.");
       output.println("/ = Next bit of information. // to leave blank.");
       output.println("(you can have an infinite amount of tables in a database!)");
		output.close();  
		
	}
	
	public static void createReadMe() throws FileNotFoundException {
		File f = new File("README.txt");
		PrintWriter output = new PrintWriter("README.txt");  
		output.print("[ReadMe File, needs writing by Martin. Lazy twat.");
		output.close();  
		
	}

}
