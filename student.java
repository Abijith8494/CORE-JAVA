public class Student {
    private String Name;
    private int age;
    private String adress;

    public Student(String name, int age) {
        this.Name = name;
        this.age =age ;
    }
    public Student() {
        this.Name = "Unknown";
        this.age = 0;
        this.adress = "Not available";
    }
    public  Student(String Name, int age, String adress) {
        this.Name = Name;
        this.age = age;
        this.adress = adress;
    }

    public void setName(){
        this.Name= Name;
    }
    public String getName(){
        return Name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public void setInfo(){
        System.out.printf("%s,%s,%s",Name,age,adress);}

    public void setInfo(String name,int age ){
        System.out.printf("%s,%s,%s",Name,age);
    }}    

   
    