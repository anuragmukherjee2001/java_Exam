import java.util.Scanner;

class Q6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        
        System.out.println("Enter second number");
        int y = sc.nextInt();

        GCDCalc obj = new GCDCalc();
        int ans = obj.GCD(x,y);

        System.out.println(ans);

        sc.close();
    }
}

class GCDCalc{
    int GCD(int a, int b){
        if (a == 0)
          return b;
        if (b == 0)
          return a;

        if (a == b)
            return a;

        if (a > b)
            return GCD(a-b, b);
        return GCD(a, b-a);
    }
}