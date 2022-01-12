import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        AlphabeticalOrder ao = new AlphabeticalOrder();
        char[] ans = ao.alphaOrder(s);
        System.out.println(ans);
        sc.close();
    }
}

class AlphabeticalOrder {
    char[] alphaOrder(String s) {

        char arr[] = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
         return arr;
        //System.out.println(arr);
    }
}