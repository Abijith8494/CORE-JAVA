public class smallarge{
public static void main(String[] args){
int n[]=new int[]{88,4,34,444,3434,4324,2,4};
int small=n[0];
int large=n[0];
for(int i=1;i<n.length;i++){
if(n[i]>large)
large=n[i];
else if(n[i]<small)
small=n[i];
}
System.out.println("largest: "+large);
System.out.println("smallest:"+small);
}
}