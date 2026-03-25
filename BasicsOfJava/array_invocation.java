public class array_invocation {
    static void change(int a){
        a=8;
    }

    static void change1(int [] a){
        a[0]=899;
    }
    public static void main(String[] args) {
        int x=49;
        change(x);
        System.out.println("the value of x after calling change:"+x);

        //changing the array
    int [] arr={46,34,56,86,24};   //arr is just a reference it only stores the address
    change1(arr);
    System.out.println(arr[0]);
    }
}
