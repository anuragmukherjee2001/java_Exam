import java.util.Scanner;

class Q14A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String Fnames = sc.nextLine();
        System.out.println("Enter the middle name");
        String Mname = sc.nextLine();
        System.out.println("Enter the Last name");
        String Lname = sc.nextLine();
        System.out.println("Enter the roll");
        String roll = sc.nextLine();

        int n = roll.length();

        Password p = new Password();
        String ans = p.pass(FNames, Mname, Lname, roll, n);
        System.out.println(ans);
        sc.close();
    }    
}

class Password{
    String pass(String FName, String Mname, String Lname, String roll, int n){
        String ans = FName.substring(0,1) + Mname.substring(0, 1) + Lname.substring(0,1) + roll.substring(n - 4, n);
        return ans;
    }
}