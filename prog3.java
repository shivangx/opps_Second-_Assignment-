import java.util.*;
class shop
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Quantity.");
double q = sc.nextDouble();
double c = q*100;
if(c>1000)
{
c = c - (0.1)*c;
}
System.out.println("Total cost "+c);
}
}

