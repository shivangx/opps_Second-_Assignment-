import java.util.*;
class level2_3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number.");
int n = sc.nextInt();
int d, rev=0;
while(n!=0)
{
d = n%10;
n = n/10;
rev = rev*10 + d;
}
System.out.println("Reverse of the number is "+rev);
}
}