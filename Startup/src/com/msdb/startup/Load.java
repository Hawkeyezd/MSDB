package com.msdb.startup;

import java.io.FileNotFoundException;

public class Load {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String prefix = "[MSDB] ";
		
		System.out.println(prefix + "Welcome to Mineslash Database setup!");
		System.out.println(prefix + "This system is designed for domestic or office based work- not for websites and alike!");
		System.out.println("[10]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[9]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[8]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[7]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[6]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[5]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[4]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[3]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[2]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("[1]");
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		MSDB.createServer();
		MSDB.createReadMe();
		System.out.println("[Launch Off! This windows automatically shuts after 20 seconds...]");
		try {
		    Thread.sleep(20000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}

}
