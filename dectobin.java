import java.util.Scanner;
public class dectobin{
public static void main(String[] args)
{
int dec;
Scanner s = new Scanner(System.in);
System.out.print("Enter dec number: ");
dec=s.nextInt();
String bin=Integer.toBinaryString(dec);
System.out.print("binary: "+bin);


}
}
