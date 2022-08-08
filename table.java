//wap to take input from user and prints it multiplication table

import java.util.Scanner;
public class table {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMER:");
int n=s.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"= "+n*i);
}
}
}