import java.util.*;
class prog6
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age of first,second and third person respectively.");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b && a>c)
	System.out.println("First person having the age "+a+" is the oldest");
else if(b>a && b>c)
	System.out.println("Second person having the age "+b+" is the oldest");
else
	System.out.println("Third person having the age "+c+" is the oldest");
}
}