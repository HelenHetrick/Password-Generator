import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {

    Scanner scan=new Scanner(System.in);

 System.out.println("Welcome to the password generator!");

      System.out.println("Please select the type of pasword you would like to generate!");

    System.out.println("1. Lowercase letters");
     System.out.println("2. Uppercase letters");
    System.out.println("3. Uppercase and Lowercase letters");
    System.out.println("4. Uppercase, Lowercase, and Numbers");
    System.out.println("5. Uppercase, Lowercase, Numbers and Symbols");
    System.out.println("0. Exit");
System.out.println();
    System.out.println("Enter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");


    int passwordType = scan.nextInt();
    
File lowerCase = new File ("lowercase.txt");
PrintWriter inputFile1=new PrintWriter(lowerCase);

         inputFile1.println(" Hello, World!");

inputFile1.close( );
/*
    System.out.println("Do you wish to continue? - Type 0 to exit or select another password option");   //Way to leave


    int optionX = scan.nextInt();
    if (optionX == 0)
    {
      System.out.println("Exiting program...");
      System.exit(0);   //This method exits and ends the program.*/
    }    
  
}