import java.util.*;
class prog_8
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of classes held and number of classes attended by the student.");
int h = sc.nextInt();
int a = sc.nextInt();
double p = ((double)a/(double)h)*100;
if(p>(double)75)
{
System.out.println("The student may sit in the Examinations" +p);
}
else
	System.out.println("Short Attendence" +p);
System.out.println("Do you perhaps have a medical cause?");
String s = sc.next();
if(s.equals('y'))
{
System.out.println("You may sit in the Examinations");
}
else
{
System.out.println("Not allowed at all");
}
}
}

