import java.util.Scanner;
public class bintodec{
public static void main(String[] args){
String bin;
Scanner s = new Scanner(System.in);
System.out.print("Enter binary number: ");
bin=s.next();
int dec= Integer.parseInt(bin,2);
System.out.print("decimal: "+dec);
}
}