package recursion;

public class pow {
    public static void main(String[] args) {
        System.out.println(mypower(2,2));
        fibonacci(0,1,10);
    }

    private static int mypower(int i, int i1) {
        if(i1==0){
            return 1;
        }
        int res = mypower(i,i1-1);
        int f = i*res;
        return f;
    }

    public static void fibonacci(int a, int b, int n) {
        if (n==0){
            return;
        }
        System.out.print(a +" ");
        int c = a+b;
        fibonacci(b, c, n-1);

    }
}
