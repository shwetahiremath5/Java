//package basics;

class CellPhone{
public void ringing(){
    System.out.println("phone is ringing....");
}
public void vibrating(){
    System.out.println("phone is vibrating...");
}
}
public class Phone {
    public static void main(String[] args) {
        CellPhone v=new CellPhone();
        v.ringing();
        v.vibrating();
    }
}
