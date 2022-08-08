import java.util.Scanner;
public class counting{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.print("ENTER THE DESIRED STRING: ");
String A=s.nextLine();
count(A);
}
public static void count(String x){
char [] ch=x.toCharArray();
int number=0;
int space=0;
int letter=0;
int other=0;
for(int i=0;i<x.length();i++){
if(Character.isSpace(ch[i])){
space++;
}
else if (Character.isLetter(ch[i])){
letter++;
}
else if(Character.isDigit(ch[i])){
number++;
}

else{
other++;
}
}
System.out.println("THE STRING IS: "+x);

System.out.println("number: "+number);

System.out.println("letters: "+letter);

System.out.println("spaces: "+space);

System.out.println("other: "+other);
}
}