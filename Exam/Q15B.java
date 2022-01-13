
class Q15B {
    public static void main(String[] args) {
        HoldGood h = new HoldGood();
        h.show();
        h.show("Good Morning");
        System.out.println(h.area(24));
        System.out.println(h.area(10, 20));
    }    
}

class HoldGood{
    void show(){
        System.out.println("This is Show");
    }
    void show(String s){
        System.out.println(s);
    }

    int area(int l){
        int ans = l*l;
        return ans;
    }

    int area(int l, int b){
        int ans = l*b;
        return ans;
    }
}
