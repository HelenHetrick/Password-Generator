import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {

    Scanner scan=new Scanner(System.in);


//Create the Files
File lower = new File ("Lower.txt");
PrintWriter inputFile1=new PrintWriter(lower);
for(int i=0; i<1000; i++)
{
  inputFile1.print((int)((Math.random()*26)+97) + " ");
}
inputFile1.close( );


File upper = new File ("Upper.txt");
PrintWriter inputFile2=new PrintWriter(upper);
for(int i=0; i<1000; i++)
{
  inputFile2.print((int)((Math.random()*26)+65) + " ");
}
inputFile2.close( );


File mixedLetters = new File ("Mixed_letters.txt");
PrintWriter inputFile3=new PrintWriter(mixedLetters);
int x;
for(int i=0; i<1000; i++)
{
  x=(int)(Math.random()*2);
  if(x==0)
{
  inputFile3.print((int)((Math.random()*26)+97) + " ");
}
else
{
  inputFile3.print((int)((Math.random()*26)+65) + " ");

}
}
inputFile3.close( );


File mixedLettersNumbers = new File ("Mixed_letters_numbers.txt");
PrintWriter inputFile4=new PrintWriter(mixedLettersNumbers);
int y;
for(int i=0; i<1000; i++)
{
  y=(int)(Math.random()*3);
  if(y==0)
{
  inputFile4.print((int)((Math.random()*26)+97) + " ");
}
else if(y==1)
{
  inputFile4.print((int)((Math.random()*26)+65) + " ");

}
else
{
  inputFile4.print((int)((Math.random()*10)+48) + " ");
}
}
inputFile4.close( );


File mixedChars = new File ("Mixed_chars.txt");
PrintWriter inputFile5=new PrintWriter(mixedChars);
for(int i=0; i<1000; i++)
{
  inputFile5.print((int)((Math.random()*94)+33) + " ");
}
inputFile5.close( );


//Creating the arrays
int[] upperInts = new int[1000];
int[] lowerInts = new int[1000];
int[] mixedLetInts = new int[1000];
int[] MixedLetNumInts = new int[1000];
int[] allCharsInts= new int[1000];


Scanner inputFile12=new Scanner(lower);
int lowerx = 0;
while(inputFile12.hasNextInt())
{
upperInts[lowerx] = inputFile12.nextInt();
lowerx++;
}
inputFile12.close();



Scanner inputFile11=new Scanner(upper);
int index = 0;
while(inputFile11.hasNextInt())
{
upperInts[index] = inputFile11.nextInt();
index++;
}
inputFile11.close();

Scanner inputFile13=new Scanner(mixedLetters);
int mixedx = 0;
while(inputFile13.hasNextInt())
{
upperInts[mixedx] = inputFile13.nextInt();
mixedx++;
}
inputFile13.close();


Scanner inputFile14=new Scanner(mixedLettersNumbers);
int mixedLNx = 0;
while(inputFile14.hasNextInt())
{
upperInts[mixedLNx] = inputFile14.nextInt();
mixedLNx++;
}
inputFile14.close();


Scanner inputFile15=new Scanner(mixedChars);
int charsx = 0;
while(inputFile15.hasNextInt())
{
upperInts[charsx] = inputFile15.nextInt();
charsx++;
}
inputFile15.close();



char[] lowerC = new char[26] ;
int ascii = 97;
for(char aa:lowerC)
{
  aa=(char)ascii;
  ascii++;
}

char[] upperC = new char[26] ;
 ascii = 65;
for(char ab:lowerC)
{
  ab=(char)ascii;
  ascii++;

}


 int index3 = 0;
char[] mixedC = new char[52] ;
for(int t=65; t<90; t++)
{
  mixedC[index3]=(char)t;
  index3++;
}
for(int g=97; g<122; g++)
{
   mixedC[index3]=(char)g;
  index3++;
}


char[] mixedNumC = new char[62] ;
 
 index3 = 0;
 for(int u=48; u<=57; u++)
 {
   mixedNumC[index3]=(char)u;
  index3++;
 }
for(int t=65; t<=90; t++)
{
  mixedNumC[index3]=(char)t;
  index3++;
}
for(int g=97; g<=122; g++)
{
   mixedNumC[index3]=(char)g;
  index3++;
}


char[] allCharsC = new char[94] ;
  ascii = 33;
for(char ac:allCharsC)
{
  ac=(char)ascii;
  ascii++;
}
 






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
    

if (passwordType==1)
{
File lower21 = new File ("Lowerpw.txt");
PrintWriter inputFile21=new PrintWriter(lower21);

inputFile21.close( );

}

else if (passwordType==2)
{
File lower22 = new File ("Upperpw.txt");
PrintWriter inputFile22=new PrintWriter(lower22);

inputFile22.close( );
}

else if (passwordType==3)
{
File lower23 = new File ("Mixedpw.txt");
PrintWriter inputFile23=new PrintWriter(lower23);

inputFile23.close( );
}

else if (passwordType==4)
{
File lower24 = new File ("MixedNumpw.txt");
PrintWriter inputFile24=new PrintWriter(lower24);

inputFile24.close( );

}
else
{
System.out.println("You have exited the program.");
}



    System.out.println("Do you wish to continue? - Type 0 to exit or select another password option");   //Way to leave


    int optionX = scan.nextInt();
    if (optionX == 0)
    {
      System.out.println("Exiting program...");
      System.exit(0);   //This method exits and ends the program.
    }    
    }
}