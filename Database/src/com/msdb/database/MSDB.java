package com.msdb.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MSDB {
	
	public static void createDatabase() throws FileNotFoundException {
		
	      //  prompt the user to enter their name
	      System.out.print("Please enter database name: ");
	      
	      //  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String dbName = null;
	      //  read the username from the command-line; need to use try/catch with the
	      //  readLine() method
	      try {
	         dbName = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your database name!");
	         System.exit(1);
	      }
	      
	      System.out.println("Creating new database, " + dbName + "!");
	      File file = new File("./db/" + dbName + ".msdb");
	      file.getParentFile().mkdirs();
	      PrintWriter writer = new PrintWriter("./db/" + dbName + ".msdb");
        writer.println("new database " + dbName);
        System.out.println("Creating table Users! [Default]");
        writer.println("# To add a table, simply make one like this, removing the #");
        writer.println("# Hashtags/Pound signs indicate a notice, don't read these.");
        writer.println(">> Table Users");
        writer.println("> ID / User / Email / Password;");
        writer.println("- 1 / Santa / santa@lapland.com / Reindeer;");
        writer.println("- 2 / Rudolf / Rudolf@lapland.com / BigredNose;");
        writer.println("##########################");
        writer.println("# Here's some friendly tips:");
        writer.println("# # = A note.");
        writer.println("# >> = A new table.");
        writer.println("# > = The demonstration line of a table. Showing the names of each column.");
        writer.println("# / = Next bit of information. // to leave blank.");
        writer.println("# (you can have an infinite amount of tables in a database!)");
	    writer.close();
		
	      System.out.println("Done! Now start hacking at it to your heart's content.");
	}

}
