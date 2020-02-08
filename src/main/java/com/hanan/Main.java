package com.hanan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	System.out.print("Thiss will print what you enter in reverse \n");
    	System.out.print("Enter something");
    	Scanner scanner = new Scanner(System.in);
    	String inputstring = scanner.nextLine();
    	StringBuilder sb = new StringBuilder(inputstring);
    	System.out.println(sb.reverse().toString());

    }
}

/*
import java.util.Scanner;

public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		System.out.print("This will print your name in reverse \n");
		System.out.print("Enter your name : ");
		Scanner scanner = new Scanner(System.in);
		String inputstring = scanner.nextLine();
		StringBuilder sb = new StringBuilder(inputstring);
		System.out.println("Your name is : \n");
		System.out.println(sb.reverse().toString());
	}
}

 */



