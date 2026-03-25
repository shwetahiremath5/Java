//package basics;

class InnerEmployee {
int sal;
String name;

public int getsal(){
    return sal;
}
public String getname(){
    return name;
}
public void setName(String n){
    name=n;
}
    
}
public class Employee {
    public static void main(String[] args) {
        InnerEmployee shwe=new InnerEmployee();
        shwe.sal=3902992;
       System.out.println(shwe.getsal());
        shwe.setName("shweta");
        System.out.println(shwe.getname());
    }
}
