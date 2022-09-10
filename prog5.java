import java.util.*;
class prog5
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks");
int marks = sc.nextInt();
if(marks<25)
	System.out.println("Grade is F");
if(marks>25 && marks<45)
	System.out.println("Grade is E");
if(marks>=45 && marks<50)
	System.out.println("Grade is D");
if(marks>=50 && marks<60)
	System.out.println("Grade is C");
if(marks>=60 && marks<=80)
	System.out.println("Grade is B");
if(marks>80)
	System.out.println("Grade is A");
}
}