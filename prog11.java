import java.util.*;
class prog11
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any character");
char c = sc.next().charAt(0);
if(Character.isLetter(c))
{
if(Character.isUpperCase(c))
	System.out.println("Character is UpperCase");
else
	System.out.println("Character is LowerCase");
}

}
}
