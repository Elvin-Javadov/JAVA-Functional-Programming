package assignments;

public class Fibonacci {
    public static void main(String args[]) {
        Fibonacci(10);
    }
//fibonnaci eto kogda 3 cifra ravna summer predidushix 2. 0+1=1 1+2=3 2+3=5 3+5=8 5+8=13 8+13=21 13+21=34 i t.d.
    public static void Fibonacci(int num) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}

