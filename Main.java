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
int[] mixedLetNumInts = new int[1000];
int[] allCharsInts= new int[1000];


Scanner inputFile11=new Scanner(lower);
int index = 0;
while(inputFile11.hasNextInt())
{
lowerInts[index] = inputFile11.nextInt();
index++;
}
inputFile11.close();



Scanner inputFile12=new Scanner(upper);
 index = 0;
while(inputFile12.hasNextInt())
{
upperInts[index] = inputFile12.nextInt();
index++;
}
inputFile12.close();

Scanner inputFile13=new Scanner(mixedLetters);
int mixedx = 0;
while(inputFile13.hasNextInt())
{
mixedLetInts[mixedx] = inputFile13.nextInt();
mixedx++;
}
inputFile13.close();


Scanner inputFile14=new Scanner(mixedLettersNumbers);
int mixedLNx = 0;
while(inputFile14.hasNextInt())
{
mixedLetNumInts[mixedLNx] = inputFile14.nextInt();
mixedLNx++;
}
inputFile14.close();


Scanner inputFile15=new Scanner(mixedChars);
int charsx = 0;
while(inputFile15.hasNextInt())
{
allCharsInts[charsx] = inputFile15.nextInt();
charsx++;
}
inputFile15.close();



char[] lowerC = new char[1000] ;
int k = 0;
for(int work = 0; work<lowerC.length; work++)
{
lowerC[work] = (char)(lowerInts[k]);
k++;
}


char[] upperC = new char[1000] ;
 k = 0;
for(int work = 0; work<lowerC.length; work++)
{
upperC[work] = (char)(upperInts[k]);
k++;
}

char[] mixedC = new char[1000] ;
 k = 0;
for(int work = 0; work<lowerC.length; work++)
{
mixedC[work] = (char)(mixedLetInts[k]);
k++;
}

char[] mixedNumC = new char[1000] ;
 k = 0;
for(int work = 0; work<lowerC.length; work++)
{
mixedNumC[work] = (char)(mixedLetNumInts[k]);
k++;
}

char[] allCharsC = new char[1000] ;
 k = 0;
for(int work = 0; work<lowerC.length; work++)
{
allCharsC[work] = (char)(allCharsInts[k]);
k++;
}


boolean repeat=true;


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
    
while(repeat==true)
{
if (passwordType==1)
{
  //Set of 8 into password file
  File final21 = new File ("Lowerpw.txt");
PrintWriter inputFile21=new PrintWriter(final21);
for(int l=0; l<(lowerC.length-8); l+=9)
{
  for(int h=l; h<l+9; h++)
  {
     inputFile21.print(lowerC[h]);
  }
    inputFile21.println();

}
  inputFile21.close( );
  System.out.println("View the created file to view several option that match your choice!");
}



else if (passwordType==2)
{
File final22 = new File ("Upperpw.txt");
PrintWriter inputFile22=new PrintWriter(final22);
for( int l=0; l<(upperC.length-8); l+=9)
{
  for(int h=l; h<l+9; h++)
  {
     inputFile22.print(upperC[h]);
  }
    inputFile22.println();

}
inputFile22.close( );
System.out.println("View the created file to view several option that match your choice!");
}

else if (passwordType==3)
{
File final23 = new File ("Mixedpw.txt");
PrintWriter inputFile23=new PrintWriter(final23);
for( int l=0; l<(mixedC.length-8); l+=9)
{
  for(int h=l; h<l+9; h++)
  {
     inputFile23.print(mixedC[h]);
  }
    inputFile23.println();

}
inputFile23.close( );
System.out.println("View the created file to view several option that match your choice!");
}

else if (passwordType==4)
{
File final24 = new File ("MixedNumpw.txt");
PrintWriter inputFile24=new PrintWriter(final24);
for( int l=0; l<(mixedNumC.length-8); l+=9)
{
  for(int h=l; h<l+9; h++)
  {
     inputFile24.print(mixedNumC[h]);
  }
    inputFile24.println();

}
inputFile24.close( );
System.out.println("View the created file to view several option that match your choice!");
}

else if (passwordType==5)
{
File final25 = new File ("AllCharspw.txt");
PrintWriter inputFile25=new PrintWriter(final25);
for( int l=0; l<(allCharsC.length-8); l+=9)
{
  for(int h=l; h<l+9; h++)
  {
     inputFile25.print(allCharsC[h]);
  }
    inputFile25.println();

}
inputFile25.close( );
System.out.println("View the created file to view several option that match your choice!");
}
else
{
System.out.print("You have chosen to exit.");
}
System.out.println("Do you wish to continue? - Type 0 to exit or select a password option");   //Way to leave

    int optionX = scan.nextInt();
    if (optionX == 0)
    {
repeat=false;
    
    }    

}
          System.out.println("The program has been ended. Thank you :)");
           System.exit(0);   //This method exits and ends the program.

    }
}