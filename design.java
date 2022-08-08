/*wap to display the following 
 *****
 ****
 ***
 **
 *    */


import java.util.Scanner;
public class design{
public static void main(String[] args)
{
int row=5,i,j;
for(i=5;i>=1;--i)
{
for(int space=0;space<=row-i;++space)
{
System.out.print(" ");
}
for(j=i;j<=2*i-1;++j)
{
System.out.print("*");
}
for(j=0;j<i-1;++j)
{
System.out.print("*");
}
System.out.println();
}
}
}

