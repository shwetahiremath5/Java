//package basics;

class rectangle{
    int l;
    int b;
    public void setl_b(int l,int b){
        this.l=l;
        this.b=b;
    }
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
public class rectange {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.setl_b(4,9 );
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
