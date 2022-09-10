import java.util.*;
class prog4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter salary and years of service respectively");
double sal = sc.nextInt();
int y = sc.nextInt();
double net;
if(y>5)
{
net = sal + 0.05*sal;
System.out.println("Salary is "+net);
}
else
{
System.out.println("Salary is "+sal);
}
}
}