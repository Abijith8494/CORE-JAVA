// wap to take input from user and print the area and perimeter of a circle

import java.util.Scanner;
public class area{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE RADIUS: ");
int r=s.nextInt();
double perimeter=2*Math.PI*r;
double area=Math.PI*r*r;
System.out.println("PERIMETER= "+perimeter);
System.out.println("AREA= "+area);
}
}