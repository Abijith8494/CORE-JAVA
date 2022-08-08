  public class TestStudent {

    public static void main(String[] args){

        Student Stu1[]= new Student[10];
        Student Stu2[]= new Student[10];

        Stu2[0] =new Student("Michele",26,"Italy");
        Stu2[0].setInfo();
        System.out.println();

        Stu2[1]= new Student("John",25,"America");
        Stu2[1].setInfo();
        System.out.println();

       Stu1[2]=new Student("Gloria",20);
        Stu1[2].setInfo();
        System.out.println();

        Stu1[3]=new Student("Alice",22);
        Stu1[3].setInfo();
        System.out.println();

        Stu1[4]=new Student("Joe",18);
        Stu1[4].setInfo();
        System.out.println();

        }
    }