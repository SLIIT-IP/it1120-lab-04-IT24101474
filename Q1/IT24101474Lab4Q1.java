import java.util.Scanner; 

public class IT24101474Lab4Q1 { 

public static void main (String[]args) 

{ 

Scanner scanner = new Scanner(System.in); 

int number; 

  

System.out.print("Enter a number: "); 

number=scanner.nextInt(); 

  

if (number>0){ 

System.out.print("The number is: Positive"); 

} 

  

else if (number<0){ 

System.out.print("The number is: Negative"); 

} 

  

else if (number==0) 

{ 

System.out.print("The number is: Zero"); 

} 

  

scanner.close(); 

} 

} 