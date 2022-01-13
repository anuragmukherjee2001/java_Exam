
class Q5B {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        ChildOne c1=new ChildOne();
        c1.show();
        ChildTwo c2 = new ChildTwo();
        c2.show(); 
        ChildThree c3 = new ChildThree();
        c3.show(); 
    }    
}

class Parent{
    void show(){
        System.out.println("This show is in parent class");
    }
}

class ChildOne extends Parent{
    void show(){
        System.out.println("This show is in Child One class");
    }
}

class ChildTwo extends Parent{
    void show(){
        System.out.println("This show is in Child Two class");
    }
}

class ChildThree extends Parent{
    void show(){
        System.out.println("This show is in Child Three class");
    }
}


