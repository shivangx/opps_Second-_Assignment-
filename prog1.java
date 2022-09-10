import java.util.*;
class rectangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Length and Breadth of the rectangle:");
int l = sc.nextInt();
int b = sc.nextInt();
if(l == b)
{
System.out.println("This rectangle is a Square.");
}
else
{
System.out.println("This rectangle is not a Square.");
}
}
}

