import java.util.*;
class perfectsqr
{
static void perfectSquares(int l, int r)
{
for (int i = l; i <= r; i++)
{
if (Math.sqrt(i) == (int)Math.sqrt(i))
System.out.print(i + " ");
}
}
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter lower number: ");
int l=sc.nextInt();
System.out.println("Enter upper number: ");
int r=sc.nextInt();
perfectSquares(l, r);
}
}
