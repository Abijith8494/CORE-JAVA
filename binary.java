import java.util.Scanner;
public class binary{
public static void main (String[] args){
long b1,b2;
int i=0,r=0;
int sum[] = new int[20];
Scanner s = new Scanner(System.in);
System.out.print("Enter 1st binary number: ");
b1=s.nextLong();
System.out.print("Enter 2nd binary number: ");
b2=s.nextLong();
while(b1!=0 || b2!=0)
{

sum[i++]=(int)((b1%10 + b2%10 + r)%2);
r=(int)((b1%10 + b2%10 + r)/2);
b1=b1/10;
b2=b2/10;
}
if(r!=0){
sum[i++]=r;
}
--i;
System.out.println("sum:" );
while(i>=0){
System.out.print(sum[i--]);
}


}
}







