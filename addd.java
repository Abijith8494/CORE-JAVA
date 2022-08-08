import java.util.Scanner;
public class addd
{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("enter the string: ");
String x= s.nextLine();
Long p=count(x);
System.out.println("addition is: "+p);

}
public static Long count(String A){
long sum=0;
char [] ch= A.toCharArray();
for(int i=0;i<A.length();i++){
if(Character.isDigit(ch[i])){
sum+=Character.getNumericValue(ch[i]);
}
}

return(sum);
}
}