import java.util.Scanner;

class Q4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String s = sc.nextLine();
        SortString obj = new SortString();
        String[] ans = obj.sortStr(s);
        int len = ans.length;
        System.out.println(len);
      obj.sortEle(ans, len);
      System.out.println("The sorted array is : ");
      for (int i=0; i<len; i++)
      System.out.print(ans[i]+" ");
      sc.close();
    }    
}

class SortString{
    String[] sortStr(String s){
        String strArray[] = s.split(" ");
        return strArray;
    }

    void sortEle(String []ans, int n){
        for (int i=1 ;i<n; i++){
            String temp = ans[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < ans[j].length()){
               ans[j+1] = ans[j];
               j--;
            }
            ans[j+1] = temp;
         }
    }
    
}