import java.util.*;
class mutable{
	public static void main(String args[]){
   		String  str1 = new String("I am immutable");
		str1.concat("and not mutable");
		StringBuffer sb1 = new StringBuffer("I am mutable");
		sb1.append(" I am not immutable");
		System.out.println("\n"+str1);
		System.out.println("\n"+sb1);
	}
}