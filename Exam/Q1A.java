import java.util.*;

class Ass9_Q2{
	public static void main(String[] args){
		int[] arr={1,2,3,4};
		String s="java";
		Scanner sc=new Scanner(System.in);
        
		try{
			System.out.println("Enter Array index ");
			int n=sc.nextInt();
			System.out.println(arr[n]);
			System.out.println("Enter String index ");
			int m=sc.nextInt();
			System.out.println(s.charAt(m));
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("Warning:ArrayIndexOutOfBoundsException");
		}catch(StringIndexOutOfBoundsException  se){
			System.out.println("StringIndexOutOfBoundsException");
		}
        sc.close();
	}
}