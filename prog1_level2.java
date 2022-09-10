import java.util.*;
class level2_1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Year");
int y = sc.nextInt();
if(y%400 == 0  || ((y%4 ==0 ) && y%100 != 0))
	System.out.println("Entered year is a leap year");
else
	System.out.println("Entered year is not a leap year");
}
}
