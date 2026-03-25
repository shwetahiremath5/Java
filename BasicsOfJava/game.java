//package basics;

class Tommy{
    public void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing");
    }
}
public class game {
    public static void main(String[] args) {
        Tommy t=new Tommy();
        t.hit();
        t.run();
        t.fire();
        
    }
}
