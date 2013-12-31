package com.msdb.database;

import java.io.FileNotFoundException;

public class Load {

	public static void main(String[] args) throws FileNotFoundException {
		
		String prefix = "[MSDB] ";
		System.out.println(prefix + "Loaded, ready to create databases?:D");
		MSDB.createDatabase();
	}
	
	
}
