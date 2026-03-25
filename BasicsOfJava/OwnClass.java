//package basics;

class Employee{
    int id;
    String name;
    int sal;
    public void display(){
        System.out.println("e_id is:"+id);
        System.out.println("employee name is:"+name);
    }
    public int getsal(){
        return sal;
    }

}
public class OwnClass {
    public static void main(String[] args) {
        System.out.println("hello");
        Employee shwe=new Employee();
        Employee shr=new Employee();
        shwe.id=39;
        shwe.name="shweta";
        shwe.sal=3800;
        shr.id=48;
        shr.name="shree";
        shr.sal=389390;

        shwe.display();
        shr.display();
        int salary=shr.getsal();
        System.out.println(salary);
       // System.out.println(shwe.id);
        //System.out.println(shwe.name);
    }
}
