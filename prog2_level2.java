import java.util.*;
class level2_2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age, sex(m or f) and your marital status(y or n)");
int age = sc.nextInt();
String s = sc.next();
String m = sc.next();
if( s.equals("f"))
	System.out.println("Employee will work in Urban areas only");
else if(s.equals("m") && age>=20 && age<40)
	System.out.println("Employee may work any where");
else if(s.equals("m") && age>=40 && age<60)
	System.out.println("Employee will work in urban areas only");
else
	System.out.println("Error");
}
}