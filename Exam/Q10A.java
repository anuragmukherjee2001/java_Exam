import java.util.Scanner;

class Q10A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        SumOfDigits s = new SumOfDigits();
        int ans = s.sumOfD(n);
        System.out.println(ans);
        sc.close();
    }
}

class SumOfDigits{

    int sumOfD(int n){
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }
}