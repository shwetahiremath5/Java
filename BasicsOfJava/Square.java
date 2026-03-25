//package basics;

class Square1{
    int side;
    //float area;
    //float perimeter;
    public void setside(int a){
        side=a;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Square {
    public static void main(String[] args) {
        Square1 sq=new Square1();
        sq.setside(5);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
