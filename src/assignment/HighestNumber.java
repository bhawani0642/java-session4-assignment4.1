package assignment;
//import the Scanner class
import java.util.Scanner;
public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the three variables
int num1;
int num2;
int num3;
System.out.println("Enter the three numbers");
Scanner sc= new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
//Use control flow if statement
if(num1>num2 && num1>num3)
	System.out.println("num1 is the largest");

else if(num2>num1 && num2>num3)
	System.out.println("num2 is the largest");
else if(num3>num1 && num3>2)
	System.out.println("num3 is the largest");
}
	
	}


